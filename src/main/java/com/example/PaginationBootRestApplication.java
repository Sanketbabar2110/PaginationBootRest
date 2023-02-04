package com.example;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.entity.Plant;
import com.example.repository.PlantRepository;

@SpringBootApplication
public class PaginationBootRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaginationBootRestApplication.class, args);
	}

//	@Bean
//	public ApplicationRunner run(PlantRepository plantRepository) throws Exception {
//		return (ApplicationArguments args) -> {
//			List<Plant> plants = Arrays.asList(
//					new Plant("subalpine fir", "abies lasiocarpa", "pinaceae"),
//					new Plant("sour cherry", "prunus cerasus", "rosaceae"),
//					new Plant("asian pear", "pyrus pyrifolia", "rosaceae")
//			);
//			plantRepository.saveAll(plants);
//		};
//	}
}
