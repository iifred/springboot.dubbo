package com.springboot;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CusumerUserApplicationTests {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    void contextLoads() {
//        String hello = userTicketService.hello();
//        logger.debug("买到票了:"+hello);
    }

}
