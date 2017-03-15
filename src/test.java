/**
 * Created by Mateusz on 15.03.2017.
 */
public class test {
    public static void main(String[] args) {
        boolean b1;
        b1 = true || false;
        b1 = "abc".contains("c") && 5 >4;
        if (b1) {
            System.out.println("b1 is true");
        }
        // remembr scope
        int a = 3;
        {
            System.out.println("huehuee" + a);
        }

        double n = 7;
        if (!(n>=5 && n<=8))
        {
            System.out.println("it is oke");
        }
    }

}
