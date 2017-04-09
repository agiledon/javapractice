package zhangyi.insight.frameworks.mybatis;/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*                                                                      */

import org.apache.ibatis.session.SqlSession;
import zhangyi.insight.frameworks.mybatis.mapper.BlogMapper;
import zhangyi.insight.frameworks.mybatis.model.Blog;
import zhangyi.insight.frameworks.mybatis.utils.MyBatisUtils;

import java.util.List;
import java.util.Optional;

public class BlogRepository {
    public Optional<Blog> find(String blogId) {
        return MyBatisUtils.executeQuery(session -> {
            BlogMapper mapper = session.getMapper(BlogMapper.class);
            return mapper.selectBlog(blogId);
        });
    }

    public Optional<List<Blog>> findAll() {
        return MyBatisUtils.executeQuery(session -> {
            BlogMapper mapper = session.getMapper(BlogMapper.class);
            return mapper.selectAll();
        });
    }

    public void postBlog(Blog blog) {
        MyBatisUtils.executeCommand(session -> {
            BlogMapper mapper = session.getMapper(BlogMapper.class);
            mapper.insertBlog(blog);
        });
    }

    public void removeBlog(String blogId) {
        MyBatisUtils.executeCommand(session -> {
            BlogMapper mapper = session.getMapper(BlogMapper.class);
            mapper.deleteBlog(blogId);
        });
    }
}
