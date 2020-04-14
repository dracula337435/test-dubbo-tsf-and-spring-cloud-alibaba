package io.dracula.test.dubbo.tsf.and.alibaba.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author dk
 */
@SpringBootApplication
public class ConsumerNonDubboMain {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        SpringApplication.run(ConsumerNonDubboMain.class, args);
    }

    @LoadBalanced
    @Bean
    public RestTemplate RestTemplate() {
        return new RestTemplate();
    }

}
