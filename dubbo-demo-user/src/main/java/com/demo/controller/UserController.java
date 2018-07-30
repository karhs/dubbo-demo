package com.demo.controller;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.model.ResultDto;
import com.demo.service.ExtService;
import com.demo.service.OrderService;
import com.demo.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/dubbo/user")
public class UserController {

    @Autowired
    private UserService userService;

    // mock配置：1.fail:return null
    @Reference(version = "1.0", group = "wxapp", filter = "testFilter", async = true, check = false)
    private OrderService orderService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addOrder() {

        URL url = URL.valueOf("test://localhost/test");
        ExtensionLoader.getExtensionLoader(ExtService.class).getAdaptiveExtension().sayHello("测试");
        ExtensionLoader.getExtensionLoader(ExtService.class).getExtension("dubboExt").sayHello("11");

        List<ExtService> list = ExtensionLoader.getExtensionLoader(ExtService.class).getActivateExtension(url, new String[]{"dubboExt"}, "dubbo");
        for (ExtService extService : list) {
            extService.sayHello("测试");
        }


        /* RpcContext.getContext().setAttachment("dubboTest", "dubboTest"); */
        userService.updateMoney(18888);
        ResultDto resultDto = orderService.addOrder(19999);
        if (null == resultDto) {
            System.out.println("1.null");
        }

        userService.updateMoney(99);
        /*
         * Future<ResultDto> pFuture = RpcContext.getContext().getFuture(); try {
         * System.out.println("2." + pFuture.get().getResult()); } catch (InterruptedException e) {
         * // TODO Auto-generated catch block e.printStackTrace(); } catch (ExecutionException e) {
         * // TODO Auto-generated catch block e.printStackTrace(); }
         */
        return "下单成功";

    }

}
