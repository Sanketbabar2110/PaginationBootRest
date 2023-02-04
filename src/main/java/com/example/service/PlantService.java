package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.PageSettings;
import com.example.entity.Plant;
import com.example.entity.PlantResponse;
import com.example.repository.PlantRepository;

@Transactional
@Service
public class PlantService {

	private PlantRepository plantRepository;
	private PlantResponse response;

	@Autowired
	public PlantService(PlantRepository plantRepository, PlantResponse response) {
		this.plantRepository = plantRepository;
		this.response = response;
	}

	public PlantResponse getPlantPage(@NonNull PageSettings pageSetting) {

//        Sort plantSort = pageSetting.buildSort();
		
//		create Pageable instance
		Pageable plantPage = PageRequest.of(pageSetting.getPage(), pageSetting.getElementPerPage());

		Page<Plant> plants = plantRepository.findAll(plantPage);
		
//		get content for page object
		List<Plant> listOfPlants = plants.getContent();
		
//		List<PlantDTO> content = listOfPlants.stream().map(plant -> mapToDto(plant)).collect(Collectors.toList());
		
//		create response to return
		response.setContent(listOfPlants);
		response.setPageNo(plants.getNumber());
		response.setElementsPerPage(plants.getSize());
		response.setTotalElements(plants.getTotalElements());
		response.setTotalPages(plants.getTotalPages());
		response.setLast(plants.isLast());

		return response;
	}
	
//	@Autowired
//	PlantDTO plantDto;
//	
//	@Autowired
//	Plant plant;
//
//    // convert Entity into DTO
//    public PlantDTO mapToDto(Plant plant){
//    	plantDto.setId(plant.getId());
//    	plantDto.setName(plant.getName());
//    	plantDto.setFamily(plant.getFamily());
//    	plantDto.setScientificName(plant.getScientificName());
//    	plantDto.setCreatedAt(plant.getCreatedAt());
//        return plantDto;
//    }
//
//    // convert DTO to entity
//    public Plant mapToEntity(PlantDTO plantDto){
//       plant.setId(plantDto.getId());
//       plant.setName(plantDto.getName());
//       plant.setFamily(plantDto.getFamily());
//       plant.setScientificName(plantDto.getScientificName());
//       plant.setCreatedAt(plantDto.getCreatedAt());
//        return plant;
//    }
}
