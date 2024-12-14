package com.diva.jenkins_dockerImage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDockerImageApplication {

	public static void main(String[] args) {
		System.out.println("second commit");
		SpringApplication.run(JenkinsDockerImageApplication.class, args);
	}

}
