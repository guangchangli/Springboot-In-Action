package com.aladdin.config;

import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.Properties;

/**
 * @author lgc
 **/
//@Configuration
public class TkMapperConfig {
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactoryBean");
        mapperScannerConfigurer.setBasePackage("com.aladdin.mapper");

        Properties properties = new Properties();
        properties.setProperty("mappers", "com.aladdin.core.CoreMapper");
        properties.setProperty("notEmpty", "false");//insert、update是否判断字符串类型!='' 即 test="str != null"表达式内是否追加 and str != ''
        properties.setProperty("IDENTITY", "MYSQL");
        mapperScannerConfigurer.setProperties(properties);

        return mapperScannerConfigurer;
    }
}
