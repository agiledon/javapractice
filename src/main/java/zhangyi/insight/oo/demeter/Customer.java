package zhangyi.insight.oo.demeter;

public class Customer {
    private String firstName;
    private String lastName;
    private Wallet myWallet;
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void payMoney(float payment) {
        if (myWallet.getTotalMoney() > payment) {
            myWallet.subtractMoney(payment);
        } else {
            //money not enough
        }
    }
}
