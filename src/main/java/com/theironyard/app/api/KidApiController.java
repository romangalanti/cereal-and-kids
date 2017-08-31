package com.theironyard.app.api;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theironyard.app.models.Kid;
import com.theironyard.app.services.KidRepository;

@RestController
@RequestMapping("/api/kids")
public class KidApiController {
	
	private KidRepository kidRepo;
	
	public KidApiController(KidRepository kidRepo) {
		this.kidRepo = kidRepo;
		
//		kidRepo.save(new Kid("Abir", 2));
//		kidRepo.save(new Kid("Penelope", 4));
//		kidRepo.save(new Kid("Matthew", 9));
//		kidRepo.save(new Kid("Gabrielle", 21));
	}

	@GetMapping("")
	public List<Kid> getAll() {
		return kidRepo.findAll();
	}
	
	@GetMapping("{id}")
	public Kid getOne(@PathVariable long id) throws StuffNotFoundException {
		Kid kid = kidRepo.findOne(id);
		if (kid == null) {
			throw new StuffNotFoundException();
		}
		return kid;
	}
	
	@DeleteMapping("{id}")
	public Kid delete(@PathVariable long id) {
		try {
			Kid kid = kidRepo.findOne(id);
			kidRepo.delete(id);
			return kid;
		} catch (EmptyResultDataAccessException erdae) {
			return null;
		}
	}
	
	@PostMapping("")
	public Kid create(@RequestBody Kid kid) {
		return kidRepo.save(kid);
	}
	
	@PutMapping("{id}")
	public Kid update(@RequestBody Kid kid, @PathVariable long id) {
		kid.setId(id);
		return kidRepo.save(kid);
	}
	
}














