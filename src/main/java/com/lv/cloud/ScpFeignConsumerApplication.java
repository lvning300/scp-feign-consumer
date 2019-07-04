package com.lv.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
@EnableFeignClients
@SpringCloudApplication
public class ScpFeignConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScpFeignConsumerApplication.class, args);
    }

}
