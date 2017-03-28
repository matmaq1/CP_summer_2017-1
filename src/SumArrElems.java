/**
 * Created by Mateusz on 22.03.2017.
 */
public class SumArrElems {
    static Double sumaArray(Double[] arr)
    {
        Double x = 0.0;
        for (Double num:arr)
        {
            x+=num;
        }
        return x;
    }
    public static void main(String[] args) {
        Double[] arr = new Double[]{
                45.53, 666.0, 23.0
        };
        System.out.println(sumaArray(arr));

    }

}
