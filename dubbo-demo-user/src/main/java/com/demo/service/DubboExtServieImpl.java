package com.demo.service;

import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.common.extension.Adaptive;

@Adaptive("dubbo")
@Activate(order = 1, value = {"dubboExt"}, group = {"dubbo"})
public class DubboExtServieImpl implements ExtService {

    @Override
    public void sayHello(String msg) {
        System.out.println("Dubbo");
    }

}
