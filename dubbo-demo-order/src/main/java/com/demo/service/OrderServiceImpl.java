package com.demo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import com.demo.model.ResultDto;

@Service(version = "1.0", group = "wxapp", delay = 10000)
public class OrderServiceImpl implements OrderService {

    @Override
    public ResultDto addOrder(int money) {
        System.out.println("下单订单金额：" + money + ",隐式传参：" + RpcContext.getContext().getAttachment("dubboTest"));
        // throw new RpcException();
        return new ResultDto(1, "返回结果", "下单金额：" + money);
    }

    @Override
    public void findOrder(int money) {
        System.out.println("查询订单金额：" + money);

    }


}
