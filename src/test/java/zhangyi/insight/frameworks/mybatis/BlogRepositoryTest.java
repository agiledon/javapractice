package zhangyi.insight.frameworks.mybatis;

import org.junit.Test;
import zhangyi.insight.frameworks.mybatis.model.Blog;

import java.io.IOException;
import java.util.Date;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

public class BlogRepositoryTest {

    private final BlogRepository repository = new BlogRepository();

    @Test
    public void should_find_blog_by_id() {
        String blogId = "d6da80bf-4100-45c5-86c7-6ca57e0f7609";
        assertThat(repository.find(blogId).get().getAuthor()).isEqualTo("张逸");
    }

    @Test
    public void should_find_all_blogs() {
        assertThat(repository.findAll().get().size()).isEqualTo(10);
    }

    @Test
    public void should_post_and_remove_blog() {
        String blogId = UUID.randomUUID().toString();

        Blog blog = new Blog();
        blog.setId(blogId);
        blog.setTitle("test");
        blog.setAuthor("test");
        blog.setPost("test");
        blog.setCreatedDate(new Date());

        repository.postBlog(blog);
        assertThat(repository.find(blogId).get().getAuthor()).isEqualTo("test");
        assertThat(repository.findAll().get().size()).isEqualTo(11);

        repository.removeBlog(blogId);
        assertThat(repository.find(blogId).isPresent()).isFalse();
        assertThat(repository.findAll().get().size()).isEqualTo(10);
    }
}