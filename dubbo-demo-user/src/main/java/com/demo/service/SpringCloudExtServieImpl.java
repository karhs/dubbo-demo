package com.demo.service;

import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.common.extension.Adaptive;

@Adaptive("spring")
@Activate(order = 2, value = {"springcloudExt"}, group = {"dubbo"})
public class SpringCloudExtServieImpl implements ExtService {

    @Override
    public void sayHello(String msg) {
        System.out.println("SpringCloud");
    }

}
