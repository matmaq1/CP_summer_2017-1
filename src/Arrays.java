/**
 * Created by Mateusz on 22.03.2017.
 */
public class Arrays {
    public static void main(String[] args) {
        int[] arInt = new int[3];
        Integer[] arInt2 = new Integer[3];
        arInt2[0] = 5; //int = 0, integer = null
        arInt2[1] = 2;
        arInt2[2] = 3;

        for (int i = 0; i< arInt2.length; i++)
        {
            System.out.println(arInt2[i]);
        }

        String[] arstr = new String[]{
                "asdf","qwert"
        };
        for (int j=0; j<arstr.length;j++)
        {
            System.out.println(arstr[j]);
        }
        for (String el:arstr){
            System.out.println(el);
        }
    }
}
