package cap6;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.security.SecureRandom;

public class GUI6_1_Alvo extends JPanel {
    public void paintComponent(Graphics componente) {
        super.paintComponent(componente);
        
        SecureRandom coresAleatorias = new SecureRandom();

        int r = coresAleatorias.nextInt(256);
        int g = coresAleatorias.nextInt(256);
        int b = coresAleatorias.nextInt(256);
        
        Color cor = new Color(r, g, b);       

      //  componente.getCor();
        componente.fillOval(10, 10, 200, 200);
    }
}
