package com.yang.jaxws.service;

import com.yang.entry.MapWapper;
import com.yang.entry.User;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by ASUS on 2017/5/22.
 */
@WebService
public interface HelloService {

    String sayHello(String name);

    User changeName(User user);

    User[] getUsers();

    List<User> getUserList();

    MapWapper getUserMap();
}
