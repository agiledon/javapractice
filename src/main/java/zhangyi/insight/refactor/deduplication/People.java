package zhangyi.insight.refactor.deduplication;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class People {
    private List<Person> persons = new ArrayList<Person>();

    public List<Person> find(Predicate<Person> matcher) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (matcher.test(person)) {
                result.add(person);
            }
        }
        return result;
    }


    public List<Person> findByAge(int age, String name) {
        return find(p -> p.getAge() >= age && p.getName().equals(name));
    }



}
