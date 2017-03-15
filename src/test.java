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
        if (!(n>=5 && n<=8))//kappa
        {
            System.out.println("it is oke");
        }

        String s = "A"; // else if

        if (s.equals("A"))
        {
            System.out.println("a");
        }
        else if(s.equals("B"))
        {
            System.out.println("B");
        }
        else
        {
            System.out.println("else");
        }

        switch(s)
        {
            case "A
                System.out.println("AA");
                break; //without break lines it executes everything after first found case without checking
            case "B":
                System.out.println("B");
                break;
            default:
                System.out.println("sth else");
        }

        int res = s.equals("B") ? 10 : 0 // if condition is true it is 10 else it is 0 //apache poi
    }

}
