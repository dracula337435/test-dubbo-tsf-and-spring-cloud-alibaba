package io.dracula.test.dubbo.tsf.and.alibaba.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author dk
 */
@RestController
public class ConsumerNonDubboController {

    private static Logger logger = LoggerFactory.getLogger(ConsumerNonDubboController.class);

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/echoTemplate")
    public String echoTemplate() throws Exception{
        String result = restTemplate.getForObject("http://test-dubbo-tsf-alibaba-provider/echo", String.class);
        logger.info("echoTemplate将要返回："+result);
        return result;
    }

    @GetMapping("/redirectTemplate")
    public String redirectTemplate(){
        String result = restTemplate.getForObject("http://test-dubbo-tsf-alibaba-provider/testRedirect", String.class);
        logger.info("redirectTemplate将要返回："+result);
        return result;
    }

}
