package cap5;
// Demonstrando Strings em um switch
public class AutoPolicyTest {
    public static void main(String[] args){
        // cria dois objetos AutoPolicy
        AutoPolicy policy1 =
                new AutoPolicy(11111111, "Toyota Camry", "NJ");
        AutoPolicy policy2 = 
                new AutoPolicy(22222222, "Ford Fusion", "ME");
        
        // exibe se cada apólice está em um estado "sem culpa"
        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }
    
    // método que mostra se um AutoPolicy
    // está em um estado com seguro de automóvel "sem culpa"
    public static void policyInNoFaultState(AutoPolicy policy){
        System.out.println("The auto policy:");
        System.out.printf(
                "Account #: %d; Car: %s; State %s %s a no-fault state%n%n", 
                policy.getAccountNumber(), policy.getMakeAndModel(),
                policy.getState(),
                (policy.isNoFaultState()? "is": "is not"));
    }
}
