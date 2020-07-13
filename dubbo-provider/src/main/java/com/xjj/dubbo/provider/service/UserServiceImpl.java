package com.xjj.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import entity.UserAddress;
import org.springframework.stereotype.Component;
import service.UserService;

import java.util.Arrays;
import java.util.List;

@Service //dubbo的service,暴露服务
@Component
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList() {
        System.out.println("getUserAddressList...");
        UserAddress address1 = new UserAddress(1, "广东省广州市天河区");
        UserAddress address2 = new UserAddress(1, "广东省广州市越秀区");
        return Arrays.asList(address1,address2);
    }
}
