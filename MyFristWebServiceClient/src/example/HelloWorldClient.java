package example;

import com.yang.my.firstjwsclient.HelloWorld;
import com.yang.my.firstjwsclient.HelloWorldService;

/**
 * Created by ASUS on 2017/4/21.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
    HelloWorld service = new HelloWorldService().getHelloWorldPort();
    //invoke business method
    String result = service.sayHelloWorldFrom("Akari");
    System.out.println(result);
  }
}
