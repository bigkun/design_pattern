package com.outlook.bigkun.idcard;

import com.outlook.bigkun.framework.Factory;
import com.outlook.bigkun.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghk
 * @since 2019/7/11
 */
public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList();

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    public List<String> getOwners() {
        return owners;
    }
}
