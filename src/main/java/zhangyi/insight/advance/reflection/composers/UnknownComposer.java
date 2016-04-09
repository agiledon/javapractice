package zhangyi.insight.advance.reflection.composers;

public class UnknownComposer implements Composer {
    @Override
    public <T> T to(Class<T> tClass) {
        return null;
    }

    @Override
    public void setResourceName(String resourceName) {

    }
}
