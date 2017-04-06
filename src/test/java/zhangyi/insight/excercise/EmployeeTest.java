package zhangyi.insight.excercise;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*                                                                      */
public class EmployeeTest {
    @Test
    public void test_tester() {
        Employee h = new Tester("zhangyi");
        h.setAge(23);

        assertThat(h.getAge(), is(23));
    }
}