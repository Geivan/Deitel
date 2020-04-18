package cap3;

import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);
        
        // exibe saldo inicial de cada objeto
        //System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        //System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance
        displayAccount(account1);
        displayAccount(account2);
        
        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); // adiciona o saldo de account1
        
        // exibe os saldos
        //System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        //System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());
        displayAccount(account1);
        displayAccount(account2);
       
        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); // adiciona ao saldo de account2
        
        // exibe os saldos
        //System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        //System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());
        displayAccount(account1);
        displayAccount(account2);
        
        // saque em account1
        System.out.print("Enter withdraw amount for account1: ");
        double withdrawAmount = input.nextDouble();
        System.out.printf("%ndeducting %.2f to account1 balance%n%n", withdrawAmount);
        account1.withdraw(withdrawAmount); // adiciona o saldo de account1
        
        // exibe os saldos
        //System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        //System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());
        displayAccount(account1);
        displayAccount(account2);
        
        // saque em account2
        System.out.print("Enter withdraw amount for account2: ");
        withdrawAmount = input.nextDouble();
        System.out.printf("%ndeducting %.2f to account2 balance%n%n", withdrawAmount);
        account2.withdraw(withdrawAmount); // adiciona o saldo de account1
        
        // exibe os saldos
       // System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        //System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());
        displayAccount(account1);
        displayAccount(account2);
    }    
    public static void displayAccount(Account accountToDisplay){
        System.out.printf("%s balance: $%.2f %n", accountToDisplay.getName() , accountToDisplay.getBalance());
    }
}
