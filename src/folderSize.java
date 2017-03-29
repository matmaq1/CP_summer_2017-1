/**
 * Created by Mateusz on 29.03.2017.
 */

import java.io.File;

public class folderSize {
    static long Size(File f){
        long s = 0;
        if (f.isFile())
        {
            s+= f.length();

            System.out.println(f.getName()+ " : " + f.length());
        }
        else
        {
            File[] fileList = f.listFiles();
            for (File file: fileList){ // foreach file of type FIle in filelist
                System.out.print("/" + f.getName());
                s+=Size(file);
            }
        }
        return s;
    }
    public static void main(String[] args) {
        //f.length
        String home = System.getProperty("user.dir");
        //String home = System.getProperty("java.io.tmpdir");
        File f = new File(home);
        System.out.println(Size(f) + " bytes");


    }
}
