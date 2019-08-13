package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/13
 */
public class ConcreteAggregate implements Aggregate {
    private ConcreteObject[] concreteObjects;
    private int last = 0;

    public ConcreteAggregate(int size) {
        concreteObjects = new ConcreteObject[size];
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    public ConcreteObject getObjectAt(int index) {
        return concreteObjects[index];
    }

    public void addObject(ConcreteObject object) {
        concreteObjects[last] = object;
        last++;
    }

    public int getLength() {
        return last;
    }
}
