package zhangyi.insight.libararies.httpclient;

import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


public class HttpClientSampleTest {
    @Test
    public void should_get_content_from_url() throws IOException {
        HttpClientSample clientSample = new HttpClientSample();
        String response = clientSample.getContentFrom("http://zhangyi.farbox.com");
        assertThat(response).startsWith("<!DOCTYPE html>")
                            .endsWith("</html>")
                            .contains("post");
    }

    @Test
    public void should_get_content_from_url_via_fluent_api() throws IOException {
        HttpClientSample clientSample = new HttpClientSample();
        String response = clientSample.fluentGet("http://zhangyi.farbox.com");
        assertThat(response).startsWith("<!DOCTYPE html>")
                            .endsWith("</html>")
                            .contains("post");
    }
}