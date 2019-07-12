package com.outlook.bigkun.idcard;

import com.outlook.bigkun.framework.Product;

/**
 * @author zhanghk
 * @since 2019/7/11
 */
public class IDCard extends Product {
    private String owner;

    public IDCard(String owner) {
        this.owner = owner;
        System.out.println("制作" + owner + "的ID卡。");
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡。");
    }

    public String getOwner() {
        return owner;
    }
}
