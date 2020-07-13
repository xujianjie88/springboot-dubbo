package com.xjj.dubbo.comsumer.controller;


import com.xjj.dubbo.comsumer.service.OrderService;
import entity.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/initOrder")
    @ResponseBody
    public List<UserAddress> initOrder(@RequestParam("userId") Integer userId) {
        List<UserAddress> userAddresses = orderService.initOrder(userId);
        return userAddresses;
    }

}
