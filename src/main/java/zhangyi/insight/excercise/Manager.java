package zhangyi.insight.excercise;/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*                                                                      */

public class Manager extends Employee implements Payable {
    private int counter = 0;

    public Manager(String name) {
        super(name);
    }


    @Override
    protected void walk() {
        System.out.println(++counter);
    }

    public void run() {
        walk();
    }


    @Override
    public double pay(double money) {
        System.out.println(money);
        return money;
    }
}
