package thoughtworks.zhangyi.lambda;

import java.util.ArrayList;
import java.util.List;

public class Orchard {
    private List<Apple> apples = new ArrayList<Apple>();

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

}
