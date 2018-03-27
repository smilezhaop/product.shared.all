package com.qingguatang.product.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"io.unreach.*.control", "io.unreach.*.service.impl"})
@MapperScan({"io.unreach.*.dao"})
public class TestApplication {

}
