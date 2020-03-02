package com.atguigu.gmall.pms;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * oms,pms,ums,sms 都应该做以下几步
 *  1. 整合mybatis plus
 *      1.1 引入mybatis plus的依赖(本项目是在gmall-api中引入的)
 *      1.2 引入数据源依赖(mybatis plus默认会导入jdbc starter)
 *  2. 整合dubbo
 *      2.1 引入dubbo的依赖(在gmall-api完成)
 *  3. 整合logstash
 *      3.1 引入logstash的依赖(gmall_api)
 *      3.2 引入日志配置文件(配置文件里面配置了日志与logstash的通讯)
 *      3.3 在kibana李米娜家里好日志的索引(本项目是applog*)
 */

@MapperScan(basePackages = "com.atguigu.gmall.pms.mapper") // mybatis plus 整合
@EnableDubbo // 整合dubbo
@SpringBootApplication
public class GmallPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallPmsApplication.class, args);
    }

}
