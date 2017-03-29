import java.io.File;

/**
 * Created by Mateusz on 29.03.2017.
 */
public class FileManipulation {
    public static void main(String[] args) {
        String home = System.getProperty("user.home");
        System.out.println(System.getProperty("java.io.tmpdir")); //java mp folder
        System.out.println(System.getenv("PATH"));

        System.out.println(System.getProperty("user.dir"));
        // windows requires same drive for relative path
        String home0 =  System.getProperty("java.io.tmpdir");
        File tmp = new File(home0);
     //   String kappa = tmp.getParentFile(); .listFiles
        File[] filelist = tmp.listFiles();
        for (File f:filelist){
            //for each
            System.out.println(f + " " + f.isDirectory());
        }

    }
}
