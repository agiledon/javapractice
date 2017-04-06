package zhangyi.insight.advance.reflection.basic;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class PersonTest {
    private Class<Person> pClass = null;

    @Before
    public void setup() {
        try {
            pClass = (Class<Person>) Class.forName("zhangyi.insight.advance.reflection.basic.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void should_get_class_name() {
        Person person = new Person();
        assertThat(person.getClass().getName()).isEqualTo("zhangyi.insight.advance.reflection.basic.Person");
    }

    @Test
    public void should_get_interfaces() {
        Class<?>[] intes = pClass.getInterfaces();
        assertThat(intes[0].getName()).isEqualTo("zhangyi.insight.advance.reflection.basic.Developer");
    }

    @Test
    public void should_get_all_constructors() {
        Constructor<?>[] constructors = pClass.getConstructors();
        assertThat(constructors[0].getParameterCount()).isEqualTo(2);
        assertThat(constructors[1].getParameterCount()).isEqualTo(1);
    }

    @Test
    public void should_create_instance() throws IllegalAccessException, InstantiationException {
        Person person = pClass.newInstance();
        assertThat(person).isNotNull();
        assertThat(person.getName()).isNull();
        assertThat(person.getAge()).isEqualTo(0);
    }

    @Test
    public void should_create_instance_with_parameters() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Constructor<Person> constructor = pClass.getConstructor(String.class);
        Person person = constructor.newInstance("zhangyi");
        assertThat(person).isNotNull();
        assertThat(person.getName()).isEqualTo("zhangyi");
        assertThat(person.getAge()).isEqualTo(0);
    }
}