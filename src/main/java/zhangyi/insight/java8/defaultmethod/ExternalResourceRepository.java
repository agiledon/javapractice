package zhangyi.insight.java8.defaultmethod;

public interface ExternalResourceRepository {
    default ExternalResource fetch() {
        return null;
    }
}
