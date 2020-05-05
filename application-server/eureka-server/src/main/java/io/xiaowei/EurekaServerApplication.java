package io.xiaowei;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaServerApplication
 * @Description 启动类
 * @Author xiaowei
 * @Date 2020/5/4 12:03 下午
 * @Version 1.0
 **/
@Slf4j
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
        log.info(">>>>>>>> Eureka Server Start Success >>>>>>>>");
    }

}
