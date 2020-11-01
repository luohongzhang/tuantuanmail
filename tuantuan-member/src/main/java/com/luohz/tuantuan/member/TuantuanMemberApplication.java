package com.luohz.tuantuan.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.luohz.tuantuan.member.feign")
public class TuantuanMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(TuantuanMemberApplication.class, args);
	}

}
