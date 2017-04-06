package zhangyi.insight.excercise;/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*                                                                      */

public class HRManager {
    public void display(Employee employee) {
        System.out.println(employee.getName());
        employee.walk();
    }

    public void paySalary(Payable payable) {
        payable.pay(10000.00);
    }
}
