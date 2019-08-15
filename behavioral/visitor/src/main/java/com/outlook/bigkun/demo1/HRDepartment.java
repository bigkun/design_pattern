package com.outlook.bigkun.demo1;

/**
 * @author zhanghk
 * @since 2019/8/15
 */
public class HRDepartment extends Department {
    @Override
    void visit(FulltimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.println("正式员工" + employee.getName() + "实际工作时长：" + workTime);
        if (workTime > 40) {
            System.out.println("正式员工" + employee.getName() + "加班");
        } else if (workTime < 40) {
            System.out.println("正式员工" + employee.getName() + "请假");
        }
    }

    @Override
    void visit(ParttimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.println("临时工" + employee.getName() + "实际工作时间：" + workTime);
    }
}
