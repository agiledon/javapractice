package zhangyi.insight.oo.demeter;

public class Paperboy {
    private Customer myCustomer;
    public void pay(float payment) {
        myCustomer.payMoney(payment);
    }

}
