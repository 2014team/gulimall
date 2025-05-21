package com.atguigu.gulimall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *1、远程调用服务
 *  1》引入openfeign
 *        <dependency>
 *             <groupId>org.springframework.cloud</groupId>
 *             <artifactId>spring-cloud-starter-openfeign</artifactId>
 *         </dependency>
 *
 *
 *          <dependency>
 *             <groupId>org.springframework.cloud</groupId>
 *             <artifactId>spring-cloud-starter-loadbalancer</artifactId>
 *         </dependency>
 *
 *  2》编写一个接口，告诉springCloude这个接口需要调用远程服务
 *    2.1 声明接口的每一个方法都说调用那个远程服务的那个请求
 *
 * 3》开启远程调用功能
 *   @EnableFeignClients(basePackages = "com.atguigu.gulimall.member.feign")
 *
 */

@EnableFeignClients(basePackages = "com.atguigu.gulimall.member.feign")
@MapperScan("com.atguigu.gulimall.member.dao") //
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication .class, args);
    }

}
