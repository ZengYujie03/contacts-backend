package com.hell;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 启动程序
 * 
 * @author hell
 */
@MapperScan(basePackages = "com.hell.crud.mapper")
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class HellApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(HellApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  crud系统启动成功， ლ(´ڡ`ლ)ﾞ ");
    }
}
