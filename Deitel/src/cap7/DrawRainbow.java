package cap7;
// Desenhando um arco-íris com arcos e um array de cores.
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawRainbow extends JPanel {
	// define as cores índigo e violeta
	private final static Color VIOLET = new Color(128, 0, 128);
	private final static Color INDIGO = new Color(75, 0, 130);
	
	// Cores a utilizar no arco-íris, iniciando da parte mais interna
	// As duas entradas em branoc resultam em um arco vazio no centro
	private Color[] colors =
		{Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
		 Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};
	
	// construtor
	public DrawRainbow() {
		setBackground(Color.WHITE); // configura o fundo como branco
		}
}
