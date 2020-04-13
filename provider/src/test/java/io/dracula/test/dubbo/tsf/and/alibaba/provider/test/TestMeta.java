package io.dracula.test.dubbo.tsf.and.alibaba.provider.test;

import com.alibaba.cloud.dubbo.service.DubboMetadataService;
import io.dracula.test.dubbo.tsf.and.alibaba.api.EchoService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author dk
 */
@RunWith(SpringRunner.class)
public class TestMeta {

    private static Logger logger = LoggerFactory.getLogger(TestMeta.class);

    @Reference(url = "dubbo://localhost:20880", group = "test-dubbo-tsf-alibaba-provider", version = "1.0.0")
    private DubboMetadataService dubboMetadataService;

    @Test
    public void testMetaDataService(){
        logger.info("ServiceRestMetadata: "+dubboMetadataService.getServiceRestMetadata());
        logger.info("AllExportedURLs: "+dubboMetadataService.getAllExportedURLs());
        logger.info("AllServiceKeys: "+dubboMetadataService.getAllServiceKeys());
    }

    @Reference(url = "dubbo://localhost:20880")
    private EchoService echoService;

    @Test
    public void testInvokeToInterface(){
        logger.info(""+echoService.echo("some message"));
    }

    /**
     * @author dk
     */
    @Configuration
    @DubboComponentScan
    static class Config{

        @Bean
        public ApplicationConfig applicationConfig(){
            return new ApplicationConfig("test");
        }

    }

}
