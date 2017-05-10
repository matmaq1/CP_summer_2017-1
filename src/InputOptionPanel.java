import javax.swing.*;

/**
 * Created by Mateusz on 05.04.2017.
 */
public class InputOptionPanel {
    public static void main(String[] args) {
       int result = 3;
       String input = null;
        do {
            input = JOptionPane.showInputDialog("Please provide input: ");
            JOptionPane.showMessageDialog(null, input);
            result = JOptionPane.showConfirmDialog(null, "Please tick the hell out of me");
            if(result==2) System.exit(-3);
        } while (result!=0);
    }
}
