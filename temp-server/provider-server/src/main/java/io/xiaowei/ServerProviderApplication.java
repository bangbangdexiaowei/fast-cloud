package io.xiaowei;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName ServerProviderApplication
 * @Description 启动类
 * @Author xiaowei
 * @Date 2020/5/4 2:07 下午
 * @Version 1.0
 **/
@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class ServerProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerProviderApplication.class, args);
        log.info(">>>>>>>> Server Provider Success >>>>>>>>");
    }

}
