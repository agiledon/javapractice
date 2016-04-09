package zhangyi.insight.advance.reflection.composers;

public interface Composer {
    <T> T to(Class<T> tClass);
    void setResourceName(String resourceName);
}
