package com.self.code;

import org.apache.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
      /*  System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"/application.xml"});
        context.start();
        System.in.read();*/
      Main.main(args);
    }
}
