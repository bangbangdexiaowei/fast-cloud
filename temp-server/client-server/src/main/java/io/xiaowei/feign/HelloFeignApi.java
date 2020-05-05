package io.xiaowei.feign;

import io.xiaowei.hystrix.HelloFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "PROVIDER-SERVER", fallback = HelloFeignHystrix.class)
public interface HelloFeignApi {

    @GetMapping(value = "/hello")
    String hello();

}
