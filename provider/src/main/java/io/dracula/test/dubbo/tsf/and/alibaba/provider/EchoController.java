package io.dracula.test.dubbo.tsf.and.alibaba.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dk
 */
@RestController
public class EchoController {

    private static Logger logger = LoggerFactory.getLogger(EchoController.class);

    @GetMapping("/echo")
    public String echo(@RequestParam(value = "msg", defaultValue = "hello") String msg){
        String result = "[echo from controller] "+msg;
        logger.info("将要返回："+result);
        return result;
    }

}
