import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mateusz on 19.04.2017.
 */
public class Maps {
    public static void main(String[] args) {
        Map<String, Shape> shapeMap =  new HashMap<>();
        shapeMap.put("Circle", new Circle(4));
        shapeMap.put("Rectangle", new Rectangle(4,5));
        System.out.println(shapeMap.get("Circle"));
        for(String string: shapeMap.keySet()){
            System.out.println(string + " = " + shapeMap.get(string));
        }
//print list of words in a random text and a number of times it appeared das Hausaudgabe


        //shapeMap.keySet();//no two same keys
    }

    //mapos sdidictiosndar
}
