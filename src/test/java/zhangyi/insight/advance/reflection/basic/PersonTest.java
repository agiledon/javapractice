package zhangyi.insight.advance.reflection.basic;

import org.hamcrest.core.IsNot;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.Null;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;

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
        assertThat(person.getClass().getName(), is("zhangyi.insight.advance.reflection.basic.Person"));
    }

    @Test
    public void should_get_interfaces() {
        Class<?>[] intes = pClass.getInterfaces();
        assertThat(intes[0].getName(), is("zhangyi.insight.advance.reflection.basic.Developer"));
    }

    @Test
    public void should_get_all_constructors() {
        Constructor<?>[] constructors = pClass.getConstructors();
        assertThat(constructors[0].getParameterCount(), is(2));
        assertThat(constructors[1].getParameterCount(), is(1));
    }

    @Test
    public void should_create_instance() throws IllegalAccessException, InstantiationException {
        Person person = pClass.newInstance();
        assertNotNull(person);
        assertNull(person.getName());
        assertThat(person.getAge(), is(0));
    }

    @Test
    public void should_create_instance_with_parameters() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Constructor<Person> constructor = pClass.getConstructor(String.class);
        Person person = constructor.newInstance("zhangyi");
        assertNotNull(person);
        assertThat(person.getName(), is("zhangyi"));
        assertThat(person.getAge(), is(0));
    }
}