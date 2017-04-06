package zhangyi.insight.basic.staticfactory;/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*                                                                      */

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {
    private Services() {
    } //禁止用户直接调用构造函数

    private static final Map<String, Provider> providers = new ConcurrentHashMap<>();
    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    public static void registerDefaultProvider(Provider provider) {
        registerProvider(DEFAULT_PROVIDER_NAME, provider);
    }

    public static void registerProvider(String name, Provider provider) {
        providers.put(name, provider);
    }

    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    public static Service newInstance(String name) {
        Provider p = providers.get(name);
        if (p == null) {
            throw new IllegalArgumentException("No provider registered with name: " + name);
        }
        return p.newService();
    }
}
