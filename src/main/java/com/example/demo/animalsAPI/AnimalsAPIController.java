package com.example.demo.animalsAPI;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.animalsAPI.AnimalsAPIData.Animals;

@Controller
public class AnimalsAPIController {

	private final AnimalsAPIService animalsAPIService;

	public AnimalsAPIController(AnimalsAPIService animalsAPIService) {
		this.animalsAPIService = animalsAPIService;
	}

	@GetMapping("/animals")
	public String animalsAPI(Model model) throws IOException {

		List<Animals> animalsList = animalsAPIService.getAnimals();

		model.addAttribute("animalsList", animalsList);

		return "animalsAPI.html";

	}

	@PostMapping("/animals")
	public String picPets(@RequestParam("/animals") String pic, Model model) throws IOException {

		List<Animals> picList = animalsAPIService.picAnimals(pic);

		model.addAttribute("picList", picList);

		return "animalsResult.html";

	}

}
