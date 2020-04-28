package cap6;
/*Utilizando o método fillOval, desenhe um alvo que alterna entre duas cores aleatórias, como na Figura 6.13. 
Utilize o construtor Color(int r, int g, int b) com argumentos aleatórios para gerar cores aleatórias.*/

import javax.swing.JFrame;

public class GUI6_1 {
    public static void main(String[] args) {
        GUI6_1_Alvo alvo = new GUI6_1_Alvo();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(alvo);
        application.setSize(240, 260);
        application.setVisible(true);
    }    
}
