package io.dracula.test.dubbo.tsf.and.alibaba.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dk
 */
@RestController
public class ConsumerController {

    @Autowired
    private EchoByFeign echoByFeign;

    @GetMapping("/remoteHello")
    public String toRemoteHello(){
        return echoByFeign.say(null);
    }

}
