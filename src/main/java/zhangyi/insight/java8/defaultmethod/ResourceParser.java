package zhangyi.insight.java8.defaultmethod;

public interface ResourceParser {
    default Resource parse(ExternalResource resource) {
        return new Resource(String.format("name: %s; info: %s", resource.getName(), resource.getInfo()));
    }
}
