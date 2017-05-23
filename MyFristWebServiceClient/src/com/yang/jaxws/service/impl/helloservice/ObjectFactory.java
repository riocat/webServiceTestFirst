
package com.yang.jaxws.service.impl.helloservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.yang.jaxws.service.impl.helloservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ChangeName_QNAME = new QName("http://impl.service.jaxws.yang.com/", "changeName");
    private final static QName _ChangeNameResponse_QNAME = new QName("http://impl.service.jaxws.yang.com/", "changeNameResponse");
    private final static QName _GetUserList_QNAME = new QName("http://impl.service.jaxws.yang.com/", "getUserList");
    private final static QName _GetUserListResponse_QNAME = new QName("http://impl.service.jaxws.yang.com/", "getUserListResponse");
    private final static QName _GetUserMap_QNAME = new QName("http://impl.service.jaxws.yang.com/", "getUserMap");
    private final static QName _GetUserMapResponse_QNAME = new QName("http://impl.service.jaxws.yang.com/", "getUserMapResponse");
    private final static QName _GetUsers_QNAME = new QName("http://impl.service.jaxws.yang.com/", "getUsers");
    private final static QName _GetUsersResponse_QNAME = new QName("http://impl.service.jaxws.yang.com/", "getUsersResponse");
    private final static QName _MapWapper_QNAME = new QName("http://impl.service.jaxws.yang.com/", "mapWapper");
    private final static QName _SayHello_QNAME = new QName("http://impl.service.jaxws.yang.com/", "sayHello");
    private final static QName _SayHelloResponse_QNAME = new QName("http://impl.service.jaxws.yang.com/", "sayHelloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.yang.jaxws.service.impl.helloservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChangeName }
     * 
     */
    public ChangeName createChangeName() {
        return new ChangeName();
    }

    /**
     * Create an instance of {@link ChangeNameResponse }
     * 
     */
    public ChangeNameResponse createChangeNameResponse() {
        return new ChangeNameResponse();
    }

    /**
     * Create an instance of {@link GetUserList }
     * 
     */
    public GetUserList createGetUserList() {
        return new GetUserList();
    }

    /**
     * Create an instance of {@link GetUserListResponse }
     * 
     */
    public GetUserListResponse createGetUserListResponse() {
        return new GetUserListResponse();
    }

    /**
     * Create an instance of {@link GetUserMap }
     * 
     */
    public GetUserMap createGetUserMap() {
        return new GetUserMap();
    }

    /**
     * Create an instance of {@link GetUserMapResponse }
     * 
     */
    public GetUserMapResponse createGetUserMapResponse() {
        return new GetUserMapResponse();
    }

    /**
     * Create an instance of {@link GetUsers }
     * 
     */
    public GetUsers createGetUsers() {
        return new GetUsers();
    }

    /**
     * Create an instance of {@link GetUsersResponse }
     * 
     */
    public GetUsersResponse createGetUsersResponse() {
        return new GetUsersResponse();
    }

    /**
     * Create an instance of {@link MapWapper }
     * 
     */
    public MapWapper createMapWapper() {
        return new MapWapper();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link UserMap }
     * 
     */
    public UserMap createUserMap() {
        return new UserMap();
    }

    /**
     * Create an instance of {@link UserMapArray }
     * 
     */
    public UserMapArray createUserMapArray() {
        return new UserMapArray();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.jaxws.yang.com/", name = "changeName")
    public JAXBElement<ChangeName> createChangeName(ChangeName value) {
        return new JAXBElement<ChangeName>(_ChangeName_QNAME, ChangeName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.jaxws.yang.com/", name = "changeNameResponse")
    public JAXBElement<ChangeNameResponse> createChangeNameResponse(ChangeNameResponse value) {
        return new JAXBElement<ChangeNameResponse>(_ChangeNameResponse_QNAME, ChangeNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.jaxws.yang.com/", name = "getUserList")
    public JAXBElement<GetUserList> createGetUserList(GetUserList value) {
        return new JAXBElement<GetUserList>(_GetUserList_QNAME, GetUserList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.jaxws.yang.com/", name = "getUserListResponse")
    public JAXBElement<GetUserListResponse> createGetUserListResponse(GetUserListResponse value) {
        return new JAXBElement<GetUserListResponse>(_GetUserListResponse_QNAME, GetUserListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.jaxws.yang.com/", name = "getUserMap")
    public JAXBElement<GetUserMap> createGetUserMap(GetUserMap value) {
        return new JAXBElement<GetUserMap>(_GetUserMap_QNAME, GetUserMap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserMapResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.jaxws.yang.com/", name = "getUserMapResponse")
    public JAXBElement<GetUserMapResponse> createGetUserMapResponse(GetUserMapResponse value) {
        return new JAXBElement<GetUserMapResponse>(_GetUserMapResponse_QNAME, GetUserMapResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.jaxws.yang.com/", name = "getUsers")
    public JAXBElement<GetUsers> createGetUsers(GetUsers value) {
        return new JAXBElement<GetUsers>(_GetUsers_QNAME, GetUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.jaxws.yang.com/", name = "getUsersResponse")
    public JAXBElement<GetUsersResponse> createGetUsersResponse(GetUsersResponse value) {
        return new JAXBElement<GetUsersResponse>(_GetUsersResponse_QNAME, GetUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapWapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.jaxws.yang.com/", name = "mapWapper")
    public JAXBElement<MapWapper> createMapWapper(MapWapper value) {
        return new JAXBElement<MapWapper>(_MapWapper_QNAME, MapWapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.jaxws.yang.com/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.jaxws.yang.com/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

}
