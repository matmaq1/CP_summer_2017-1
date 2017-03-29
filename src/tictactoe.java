/**
 * Created by Mateusz on 27.03.2017.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//comment

public class tictactoe {
    static String whowon(String[][] arr, int l) { //depends on array and length of same elements required to win
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) { //iterate over every element of the board
                boolean is = true;//we assume that this field is the beginning of the winning strike in either direction
                if ((col + (l - 1)) < arr[row].length) {// if it makes sense to go horizontally basing on the length required
                    int k = 1; // 0 is identical
                    while (k <= l - 1)//-1 because we always have one element in the strike
                    {
                        if (!arr[row][col].equals(arr[row][col + k])) { // if we find element that differs from what should be in order for strike to be complete we  decide that this is not a winning strike in that direction
                            is = false;
                        }
                        k++;
                    }
                    if (is) { // if everything is okay than we return that this field is in fact winning strike, so this player won
                        return (arr[row][col] + " won horizontally");
                    }
                }
                if ((row + (l - 1)) < arr.length) // we check for every direction
                {
                    is = true;
                    int k = 1;
                    while (k <= l - 1) {
                        if (!arr[row][col].equals(arr[row + k][col])) {
                            is = false;
                        }
                        k++;
                    }
                    if (is) {
                        return (arr[row][col] + " won vertically");
                    }
                }
                if (((row + (l - 1)) < arr.length) && (col + (l - 1)) < arr[row].length) {
                    is = true;
                    int k = 1;
                    while (k <= l - 1) {
                        if (!arr[row][col].equals(arr[row + k][col + k])) {
                            is = false;
                        }
                        k++;
                    }
                    if (is) {
                        return (arr[row][col] + " won diagonally");
                    }
                }
                if (((row - (l - 1)) >= 0) && (col + (l - 1)) < arr[row].length) { // iteration is ugly but parametrized function is even uglier
                    is = true;
                    int k = 1;
                    while (k <= l - 1) {
                        if (!arr[row][col].equals(arr[row - k][col + k])) {
                            is = false;
                        }
                        k++;
                    }
                    if (is) {
                        return (arr[row][col] + " won diagonally (reverse)");
                    }
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
