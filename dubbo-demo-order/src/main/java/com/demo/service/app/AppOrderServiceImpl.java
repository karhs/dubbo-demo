package com.demo.service.app;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.model.ResultDto;
import com.demo.service.OrderService;

@Service(version = "2.0", group = "app")
public class AppOrderServiceImpl implements OrderService {

    @Override
    public ResultDto addOrder(int money) {
        System.out.println("下单订单金额,2.0版本：" + money);
        // throw new RpcException();
        return new ResultDto(1, "返回结果", "下单金额：" + money);
    }

    @Override
    public void findOrder(int money) {
        System.out.println("查询订单金额：" + money);

    }


}
