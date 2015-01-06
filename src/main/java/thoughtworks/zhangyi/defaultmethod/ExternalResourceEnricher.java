package thoughtworks.zhangyi.defaultmethod;

public interface ExternalResourceEnricher {
    default ExternalResource enrich(ExternalResource resource, String info) {
        return resource.withInfo(info);
    }
}
