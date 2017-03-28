package com.tyjr.maven_spring.service;


import org.springframework.stereotype.Service;

/**
 * Created by nii on 2017/2/4.
 */
@Service
@com.alibaba.dubbo.config.annotation.Service
public class TestServiceImpl implements TestService {

    public String testServer() {
        System.out.println("1111111111111");
        return null;
    }
}
