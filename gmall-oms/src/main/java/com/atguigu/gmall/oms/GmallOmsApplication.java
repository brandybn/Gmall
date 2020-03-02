package com.atguigu.gmall.oms;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableDubbo
@SpringBootApplication
public class GmallOmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallOmsApplication.class, args);
    }

}
