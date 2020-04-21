package cap3;

public class Account {
    private String name;
    private double balance;
    
    // construtor
    public Account(String name, double balance) {
        this.name = name;
        if(balance > 0.0)
            this.balance = balance;
    }
    
    public void deposit(double depositAmount){
        if(depositAmount > 0.0)
            balance = balance + depositAmount;
    }
    
    public void withdraw(double withdrawAmount) {
        if(withdrawAmount > balance)
            System.out.print("Withdrawal amount exceeded account balance");
        else if(withdrawAmount > 0.0)
            balance = balance - withdrawAmount;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }    
} // Fim da classe Account
