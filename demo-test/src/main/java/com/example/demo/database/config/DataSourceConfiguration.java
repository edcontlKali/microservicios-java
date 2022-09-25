package com.example.demo.database.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfiguration {
	
	@Bean(name="myDataSource")
    @ConfigurationProperties("spring.datasource.hikari")
    public DataSource myDataSource() {
        return DataSourceBuilder.create().build();
    }

}
