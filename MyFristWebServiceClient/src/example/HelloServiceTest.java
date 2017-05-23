package example;

import com.yang.jaxws.service.impl.helloservice.HelloServiceImpl;
import com.yang.jaxws.service.impl.helloservice.HelloServiceImplService;
import com.yang.jaxws.service.impl.helloservice.User;

import java.util.Date;

/**
 * Created by ASUS on 2017/5/23.
 */
public class HelloServiceTest {

    public static void main(String[] args) {
/*        ClassPathXmlApplicationContext cxa = new ClassPathXmlApplicationContext("springjaxwsbeans.xml");
        HelloServiceImpl helloService = cxa.getBean("helloService", HelloServiceImpl.class);
        System.out.println(helloService.sayHello("aa"));
        User u = new User();
        u.setId(1);
        u.setName("d");
        u.setCreateDate(new Date());
        System.out.println(helloService.changeName(u).getCreateDate());*/

        HelloServiceImpl helloService = new HelloServiceImplService().getHelloServicePort();
        System.out.println(helloService.sayHello("aa"));
        User u = new User();
        u.setId(1);
        u.setName("d");
        u.setCreateDate(new Date());
        System.out.println(helloService.changeName(u).getCreateDate().getTime());
        System.out.println(helloService.getUserList().get(0).getName());
        System.out.println(helloService.getUsers().get(1).getCreateDate().getTime());
        System.out.println(helloService.getUserMap().getMap().getItem().get(1).getUser().getCreateDate().getTime());
    }
}
