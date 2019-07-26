package com.self.code;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/7/24.
 */
@RestController
public class DubboController {
    @Reference(loadbalance = "roundrobin",cluster = "failfast",timeout = 1,mock = "com.self.code.SayHelloServiceMock",check = false)//失败安全
    ISayHelloService sayHelloService;
    @GetMapping("/sayhello")
    public String sayHello(){
        return sayHelloService.sayHello("nihao");
    }
}
