package com.outlook.bigkun.beanutils;

import java.io.Serializable;

/**
 * @author zhanghk
 * @since 2019/7/16
 */
public class Person implements Serializable {
    String name;
    Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public static class Address implements Serializable {
        String address;
        int number;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }
}
