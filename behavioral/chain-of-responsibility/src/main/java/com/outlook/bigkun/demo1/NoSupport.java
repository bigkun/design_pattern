package com.outlook.bigkun.demo1;

/**
 * @author zhanghk
 * @since 2019/8/5
 */
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
