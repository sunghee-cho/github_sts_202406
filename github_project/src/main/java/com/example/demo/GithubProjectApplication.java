package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@ComponentScan(basePackages="boardmapper")
@MapperScan(basePackages="boardmapper")
@ComponentScan(basePackages="db_jasypt")

public class GithubProjectApplication {

	public static void main(String[] args) {
		//tomcat server 실행
		SpringApplication.run(GithubProjectApplication.class, args);
		System.out.println("깃헙 연동 프로젝트 테스트 ");

		System.out.println("sub1 브랜치 조원 추가 테스트 ");

	}

}
