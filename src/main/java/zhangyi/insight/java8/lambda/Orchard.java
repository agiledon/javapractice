package zhangyi.insight.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Orchard {
    private List<Apple> apples = Arrays.asList(
            new Apple("red", 120),
            new Apple("green", 160),
            new Apple("red", 190),
            new Apple("green", 90),
            new Apple("green", 170)
    );

    public List<Apple> filterGreenApples() {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple : apples) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> filterHeavyApples() {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple : apples) {
            if (apple.getWeight() > 150) {
                result.add(apple);
            }
        }
        return result;
    }

    //considering about guava


}
