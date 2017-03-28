/**
 * Created by Mateusz on 22.03.2017.
 */
public class multi {
    public static void main(String[] args) {
        Double[][] arr = new Double[3][4];
        arr[0][0] = 343d;
        arr[0][1] = 254d;
        arr[0][2] = 23.34d;
        arr[1][0] = 34.34;

        for (int row=0; row<arr.length; row++)
        {
            for (int col = 0; col < arr[row].length; col++)
            {
                System.out.print(arr[row][col] + "\t");
            }
            System.out.println();
        }
    }

}
