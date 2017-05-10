import java.util.Scanner;

/**
 * Created by Mateusz on 05.04.2017.
 */
public class InputParameters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input : ");
        while (scan.hasNext()){
            Integer input = scan.nextInt();
            System.out.println("got: " + input);
        }
    }
}
