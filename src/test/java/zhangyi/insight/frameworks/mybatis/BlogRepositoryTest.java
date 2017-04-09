package zhangyi.insight.frameworks.mybatis;

import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class BlogRepositoryTest {
    @Test
    public void should_find_blog_by_id() throws IOException {
        String blogId = "d6da80bf-4100-45c5-86c7-6ca57e0f7609";
        BlogRepository repository = new BlogRepository();
        assertThat(repository.find(blogId).get().getAuthor()).isEqualTo("张逸");
    }

    @Test
    public void should_find_all_blogs() throws IOException {
        BlogRepository repository = new BlogRepository();
        assertThat(repository.findAll().get().size()).isEqualTo(10);
    }
}