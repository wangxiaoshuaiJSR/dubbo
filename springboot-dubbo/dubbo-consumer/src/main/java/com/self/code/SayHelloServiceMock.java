package com.self.code;

/**
 * Created by Administrator on 2019/7/25.
 */
public class SayHelloServiceMock implements ISayHelloService {
    @Override
    public String sayHello(String name) {
        return "服务端降级了";
    }
}
