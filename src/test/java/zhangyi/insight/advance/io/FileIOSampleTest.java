package zhangyi.insight.advance.io;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*                                                                      */
public class FileIOSampleTest {
    private String filePath = FileIOSampleTest.class.getResource("/FileIOSample.java").getPath();

    @Test
    public void should_read_file_successfully() {
        FileIOSample stream = new FileIOSample();
        List<String> lines = stream.readFromDisk(filePath);
        assertThat(lines.get(0), is("package zhangyi.insight.refactor.extractmethod;"));
    }

    @Test
    public void should_read_file_with_buffered_successfully() {
        FileIOSample stream = new FileIOSample();
        List<String> lines = stream.readFromDiskBuffered(filePath);
        assertThat(lines.get(0), is("package zhangyi.insight.refactor.extractmethod;"));
    }
}