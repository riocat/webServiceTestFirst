package com.yang.jaxws.service.impl;

import com.yang.entry.User;
import com.yang.jaxws.service.HelloService;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.Date;

/**
 * Created by ASUS on 2017/5/22.
 */
@Service("helloService")
//@WebService(targetNamespace = "http://service.jaxws.yang.com",
//        endpointInterface = "com.yang.jaxws.service.HelloService", portName = "HelloServicePort") 加上endpointInterface无法生成正常wsdl
@WebService(portName = "HelloServicePort")
public class HelloServiceImpl implements HelloService {

    @Override
    @WebMethod
    public String sayHello(String name) {
        return "Hello" + name;
    }

    @Override
    @WebMethod
    public User changeName(User user) {
        user.setName("changed");
        user.setCreateDate(new Date());
        return user;
    }
}
