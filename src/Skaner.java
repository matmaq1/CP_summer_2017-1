import shapes.Shape;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * Created by Mateusz on 09.05.2017.
 */
public class Skaner {
    public static void main(String[] args) {

        /**
         * Created by Mateusz on 09.05.2017.
         */
        Map<String, Integer> map =  new HashMap<>();

                try {
                    File myFile = new File("C:\\file.txt");
                    Scanner scanner = new Scanner(myFile);
                    while (scanner.hasNext()) {
                        String currLine = scanner.nextLine();
                        String[] elem = currLine.split("[\\W]"); // assuming any non-word split
                        for (String string:elem){

                            Integer value = map.get(string); //we try to find the word in the map
                            if (value != null) { // if the word exists, value is your everyday Integer, not a null
                                map.put(string, value + 1); // we praise java for caring about memory
                                // and that duplicates can't go into this structure and update the key-value pair
                                // we already know that we can  safely increment the value
                            } else {
                                map.put(string, 1); //entering first appearance
                            }

                        }

                    }
                } catch (FileNotFoundException fe) {
                    System.out.println("Problem occurred: "
                            + fe.getMessage());
                }

        for (Map.Entry<String, Integer> entry : map.entrySet()) //iterating over map entries of type Map.Entry called entry
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}

