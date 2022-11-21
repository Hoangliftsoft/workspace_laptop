
public class account{
    private double balance;
    private int id;

    public account(double balanceVal, int idVal) {
        this.balance = balanceVal;
        this.id = idVal;
    }

    public void withdraw(double sum){       // rút tiền
        balance -= sum;
    }

    public void deposit(double sum){        // gửi tiền
        balance += sum;
    }

    public void details(){
        System.out.print("\nid="+id);
        System.out.print("balance="+balance);
    }

}