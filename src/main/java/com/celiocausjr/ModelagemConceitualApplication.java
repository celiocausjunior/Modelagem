package com.celiocausjr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.celiocausjr.servicies.S3Service;

@SpringBootApplication
public class ModelagemConceitualApplication implements CommandLineRunner {

	@Autowired
	private S3Service s3Service;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ModelagemConceitualApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		s3Service.uploadFile("C:\\Users\\CASA\\iCloudDrive\\SpringBoot & Ionic\\diagrama.png");
		
	}
}
