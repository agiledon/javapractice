package zhangyi.insight.advance.reflection;/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*                                                                      */

import com.google.common.base.CaseFormat;
import com.google.common.base.Joiner;
import com.google.common.io.Files;
import zhangyi.insight.advance.reflection.composers.Composer;
import zhangyi.insight.advance.reflection.composers.UnknownComposer;

import java.util.Map;

import static com.google.common.base.CaseFormat.UPPER_CAMEL;
import static com.google.common.collect.Maps.newHashMap;

public final class Fixture {
    private Fixture() {}

    private static Map<String, Composer> composers = newHashMap();

    public static Composer from(String resourceName) {
        String fileExtension = Files.getFileExtension(resourceName);
        Composer composer = composers.get(fileExtension);
        if (composer == null) {
            composer = createComposer(fileExtension);
            composers.put(fileExtension, composer);
        }
        composer.setResourceName(resourceName);
        return composer;
    }

    @SuppressWarnings("unchecked")
    private static Composer createComposer(String fileExtension) {
        try {
            Class<Composer> aClass = (Class<Composer>) Class.forName(getClassFullName(fileExtension));
            return aClass.newInstance();
        } catch (ClassNotFoundException e) {
            return new UnknownComposer();
        } catch (InstantiationException e) {
            return new UnknownComposer();
        } catch (IllegalAccessException e) {
            return new UnknownComposer();
        } catch (Exception e) {
            return new UnknownComposer();
        }
    }

    private static String getClassFullName(String fileExtension) {
        String fullNamePrefix = "zhangyi.insight.advance.reflection.composers";
        String classNameSuffix = "Composer";
        String classNamePrefix = CaseFormat.LOWER_HYPHEN.to(UPPER_CAMEL, fileExtension);
        return Joiner.on("").join(fullNamePrefix, classNamePrefix, classNameSuffix);
    }
}
