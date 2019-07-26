package com.self.code;

import com.self.code.api.IRpcSayService;

/**
 * Created by Administrator on 2019/7/23.
 */
public class RpcSayService implements IRpcSayService {
    @Override
    public String hello(String name) {
        return "say"+name;
    }
}
