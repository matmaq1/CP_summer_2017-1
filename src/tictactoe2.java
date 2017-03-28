/**
 * Created by Mateusz on 27.03.2017.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class tictactoe2 {
    static boolean is(String[][] arr, int row, int col, int l){
        boolean tmp = false;
        for (int k = 1; k<l; k++)
        {
            if(((col + (l - 1)) < arr[row].length)&&arr[row][col].equals(arr[row][col + k]))
        }
    }
    static String whowon(String[][] arr, int l) { //depends on array and length of same elements required to win
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) { //iterate over every element of the board
                if (is(arr, row, col,l)){
                    return(arr[row][col] + " won");
                }
            }

        }
        return "match undetermined"; //if nothing happened before it means that we don't have a winner in the given text file
    }


    public static void main(String[] args) {
        int l = 3; //length required to win
        try {
            File myFile = new File("C:\\Users\\Mateusz\\Documents\\R\\file.txt");
            Scanner scanner = new Scanner(myFile);
            int i = 0;
            while (scanner.hasNext()) {
                scanner.nextLine();
                i++;
            }
            String[][] arr = new String[i][i]; //assuming square board
            Scanner scanner0 = new Scanner(myFile); //got to create a new scanner in order to split
            int j = 0;
            while (scanner0.hasNext()) {
                String currLine = scanner0.nextLine();
                String[] elem = currLine.split(","); //assuming "," delimeter
                for (int col = 0; col < elem.length; col++) {
                    arr[j][col] = elem[col];//plugging in rows of the text file in the form of string table
                }
                j++;
            }
            System.out.println(whowon(arr, l));
        } catch (FileNotFoundException fe) {
            System.out.println("Problem occured: " + fe.getMessage());
        }
    }
}
