package io.dracula.test.dubbo.tsf.and.alibaba.provider;

import io.dracula.test.dubbo.tsf.and.alibaba.api.EchoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author dk
 */
@org.apache.dubbo.config.annotation.Service
public class EchoServiceImpl implements EchoService {

    private static Logger logger = LoggerFactory.getLogger(EchoServiceImpl.class);

    public String echo(String msg) {
        String result = "[echo from dubbo] "+msg;
        logger.info("将要返回："+result);
        return result;
    }
}
