package com.cdn.octopus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    FileStorageProperties.class
})
public class OctopusApplication {

	public static void main(String[] args) {
		SpringApplication.run(OctopusApplication.class, args);
	}

}
