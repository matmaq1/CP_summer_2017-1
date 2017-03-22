/**
 * Created by Mateusz on 22.03.2017.
 */
public class primesrecursive {

    public static void main(String[] arg) {
        for(int i = 1; i < 1000; i++) {
            if (isPrime(i, i-1) == 1)
            {
                System.out.println(i + " is a prime");
            }
        }
    }

    static int isPrime(int a, int div) {
        if(div <= 1) {
            return 1;
        }
        if(a % div == 0) {
            return -1;
        }
        return isPrime(a, div-1);
    }
}
