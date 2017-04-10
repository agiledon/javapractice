package zhangyi.insight.basic.staticfactory;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ServicesTest {

    private class DefaultProvider implements Provider {

        @Override
        public Service newService() {
            return new Service() {
                @Override
                public void execute() {
                    System.out.println("default service");
                }
            };
        }
    }

    @Test
    public void should_register_and_create_default_service() {
        Services.registerDefaultProvider(new DefaultProvider());
        Service service = Services.newInstance();
        assertThat(service).isNotNull();
    }
}