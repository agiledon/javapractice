package zhangyi.insight.httpclient;

import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class HttpClientSampleTest {
    @Test
    public void should_get_content_from_url() throws IOException {
        HttpClientSample clientSample = new HttpClientSample();
        String response = clientSample.getContentFrom("http://zhangyi.farbox.com");
        assertThat(response, containsString("<!DOCTYPE html>"));
    }

    @Test
    public void should_get_content_from_url_via_fluent_api() throws IOException {
        HttpClientSample clientSample = new HttpClientSample();
        String response = clientSample.fluentGet("http://zhangyi.farbox.com");
        assertThat(response, containsString("<!DOCTYPE html>"));
    }
}