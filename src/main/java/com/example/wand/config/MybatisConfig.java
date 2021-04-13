package com.example.wand.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.aop.interceptor.PerformanceMonitorInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author TangZT
 */
@Configuration
public class MybatisConfig {
    @Bean
    public MapperScannerConfigurer MapperScannerConfigurer(){
        // 容器启动时，创建MapperScannerConfigurer对象
        MapperScannerConfigurer scannerConfigurer = new MapperScannerConfigurer();
        // basePackage属性值为mapper接口的包路径
        scannerConfigurer.setBasePackage("com.example.wand.mapper");
        return scannerConfigurer;
    }

}
