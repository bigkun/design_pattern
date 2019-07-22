package com.outlook.bigkun.cloneable;


import com.outlook.bigkun.cloneable.Person.Address;

/**
 * @author zhanghk
 * @since 2019/7/22
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        person1.setName("bigkun");
        Address address = new Address();
        address.address = "威海";
        address.number = 1000;
        person1.setAddress(address);

        // Object clone
        Person person2 = (Person) person1.clone();

        System.out.println("hashCode:" + (person1 == person2));
        System.out.println("getAddress() :" + (person1.getAddress() == person2.getAddress()));
        System.out.println("引用域 address hashCode 相等，说明是浅拷贝");
    }
}
