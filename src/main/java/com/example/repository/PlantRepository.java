package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Plant;

public interface PlantRepository extends JpaRepository<Plant, Long> {
}
