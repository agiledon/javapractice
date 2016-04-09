package zhangyi.insight.java8.optional;

import java.util.Optional;

public class Person {
    private String name;
    private int age;
    private Optional<Car> car;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Optional<Car> getCar() {
        return car;
    }

    public void setCar(Car input) {
        if (input == null) {
            car = Optional.empty();
        }
        car = Optional.of(input);

//        car = Optional.ofNullable(input);
    }


}
