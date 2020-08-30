package com.baidu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName
 * @Description //TODO
 * @Author zhujialong
 * @Date
 * @Version V1.0
 **/
@SpringBootApplication
@EnableEurekaServer  //声明服务注册中心
public class RunEurekaServerApplication {


    public static void main(String[] args) {
        SpringApplication.run(RunEurekaServerApplication.class);
    }


}
