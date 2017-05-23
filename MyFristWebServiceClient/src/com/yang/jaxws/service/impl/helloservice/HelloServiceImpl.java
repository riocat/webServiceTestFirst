package com.yang.jaxws.service.impl.helloservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-05-23T14:30:01.864+08:00
 * Generated source version: 3.1.11
 * 
 */
@WebService(targetNamespace = "http://impl.service.jaxws.yang.com/", name = "HelloServiceImpl")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloServiceImpl {

    @WebMethod
    @Action(input = "http://impl.service.jaxws.yang.com/HelloServiceImpl/getUsersRequest", output = "http://impl.service.jaxws.yang.com/HelloServiceImpl/getUsersResponse")
    @RequestWrapper(localName = "getUsers", targetNamespace = "http://impl.service.jaxws.yang.com/", className = "com.yang.jaxws.service.impl.helloservice.GetUsers")
    @ResponseWrapper(localName = "getUsersResponse", targetNamespace = "http://impl.service.jaxws.yang.com/", className = "com.yang.jaxws.service.impl.helloservice.GetUsersResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.yang.jaxws.service.impl.helloservice.User> getUsers();

    @WebMethod
    @Action(input = "http://impl.service.jaxws.yang.com/HelloServiceImpl/getUserMapRequest", output = "http://impl.service.jaxws.yang.com/HelloServiceImpl/getUserMapResponse")
    @RequestWrapper(localName = "getUserMap", targetNamespace = "http://impl.service.jaxws.yang.com/", className = "com.yang.jaxws.service.impl.helloservice.GetUserMap")
    @ResponseWrapper(localName = "getUserMapResponse", targetNamespace = "http://impl.service.jaxws.yang.com/", className = "com.yang.jaxws.service.impl.helloservice.GetUserMapResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.yang.jaxws.service.impl.helloservice.MapWapper getUserMap();

    @WebMethod
    @Action(input = "http://impl.service.jaxws.yang.com/HelloServiceImpl/getUserListRequest", output = "http://impl.service.jaxws.yang.com/HelloServiceImpl/getUserListResponse")
    @RequestWrapper(localName = "getUserList", targetNamespace = "http://impl.service.jaxws.yang.com/", className = "com.yang.jaxws.service.impl.helloservice.GetUserList")
    @ResponseWrapper(localName = "getUserListResponse", targetNamespace = "http://impl.service.jaxws.yang.com/", className = "com.yang.jaxws.service.impl.helloservice.GetUserListResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.yang.jaxws.service.impl.helloservice.User> getUserList();

    @WebMethod
    @Action(input = "http://impl.service.jaxws.yang.com/HelloServiceImpl/sayHelloRequest", output = "http://impl.service.jaxws.yang.com/HelloServiceImpl/sayHelloResponse")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://impl.service.jaxws.yang.com/", className = "com.yang.jaxws.service.impl.helloservice.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://impl.service.jaxws.yang.com/", className = "com.yang.jaxws.service.impl.helloservice.SayHelloResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @Action(input = "http://impl.service.jaxws.yang.com/HelloServiceImpl/changeNameRequest", output = "http://impl.service.jaxws.yang.com/HelloServiceImpl/changeNameResponse")
    @RequestWrapper(localName = "changeName", targetNamespace = "http://impl.service.jaxws.yang.com/", className = "com.yang.jaxws.service.impl.helloservice.ChangeName")
    @ResponseWrapper(localName = "changeNameResponse", targetNamespace = "http://impl.service.jaxws.yang.com/", className = "com.yang.jaxws.service.impl.helloservice.ChangeNameResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.yang.jaxws.service.impl.helloservice.User changeName(
        @WebParam(name = "arg0", targetNamespace = "")
        com.yang.jaxws.service.impl.helloservice.User arg0
    );
}
