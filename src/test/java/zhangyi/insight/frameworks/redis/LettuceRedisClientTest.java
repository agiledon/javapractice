package zhangyi.insight.frameworks.redis;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class LettuceRedisClientTest {
    @Test
    public void should_set_and_get_from_redis() {
        LettuceRedisClient redisClient = new LettuceRedisClient();
        redisClient.set("zy", "http://zhangyi.farbox.com");
        assertThat(redisClient.get("zy")).isEqualTo("http://zhangyi.farbox.com");
    }
}