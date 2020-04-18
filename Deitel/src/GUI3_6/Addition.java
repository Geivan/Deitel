package GUI3_6;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first integer:"));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter secont integer:"));

        sum = number1 + number2;
        
        String message = String.format("%d + %d = %d", number1, number2, sum);
        
        JOptionPane.showMessageDialog(null, message);
    }
}
