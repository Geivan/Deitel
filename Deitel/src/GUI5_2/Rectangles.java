package GUI5_2;
/*Modifique a Questão 5.16 no final dos exercícios do capítulo para ler a entrada utilizando diálogos e exibir o gráfico de barras usando
retângulos de comprimentos variados.*/
import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Rectangles extends JPanel{
    private int number;
        
    public Rectangles(int userNumber){
        number = userNumber;
    } 
    
    public void paintComponent(Graphics g){           
        super.paintComponent(g);
        
        for(int i = 0; i < number; i++){
            if(number >= 1 && number <= 30)
                g.drawRect(350 - i * 10, 350 - i * 10, 10 + i * 20, 10 + i * 20);
            else
                JOptionPane.showMessageDialog(null, "Invalid input!");
        }
    }
}
