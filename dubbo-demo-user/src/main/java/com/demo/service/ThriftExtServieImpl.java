package com.demo.service;

import com.alibaba.dubbo.common.extension.Activate;

@Activate(group = {"thrift"})
public class ThriftExtServieImpl implements ExtService {

    @Override
    public void sayHello(String msg) {
        System.out.println("Thrift");
    }

}
