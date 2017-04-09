package zhangyi.insight.frameworks.redis;/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*                                                                      */

import com.lambdaworks.redis.RedisConnection;

public interface RedisCommand<T> {
    T execute(RedisConnection<String, String> connection);
}
