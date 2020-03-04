package io.dracula.test.dubbo.tsf.and.alibaba.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author dk
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerMain {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        SpringApplication.run(ConsumerMain.class, args);
    }

}
