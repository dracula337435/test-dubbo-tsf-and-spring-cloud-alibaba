package io.dracula.test.dubbo.tsf.and.alibaba.consumer;

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

    @GetMapping("/remoteHello")
    public String toRemoteHello(){
        String result = echoByFeign.echo(null);
        logger.info("将要返回："+result);
        return result;
    }

}
