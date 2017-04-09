package zhangyi.insight.frameworks.mybatis;/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*                                                                      */


import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BlogMapper {
    @Select("select * from blogs where id = #{id}")
    Blog selectBlog(String id);

    @Select("select * from blogs")
    List<Blog> selectAll();
}
