package com.demo.service;

import com.demo.model.ResultDto;

public class OrderServiceStub implements OrderService {


    public OrderServiceStub(OrderService orderService) {
        super();
        // TODO Auto-generated constructor stub
    }



    @Override
    public ResultDto addOrder(int money) {
        System.out.println("--------》》》》》》》》进入了Stub模式");
        return new ResultDto(1, "返回结果", "下单金额：Stub");
    }

    @Override
    public void findOrder(int money) {
        // TODO Auto-generated method stub

    }

}
