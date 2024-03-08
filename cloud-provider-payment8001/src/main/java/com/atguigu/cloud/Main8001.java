package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @auther zzyy
 * @create 2023-11-04 15:19
 */
@SpringBootApplication
@MapperScan("com.atguigu.cloud.mapper")
public class Main8001
{
    public static void main(String[] args)
    {
        System.out.println("http://localhost:8001/swagger-ui/index.html#");
        SpringApplication.run(Main8001.class,args);
    }
}

