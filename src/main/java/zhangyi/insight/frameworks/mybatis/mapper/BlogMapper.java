package zhangyi.insight.frameworks.mybatis.mapper;/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*                                                                      */


import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import zhangyi.insight.frameworks.mybatis.model.Blog;

import java.util.Date;
import java.util.List;

public interface BlogMapper {
    @Select("select * from blogs where id = #{id}")
    Blog selectBlog(String id);

    @Select("select * from blogs")
    List<Blog> selectAll();

    @Insert("insert into blogs (id, title, author, post, createdDate) values (#{id}, #{title}, #{author}, #{post}, #{createdDate})")
    void insertBlog(Blog blog);

    @Delete("delete from blogs where id = #{id}")
    void deleteBlog(String id);
}
