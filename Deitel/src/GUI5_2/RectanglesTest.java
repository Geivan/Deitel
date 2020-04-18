package GUI5_2;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RectanglesTest {
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog(
                "Enter a number between 1 and 30");
        
        int number = Integer.parseInt(input);
        
        Rectangles panel = new Rectangles(number);
        
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(750, 750);
        application.setVisible(true);
    }
}
