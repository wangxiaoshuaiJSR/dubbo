package com.self.code;

import com.self.code.api.IRpcHelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"/application.xml"});
        IRpcHelloService rpcHelloService = (IRpcHelloService) context.getBean("providerService");
        System.out.println(rpcHelloService.hello("test"));;
    }
}
