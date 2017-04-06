package zhangyi.insight.advance.io;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*                                                                      */
public class WordCounterTest {
    @Test
    public void should_count_words() {
        List<String> lines = new ArrayList<>();
        lines.add("I love java");
        lines.add("I love programming");
        lines.add("I am developer");
        lines.add("I love java");
        lines.add("I love java");
//        Map<String, Integer> countResult = WordCounter.count(lines);
//        assertThat(countResult.get("i"), is(5));
//        assertThat(countResult.get("java"), is(3));
//        assertThat(countResult.get("developer"), is(1));


    }

}