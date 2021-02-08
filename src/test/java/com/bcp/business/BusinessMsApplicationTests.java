package com.bcp.business;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootTest
@EnableSwagger2
@EnableFeignClients
class BusinessMsApplicationTests {

    @Test
    void contextLoads() {
    }

}
