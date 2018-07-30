package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/dubbo/order")
public class OrderController {

    /*
     * @Autowired private OrderService orderService;
     * 
     * @RequestMapping(value = "/update", method = RequestMethod.GET) public void findOrder() {
     * orderService.findOrder(1888); }
     */
}
