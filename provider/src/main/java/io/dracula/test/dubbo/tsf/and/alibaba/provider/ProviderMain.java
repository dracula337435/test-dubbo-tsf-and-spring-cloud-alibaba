package io.dracula.test.dubbo.tsf.and.alibaba.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author dk
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderMain {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        SpringApplication.run(ProviderMain.class, args);
    }

}
