package com.example.demo.animalsAPI;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.animalsAPI.AnimalsAPIData.Animals;

@Service
public class AnimalsAPIService {

	private final AnimalsAPIRepository animalsAPIRepository;

	public AnimalsAPIService(AnimalsAPIRepository animalsAPIRepository) {
		this.animalsAPIRepository = animalsAPIRepository;
	}

	public List<Animals> getAnimals() throws IOException {

		Animals[] animalsList = animalsAPIRepository.getAnimals();
		
		return Arrays.asList(animalsList);
	
	}
	
	public List<Animals> picAnimals(String pic) throws IOException{
		
		Animals[] picList = animalsAPIRepository.picAnimals(pic);
		
		return Arrays.asList(picList);
		
	}

}
