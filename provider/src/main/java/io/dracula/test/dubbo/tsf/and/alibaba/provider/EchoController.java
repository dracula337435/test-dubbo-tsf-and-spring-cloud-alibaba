package io.dracula.test.dubbo.tsf.and.alibaba.provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dk
 */
@RestController
public class EchoController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "world") String name){
        return "hello "+name;
    }

}
