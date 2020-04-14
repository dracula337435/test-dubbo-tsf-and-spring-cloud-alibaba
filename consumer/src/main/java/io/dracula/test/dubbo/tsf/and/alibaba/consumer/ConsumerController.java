package io.dracula.test.dubbo.tsf.and.alibaba.consumer;

import io.dracula.test.dubbo.tsf.and.alibaba.api.EchoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dk
 */
@RestController
public class ConsumerController {

    private static Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private EchoByFeign echoByFeign;

    @GetMapping("/echoController")
    public String echoController(){
        String result = echoByFeign.echo(null);
        logger.info("将要返回："+result);
        return result;
    }

    @GetMapping("/redirectController")
    public String redirectController(){
        String result = echoByFeign.testRedirect();
        logger.info("将要返回："+result);
        return result;
    }

    @org.apache.dubbo.config.annotation.Reference
    private EchoService echoService;

    @GetMapping("/echoDubbo")
    public String echoDubbo(){
        String result = echoService.echo(null);
        logger.info("将要返回："+result);
        return result;
    }

}
