package thoughtworks.zhangyi.lambda;

import java.io.File;
import java.io.FileFilter;

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
