package zhangyi.insight.excercise;/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*                                                                      */

import java.util.ArrayList;
import java.util.List;

public class FakeStockService extends StockService {
    @Override
    public List<Double> getStockPrice(String stockName) {
        List<Double> result = new ArrayList<>();
        result.add(100d);
        result.add(200d);
        result.add(300d);
        return result;
    }
}
