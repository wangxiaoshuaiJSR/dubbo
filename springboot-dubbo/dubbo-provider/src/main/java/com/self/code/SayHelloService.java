package com.self.code;

import org.apache.dubbo.config.annotation.Service;

/**
 * Created by Administrator on 2019/7/24.
 */
@Service(loadbalance = "random",weight=10)
public class SayHelloService implements ISayHelloService {
    @Override
    public String sayHello(String name){
        try {
            Thread.sleep(123633333);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("come in");
        return "nihao"+name;
    }
}
