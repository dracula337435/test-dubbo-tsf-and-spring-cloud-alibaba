package io.dracula.test.dubbo.tsf.and.alibaba.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author dk
 */
@Controller
public class TestRedirctController {

    private static Logger logger = LoggerFactory.getLogger(TestRedirctController.class);

    /**
     *
     * @return
     */
    @GetMapping("testRedirect")
    public String testRedirect(){
        logger.info("将要跳转至echo");
        return "redirect:echo";
    }

}
