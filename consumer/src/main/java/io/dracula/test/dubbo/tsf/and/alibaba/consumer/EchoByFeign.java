package io.dracula.test.dubbo.tsf.and.alibaba.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author dk
 */
@FeignClient("test-dubbo-tsf-alibaba-provider")
public interface EchoByFeign {

    @GetMapping("/hello")
    String say(@RequestParam(value = "name", defaultValue = "world") String name);

}
