package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/13
 */
public class ConcreteIterator implements Iterator {
    private ConcreteAggregate objects;
    private int cursor;

    public ConcreteIterator(ConcreteAggregate objects) {
        this.objects = objects;
        cursor = 0;
    }

    @Override
    public void first() {
        cursor = 0;
    }

    @Override
    public void next() {
        cursor++;

    }

    @Override
    public boolean hasNext() {
        if (cursor < objects.getLength()) {
            return true;
        }
        return false;
    }

    @Override
    public Object currentItem() {
        return objects.getObjectAt(cursor);
    }
}
