package zhangyi.insight.excercise;/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*                                                                      */

import java.util.ArrayList;
import java.util.List;

public class EmployeeList<T extends Employee> {
    private List<T> list = new ArrayList<>();

    public void add(T t) {
        list.add(t);
    }

    public void remove(T t) {
        list.remove(t);
    }

    public int count() {
        return list.size();
    }

}
