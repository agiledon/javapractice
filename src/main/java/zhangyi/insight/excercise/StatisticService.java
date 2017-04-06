package zhangyi.insight.excercise;/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*                                                                      */

import java.util.List;

public class StatisticService {
    private StockService service;

    public StatisticService(StockService service) {

        this.service = service;
    }

    public Statistic count(String stockName) {
        List<Double> prices = service.getStockPrice("leshi");

        double sum = 0.0d;
        for (Double price : prices) {
            sum += price;
        }

        return new Statistic(100d, 10d, sum / prices.size());
    }
}
