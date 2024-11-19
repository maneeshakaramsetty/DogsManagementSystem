package com.example.DMS.repository;

//@author MANEESHA KARAMSETTY-S564554

import java.util.List;

//@author MANEESHA KARAMSETTY-S564554

import org.springframework.data.repository.CrudRepository;

import com.example.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
List<Dog> findByName(String name);
}
