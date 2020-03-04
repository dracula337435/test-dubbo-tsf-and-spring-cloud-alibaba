package io.dracula.test.dubbo.tsf.and.alibaba.provider;

import io.dracula.test.dubbo.tsf.and.alibaba.api.EchoService;

/**
 * @author dk
 */
@org.apache.dubbo.config.annotation.Service
public class EchoServiceImpl implements EchoService {

    public String echo(String msg) {
        return "[echo] "+msg;
    }
}
