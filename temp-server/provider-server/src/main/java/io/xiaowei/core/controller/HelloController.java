package io.xiaowei.core.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/4 2:15 下午
 * @Version 1.0
 **/
@Slf4j
@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String name;

    @GetMapping("/hello")
    public String hello() {
        log.info("-----current-------{}-----{}-----", port, name);
        return "Hello";
    }

}
