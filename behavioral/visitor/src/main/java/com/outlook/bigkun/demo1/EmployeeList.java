package com.outlook.bigkun.demo1;

import java.util.ArrayList;

/**
 * @author zhanghk
 * @since 2019/8/15
 */
public class EmployeeList {
    private ArrayList<Employee> list = new ArrayList<>();

    public void addEmployee(Employee employee) {
        list.add(employee);
    }

    public void accept(Department handler) {
        for (Employee e : list) {
            e.accept(handler);
        }
    }
}
