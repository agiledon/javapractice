package zhangyi.insight.frameworks.spring.di.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/output.xml")
public class OutputContextTest {
    @Resource
    private OutputContext outputContext;

    @Test
    public void should_output_csv_content() {
        assertThat(outputContext).isNotNull();
        assertThat(outputContext.generate()).isEqualTo("csv");
    }
}