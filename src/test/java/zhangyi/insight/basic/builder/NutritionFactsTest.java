package zhangyi.insight.basic.builder;

import org.junit.Test;

/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*                                                                      */
public class NutritionFactsTest {
    @Test
    public void should_create_object() {
        NutritionFacts nutritionFacts = new NutritionFacts(240, 8, 100, 0, 35, 27);
        nutritionFacts.print();
    }
}