/**
 * Created by Mateusz on 20.03.2017.
 */

import java.math.BigInteger;
import java.lang.*;
public class fibo2 {
    public static void main(String[] args) {
        int n = 100000;
        int k = 0;
        BigInteger i = new BigInteger("0");
        BigInteger j = new BigInteger("1");
        if(k==0)
        {
            System.out.println("Fibonacci number " + k + " is equal to " + i);
            k++;
        }
        if(k==1)
        {

            System.out.println("Fibonacci number " + k + " is equal to " + j);
            k++;
        }
        while (k <= n) {
            BigInteger fibNumber = light(k, i, j);
            i = j;
            j = fibNumber;
            System.out.println("Fibonacci number " + k + " is equal to " + fibNumber);
            k++;

        }
    }
    private static BigInteger light(int place, BigInteger last1, BigInteger last2)
    {
        return last1.add(last2);
    }
}
