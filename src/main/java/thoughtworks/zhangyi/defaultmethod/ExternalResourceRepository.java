package thoughtworks.zhangyi.defaultmethod;

public interface ExternalResourceRepository {
    default ExternalResource fetch() {
        return null;
    }
}
