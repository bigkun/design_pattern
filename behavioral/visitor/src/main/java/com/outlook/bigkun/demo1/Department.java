package com.outlook.bigkun.demo1;

/**
 * @author zhanghk
 * @since 2019/8/15
 */
public abstract class Department {
    abstract void visit(FulltimeEmployee employee);

    abstract void visit(ParttimeEmployee employee);
}
