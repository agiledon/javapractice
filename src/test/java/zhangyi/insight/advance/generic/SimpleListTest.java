package zhangyi.insight.advance.generic;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class SimpleListTest {
    @Test
    public void testAdd() {
        Logger log = Logger.getLogger(SimpleListTest.class.getName());

        SimpleList<BigDecimal> sl = new SimpleList<>();
        sl.add(BigDecimal.ONE);
        log.info("SimpleList size is :" + sl.size());
        sl.add(BigDecimal.ZERO);
        log.info("SimpleList size is :" + sl.size());
        sl.clear();
        log.info("SimpleList size is :" + sl.size());
    }
}