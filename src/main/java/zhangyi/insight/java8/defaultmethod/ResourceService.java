package zhangyi.insight.java8.defaultmethod;

public class ResourceService implements ExternalResourceRepository, ResourceParser, ExternalResourceEnricher {
    public Resource find() {
        return parse(enrich(fetch(), "info"));
    }
}
