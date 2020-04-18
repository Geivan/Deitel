package cap3;

public class Invoice {
    private String num;
    private String desc;
    private int quan;
    private double preco;
    
    public Invoice(String num, String desc, int quan, double preco){
        this.num = num;
        this.desc = desc;
        if(quan > 0)
            this.quan = quan;
        if(preco > 0.0)
            this.preco = preco;
    }
    
    public double getInvoiceAmount(int quan, double preco){
        return quan * preco;
    }

    public String getNum() {
        return num;
    }
    public void setNum(String num) {
        this.num = num;
    }

    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQuan() {
        return quan;
    }
    public void setQuan(int quan) {
        this.quan = quan;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }    
    
}
