package com.self.code;


import com.self.code.api.IRpcHelloService;

/**
 * Created by Administrator on 2019/7/23.
 */
public class RpcHelloService implements IRpcHelloService {

    @Override
    public String hello(String name) {
        System.err.println("excute"+name);
        return "hello"+name;
    }
}
