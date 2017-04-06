package zhangyi.insight.excercise;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*                                                                      */
public class StatisticServiceTest {
    @Test
    public void should_get_statistics() {
        List<Double> result = new ArrayList<>();
        result.add(100d);
        result.add(200d);
        result.add(300d);
        result.add(400d);

        StockService mockService = mock(StockService.class);
        when(mockService.getStockPrice("leshi")).thenReturn(result);

        StatisticService service = new StatisticService(mockService);
        Statistic statistic = service.count("leshi");
        assertThat(statistic.getAvg(), is(250d));
    }
}