public class Bankacc {
    String owner;
    private double balance;

    Bankacc(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner (){
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(int amt){
        balance-=amt;
        if(balance<0) balance = 0;
    }

    public void deposit(int amt){
        balance+=amt;
    }


}
