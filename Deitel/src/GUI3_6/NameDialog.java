package GUI3_6;

import javax.swing.JOptionPane;

public class NameDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        
        String message =  String.format("Welcome, %s, to Java Programming!", name);
        
        JOptionPane.showMessageDialog(null, message);
    }    
}
