package com.sdl.bootadmin.service;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program flowerPaaS
 * @description: 服务监控
 * @author: songdeling
 * @create: 2019/12/23 15:31
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class AdminServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminServiceApplication.class, args);
    }
}
