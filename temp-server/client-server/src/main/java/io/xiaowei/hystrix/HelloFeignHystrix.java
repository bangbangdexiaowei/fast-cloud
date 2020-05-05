package io.xiaowei.hystrix;

import io.xiaowei.feign.HelloFeignApi;
import org.springframework.stereotype.Component;

/**
 * @ClassName HelloFeignHystrix
 * @Description 熔断
 * @Author xiaowei
 * @Date 2020/5/4 4:38 下午
 * @Version 1.0
 **/
@Component
public class HelloFeignHystrix implements HelloFeignApi {
    @Override
    public String hello() {
        return "Current service not available";
    }
}
