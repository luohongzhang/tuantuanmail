package com.luohz.tuantuan.gateway;

import io.renren.datasource.annotation.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication()
public class TuantuanGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TuantuanGatewayApplication.class, args);
	}

}
