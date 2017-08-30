package com.theironyard.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.theironyard.app.models.Cereal;
import com.theironyard.app.models.CerealManufacturer;
import com.theironyard.app.services.CerealManufacturerRepository;
import com.theironyard.app.services.CerealRepository;

@Controller
@RequestMapping("/cereals")
public class CerealController {
	
	@Autowired
	private CerealRepository cerealRepo;
	
	@Autowired
	private CerealManufacturerRepository manuRepo;
	
	@PostMapping("")
	public String createCereal(String name, int yearIntroduced, long manufacturer_id) {
		CerealManufacturer manu = manuRepo.findOne(manufacturer_id);
		Cereal cereal = new Cereal(name, yearIntroduced);
		cereal.setManufacturer(manu);
		cerealRepo.save(cereal);
		return "redirect:/cereals";
	}
	
	@PostMapping("manufacturers/{id}/delete")
	public String deleteManufacturer(@PathVariable long id) {
		manuRepo.delete(id);
		return "redirect:/cereals";
	}
	
	@PostMapping("manufacturers")
	public String createManufacturer(String name) {
		manuRepo.save(new CerealManufacturer(name));
		return "redirect:/cereals";
	}
	
	@GetMapping("")
	public ModelAndView showDefault() {
		ModelAndView mv = new ModelAndView("cereals/default");
		mv.addObject("manufacturers", manuRepo.findAll());
		mv.addObject("cereals", cerealRepo.findAll());
		return mv;
	}

}










