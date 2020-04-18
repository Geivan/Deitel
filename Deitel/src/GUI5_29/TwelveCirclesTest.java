package GUI5_29;
import javax.swing.JFrame;

public class TwelveCirclesTest {
    public static void main(String[] args){
        TwelveCircles twelveCircles = new TwelveCircles();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(twelveCircles);
        application.setSize(300, 300);
        application.setVisible(true);
    }
}
