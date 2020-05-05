package io.xiaowei.controller;

import io.xiaowei.feign.HelloFeignApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName ClientController
 * @Description 调用
 * @Author xiaowei
 * @Date 2020/5/4 2:44 下午
 * @Version 1.0
 **/
@RestController
public class ClientController {

    @Resource
    private HelloFeignApi helloFeignApi;

    @GetMapping("/client")
    public String client() {
        return helloFeignApi.hello();
    }


}
