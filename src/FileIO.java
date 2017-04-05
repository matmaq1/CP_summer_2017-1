/**
 * Created by Mateusz on 04.04.2017.
 */

import java.io.*;
import java.util.Scanner;

public class FileIO {

    public static void main(String[] args) {
        String home = System.getProperty("user.dir") + "\\src";

        File f = new File(home);
//borrowed from stackexchange - didn't really know how to filter csv only, this could use an anonymous function
        File[] files = f.listFiles(new FilenameFilter() {
            public boolean accept(final File a_directory,
                                  final String a_name) {
                return a_name.endsWith(".csv");
            }

        });
        for (File file : files) {

            String name = file.getName();
            name = name.replace(".", "New.");
            String home2 = home + "\\" + name;
            File newFile = new File(home2);
            try {
                Scanner scanner = new Scanner(file);
                int i = 0;
                while (scanner.hasNext()) {
                    String currLine = scanner.nextLine();
                    String[] elem = currLine.split(",");
                    try {
                        FileWriter fw = new FileWriter(newFile, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        if (i == 0) {
                            bw.write(currLine + ",Change Base Name of the File: " + file.getName());
                            bw.newLine();
                            bw.close();
                            fw.close();
                        } else {
                            double close = Double.parseDouble(elem[4]);
                            double open = Double.parseDouble(elem[1]);
                            double change = (close - open) / open * 100.0;
                            String buf = String.format("%.2f", change).replace(',', '.');
                            // System.out.println(change);
                            bw.write(currLine + "," + buf + "%");
                            bw.newLine();
                            bw.close();
                            fw.close();
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    i++;
                }
            } catch (FileNotFoundException fe) {
                System.out.println("Problem occurred: "
                        + fe.getMessage());
            }


        }
    }

}

