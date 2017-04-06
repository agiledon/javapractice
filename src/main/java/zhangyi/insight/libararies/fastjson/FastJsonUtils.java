package zhangyi.insight.libararies.fastjson;/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*                                                                      */

import com.alibaba.fastjson.JSON;

public class FastJsonUtils {
    public static String object2Json(Object obj) {
        return JSON.toJSONString(obj);
    }

    public static <T> T json2Object(String json, Class<T> cls) {
        return JSON.parseObject(json, cls);
    }
}
