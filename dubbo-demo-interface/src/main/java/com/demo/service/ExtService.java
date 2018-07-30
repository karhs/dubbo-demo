package com.demo.service;

import com.alibaba.dubbo.common.extension.SPI;

@SPI("dubboExt")
public interface ExtService {

    void sayHello(String msg);
}
