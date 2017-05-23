package com.yang.jaxws.service;

import com.yang.entry.User;

import javax.jws.WebService;

/**
 * Created by ASUS on 2017/5/22.
 */
@WebService
public interface HelloService {

    String sayHello(String name);

    User changeName(User user);
}
