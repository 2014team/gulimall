package com.atguigu.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/***
 * 使用nacos作为配置中心
 * 1、依赖
 *  <!--nacos 配置中心-->
 *         <dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *         </dependency>
 *
 *
 *         <dependency>
 *             <groupId>org.springframework.cloud</groupId>
 *             <artifactId>spring-cloud-starter-bootstrap</artifactId>
 *             <version>3.1.6</version>
 *         </dependency>
 *
 *
 *
 * 2、创建一文件bootstrap.properties
 * # 配置中心地址
 * spring.application.name=gulimaill-coupon
 * spring.cloud.nacos.config.server-addr=192.168.34.150:8848
 * spring.cloud.nacos.config.file-extension=yaml
 *
 * 3、配置中心创建 gulimaill-coupon.yaml
 *
 * 4、新增动态刷新配置
 * @RefreshScope
 *
 *
 *
 */
@MapperScan("com.atguigu.gulimall.coupon.dao") //
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
