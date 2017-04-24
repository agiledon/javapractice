package zhangyi.insight.frameworks.spring.di.componentscan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;


/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*
                                                                   */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/application.xml")
public class MovieListerTest {
    @Autowired
    private MovieLister movieLister;

    @Test
    public void should_use_default_movie_finder() {
        assertThat(movieLister.moviesDirectedBy("zhang yimou").size()).isEqualTo(1);
    }


}