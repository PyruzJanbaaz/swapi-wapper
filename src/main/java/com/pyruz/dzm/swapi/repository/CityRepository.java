package com.pyruz.dzm.swapi.repository;

import com.pyruz.dzm.swapi.model.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
}
