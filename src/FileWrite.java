/**
 * Created by Mateusz on 29.03.2017.
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        String home = System.getProperty("user.dir") + "/new.txt";
        File newFile = new File("home");
        try{
            FileWriter fw = new FileWriter(newFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("asdf");
            bw.newLine();
            bw.write("2ndlilinne");
            bw.write("3rd ");
            bw.close();
            fw.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
