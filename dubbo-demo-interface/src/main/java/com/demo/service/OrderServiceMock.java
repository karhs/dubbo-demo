package com.demo.service;

import com.demo.model.ResultDto;

public class OrderServiceMock implements OrderService {

    @Override
    public ResultDto addOrder(int money) {
        System.out.println("--------》》》》》》》》进入了Mock模式");
        return new ResultDto(1, "返回结果", "下单金额：" + money);
    }

    @Override
    public void findOrder(int money) {
        // TODO Auto-generated method stub

    }

}
