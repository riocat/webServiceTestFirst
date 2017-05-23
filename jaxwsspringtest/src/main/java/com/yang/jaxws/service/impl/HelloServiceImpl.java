package com.yang.jaxws.service.impl;

import com.yang.entry.MapWapper;
import com.yang.entry.User;
import com.yang.jaxws.service.HelloService;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.*;

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

    @Override
    public User[] getUsers() {
        return new User[]{new User(0,"a",new Date()),new User(1,"b",new Date())};
    }

    @Override
    public List<User> getUserList() {
        List<User> list = new ArrayList<User>();
        list.add(new User(2,"c",new Date()));
        list.add(new User(3,"d",new Date()));
        return list;
    }

    @Override
    public MapWapper getUserMap() {
        MapWapper mw = new MapWapper();
        Map<String,User> map = new HashMap<String, User>();
        map.put("1",new User(4,"e",new Date()));
        map.put("2",new User(5,"f",new Date()));
        mw.setMap(map);
        return mw;
    }
}
