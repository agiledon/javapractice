package zhangyi.insight.java8.lambda;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*                                                                      */
public class OrchardTest {
    @Test
    public void should_filter_with_green_color() {
        Orchard orchard = new Orchard();
        List<Apple> apples = orchard.filterGreenApples();

        apples.forEach(System.out::println);

    }
}