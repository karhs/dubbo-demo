package com.demo.service;

import com.demo.model.ResultDto;

public interface OrderService {

    ResultDto addOrder(int money);

    void findOrder(int money);
}
