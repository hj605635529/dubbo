package com.huangjia.dubbo.bean;

import java.io.Serializable;

/**
 * @author jia.huang
 * @date 2019/5/25
 */
public class OrderRequest  implements Serializable {
    private static final long serialVersionUID = 4632876501724851634L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DoOrderRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
