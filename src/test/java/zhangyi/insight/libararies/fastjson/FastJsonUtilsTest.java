package zhangyi.insight.libararies.fastjson;

import org.junit.Test;
import zhangyi.insight.refactor.deduplication.Gender;
import zhangyi.insight.refactor.deduplication.Person;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FastJsonUtilsTest {
    @Test
    public void should_serialize_java_object_to_string() {
        Person person = new Person();
        person.setName("bruce");
        person.setAge(30);
        person.setGender(Gender.Male);

        assertThat(FastJsonUtils.object2Json(person), is("{\"age\":30,\"gender\":\"Male\",\"name\":\"bruce\"}"));
    }

    @Test
    public void should_deserialize_json_string_to_java_class() {
        String json = "{\"age\":30,\"gender\":\"Male\",\"name\":\"bruce\"}";
        Person person = FastJsonUtils.json2Object(json, Person.class);

        assertThat(person.getName(), is("bruce"));
        assertThat(person.getGender(), is(Gender.Male));
    }
}