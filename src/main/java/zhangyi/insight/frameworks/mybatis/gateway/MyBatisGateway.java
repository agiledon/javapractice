package zhangyi.insight.frameworks.mybatis.gateway;/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*                                                                      */

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MyBatisGateway {
    private List<Class<?>> registeredMappers = new ArrayList<>();

    public void registerMappers(Class<?> ...mapperClasses) {
        for (Class<?> mapperClass : mapperClasses) {
            this.registeredMappers.add(mapperClass);
        }
    }

    public <T> Optional<T> executeQuery(QueryContext<T> context) {
        InputStream inputStream = readConfig();
        if (inputStream == null) {
            return Optional.empty();
        }

        SqlSession session = openSession(inputStream);
        try {
            T result = context.execute(session);
            if (result != null) {
                return Optional.of(result);
            } else {
                return Optional.empty();
            }
        } finally {
            session.close();
        }
    }

    public void executeCommand(CommandContext context) {
        InputStream inputStream = readConfig();
        if (inputStream != null) {
            SqlSession session = openSession(inputStream);
            try {
                context.execute(session);
                session.commit();
            } finally {
                session.close();
            }
        }
    }

    private InputStream readConfig() {
        String resource = "mybatis-config.xml";
        try {
            return Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private SqlSession openSession(InputStream config) {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
        Configuration configuration = sqlSessionFactory.getConfiguration();
        registeredMappers.forEach(mClass -> configuration.addMapper(mClass));
        return sqlSessionFactory.openSession();
    }
}
