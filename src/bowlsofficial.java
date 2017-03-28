/**
 * Created by Mateusz on 22.03.2017.
 */
public class bowlsofficial {
    static int countBowls(int row) {
        if (row==1)
            return 1;
        else
            return countBowls(row-1) + 2;


    }

    public static void main(String[] args)
    {
        int length = countBowls(5);
    }
}
