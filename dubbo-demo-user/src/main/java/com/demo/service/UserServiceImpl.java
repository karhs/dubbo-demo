package com.demo.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void updateMoney(int money) {
        System.out.println("扣减用户金额：" + money);

    }

}
