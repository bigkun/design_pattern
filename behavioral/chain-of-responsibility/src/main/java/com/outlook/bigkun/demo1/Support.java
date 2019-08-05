package com.outlook.bigkun.demo1;

/**
 * @author zhanghk
 * @since 2019/8/5
 */
public abstract class Support {
    private String name;
    private Support next;

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public Support(String name) {
        this.name = name;
    }

    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }

    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    protected abstract boolean resolve(Trouble trouble);

    @Override
    public String toString() {
        return "Support{" +
                "name='" + name +
                '}';
    }
}

