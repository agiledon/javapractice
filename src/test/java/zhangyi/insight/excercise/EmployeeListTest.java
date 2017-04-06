package zhangyi.insight.excercise;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*                                                                      */
public class EmployeeListTest {

    @Test
    public void count_of_list_should_be_1_after_add_one_tester() {
        EmployeeList<Tester> list = new EmployeeList<>();
        list.add(new Tester("zhangyi"));

        assertThat(list.count(), is(1));


    }

    @Test
    public void count_of_list_should_be_0_after_remove_existed_one_tester() {
        EmployeeList<Tester> list = new EmployeeList<>();
        list.add(new Tester("zhangyi"));

        list.remove(new Tester("zhangyi"));
        assertThat(list.count(), is(0));
    }

    @Test
    public void test_collection() {
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        assertThat(numbers[0], is(1));


        Map<String, Integer> keyToValue = new HashMap<>();
        keyToValue.put("first", 1);
        keyToValue.put("second", 2);
        keyToValue.put("third", 3);

        assertThat(keyToValue.getOrDefault("fff", -1), is(-1));

        for (Map.Entry<String, Integer> ks : keyToValue.entrySet()) {
//            System.out.println(ks.getKey());
//            System.out.println(ks.getValue());
        }
    }

    @Test
    public void test() {
        String input = "I love java";
        for (String word : input.split(" ")) {
            System.out.println(word.toLowerCase());
        }


        List<String> lines = new ArrayList<>();
        lines.add("I love java");
        lines.add("I love scala");


        lines.stream()
                .flatMap(line -> toList(line.split(" ")).stream())
                .map(w -> new Tuple<>(w, 1))
                .collect(Collectors.groupingBy(t -> t.getKey().toLowerCase()))
                .forEach((x, y) -> System.out.println(y));
    }

    private class Tuple<K, V> {
        private K key;
        private V value;

        public Tuple(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    public List<String> toList(String[] input) {
        List<String> result = new ArrayList<>();
        for (String str : input) {
            result.add(str);
        }
        return result;
    }
}