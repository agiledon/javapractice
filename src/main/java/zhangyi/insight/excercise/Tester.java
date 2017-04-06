package zhangyi.insight.excercise;/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*                                                                      */

public class Tester extends Employee implements Payable, CareerPath {
    public Tester(String name) {
        super(name);
    }

    @Override
    protected void walk() {
        System.out.println("I am testing during walking");
    }

    @Override
    public double pay(double money) {
        return 0.0;
    }

    @Override
    public void plan() {

    }


}
