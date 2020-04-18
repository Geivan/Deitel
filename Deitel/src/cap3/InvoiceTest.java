package cap3;

public class InvoiceTest {
    public static void main(String[] args){
        Invoice invoice1 = new Invoice("1234", "cartucho", 2, 45.5);
        Invoice invoice2 = new Invoice("4321", "bonecas", -1, -4.5);
        
        System.out.printf("Número do Produto: %s%nProduto: %s%nQuantidade: %d%nPreço: %.2f%n%n",
                invoice1.getNum(), invoice1.getDesc(), invoice1.getQuan(), invoice1.getInvoiceAmount(invoice1.getQuan(), invoice1.getPreco()));
        System.out.printf("Número do Produto: %s%nProduto: %s%nQuantidade: %d%nPreço: %.2f%n%n",
                invoice2.getNum(), invoice2.getDesc(), invoice2.getQuan(), invoice2.getInvoiceAmount(invoice2.getQuan(), invoice2.getPreco()));
    }
}
