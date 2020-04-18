package GUI4_15;
// Utilizando DrawLine para conectar os cantos de um painel.
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{
    // desenha um X a partir dos cantos do painel
    public void paintComponent(Graphics g){
        // chama o paintComponent para assegurar que o painel é exibido corretamente
        super.paintComponent(g);
        
        int largura = getWidth() / 17; // largura total
        int altura = getHeight() / 17; // altura total        
        int c = 1;
        //(largura inicial, altura inicial, largura final, altura final)
        while(c <= 15) {             
            g.drawLine(0, 0, largura, getHeight() - altura);   
            g.drawLine(getWidth(), 0, getHeight() - largura, getHeight() - altura);
            g.drawLine(getWidth(), getHeight(), largura, getHeight() - altura);
            g.drawLine(0, getHeight(), getHeight() - largura, getHeight() - altura);
            largura += largura / c;
            altura += altura / c;
            c++;
        }        
                
        // desenha uma linha a partir do canto superior esquerdo até o inferior direito
        //g.drawLine(0, 0, width, height);
        
        // desenha uma linha a partir do canto inferior esquerdo até o superior direito
        //g.drawLine(0, height, width, 0);
    /*
    // desenha um X a partir dos cantos do painel
    public void paintComponent(Graphics g){
        // chama o paintComponent para assegurar que o painel é exibido corretamente
        super.paintComponent(g);
        
        int width = getWidth(); // largura total
        int height = getHeight(); // altura total
        
        // desenha uma linha a partir do canto superior esquerdo até o inferior direito
        g.drawLine(0, 0, width, height);
        
        // desenha uma linha a partir do canto inferior esquerdo até o superior dirito
        g.drawLine(0, height, width, 0);*/
    }    
}
