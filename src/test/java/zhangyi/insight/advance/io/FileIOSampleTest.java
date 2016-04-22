package zhangyi.insight.advance.io;

import org.junit.Test;

import java.util.List;

/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*                                                                      */
public class FileIOSampleTest {
    @Test
    public void should_read_file_successfully() {
        FileIOSample stream = new FileIOSample();
        List<String> lines = stream.readFromDisk("/Users/zhangyi/Documents/Training/CodeSample/javapractice/src/main/java/zhangyi/insight/advance/io/FileIOSample.java");
        for (String line : lines) {
            System.out.println(line);
        }
    }

    @Test
    public void should_read_file_with_buffered_successfully() {
        FileIOSample stream = new FileIOSample();
        List<String> lines = stream.readFromDiskBuffered("/Users/zhangyi/Documents/Training/CodeSample/javapractice/src/main/java/zhangyi/insight/advance/io/FileIOSample.java");
        for (String line : lines) {
            System.out.println(line);
        }
    }
}