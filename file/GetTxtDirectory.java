package file;

import java.io.File;

public class GetTxtDirectory {

    public  boolean isTxtDirectory(File dir, String name){
        File src=new File(dir,name);
        return src.isFile() && name.endsWith(".txt");
    }

}
