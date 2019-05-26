package com.huangjia.dubbo.service;

import com.huangjia.dubbo.bean.OrderRequest;
import com.huangjia.dubbo.bean.OrderResponse;

/**
 * @author jia.huang
 * @date 2019/5/25
 */
public interface OrderServices {

    /**
     * 下单操作
     * @param request
     * @return
     */
    OrderResponse doOrder(OrderRequest request);

}
