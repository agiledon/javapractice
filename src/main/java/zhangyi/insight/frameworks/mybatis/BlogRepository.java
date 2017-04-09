package zhangyi.insight.frameworks.mybatis;/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*                                                                      */

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
}
