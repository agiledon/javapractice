package thoughtworks.zhangyi.lambda;

import java.io.File;
import java.io.FileFilter;


/**
 * ::syntax means Java 8 method reference ("use this method as value")
 * or using labmda: file -> file.isHidden()
 */
public class FileOperator {
    public File[] filterHiddenFiles() {
        return new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isHidden();
            }
        });
    }
}
