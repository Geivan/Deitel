package GUI5_29;
/*Desenhe 12 círculos concêntricos no centro de um JPanel (Figura 5.29). O círculo mais interno deve ter um raio de 10 pixels e cada
círculo sucessivo deve ter um raio de 10 pixels maior que o anterior. Comece localizando o centro do JPanel. Para obter o canto superior
esquerdo de um círculo, mova-se um raio para cima e um raio para a esquerda a partir do centro. A largura e a altura do retângulo delimitador têm o mesmo diâmetro do círculo (isto é, duas vezes o raio). */
import java.awt.Graphics;
import javax.swing.JPanel;

public class TwelveCircles extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        for(int i = 0; i < 12; i++){
            g.drawOval(125 - i * 10, 125 - i * 10, 10 + i * 20, 10 + i * 20);
        }
    }
}
