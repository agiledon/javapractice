package zhangyi.insight.frameworks.spring.di;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zhangyi.insight.frameworks.spring.di.autowired.MediaPlayer;

import static org.assertj.core.api.Assertions.assertThat;


/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*                                                                      */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Autowired
    private CompactDisc cd;

    @Autowired
    private MediaPlayer player;

    @Test
    public void cd_should_be_not_null() {
        assertThat(cd).isNotNull();
        assertThat(cd.play()).isEqualTo("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles");
    }

    @Test
    public void should_play() {
        assertThat(player.play()).isEqualTo("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles");
    }

}