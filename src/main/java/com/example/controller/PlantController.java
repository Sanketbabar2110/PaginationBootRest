package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.PageSettings;
import com.example.entity.PlantResponse;
import com.example.service.PlantService;

@RestController()
@RequestMapping("/plant")
public class PlantController {

	private PlantService plantService;
	private PageSettings pageSettings;

	@Autowired
	PlantController(PlantService plantService, PageSettings pageSettings) {
		this.plantService = plantService;
		this.pageSettings = pageSettings;
	}

	@GetMapping("/page")
	public PlantResponse getPlantPage(@RequestParam(value = "page", defaultValue = "0") int page,
			@RequestParam(value = "elementsPerPage", defaultValue = "3") int elementsPerPage) {
		pageSettings.setPage(page);
		pageSettings.setElementPerPage(elementsPerPage);
		return plantService.getPlantPage(pageSettings);
	}
}
