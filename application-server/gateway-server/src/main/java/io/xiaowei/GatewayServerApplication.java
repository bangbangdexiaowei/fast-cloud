package io.xiaowei;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName GatewatServerApplication
 * @Description 启动类
 * @Author xiaowei
 * @Date 2020/5/4 6:12 下午
 * @Version 1.0
 **/
@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class GatewayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServerApplication.class, args);
        log.info(">>>>>>>> Gateway Server Start Success >>>>>>>>");
    }

}
