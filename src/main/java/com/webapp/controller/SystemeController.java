package com.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp.entity.Produit;
import com.webapp.entity.Systeme;
import com.webapp.service.ISystemeService;

@Controller
@RequestMapping("/systeme")
@CrossOrigin(origins = { "*" })
public class SystemeController {

	@Autowired
	private ISystemeService systemeService;

	@GetMapping("/all-systemes")
	public ResponseEntity<List<Systeme>> getAllSysteme() {
		List<Systeme> listeSysteme = systemeService.getAllSysteme();

		return new ResponseEntity<List<Systeme>>(listeSysteme, HttpStatus.OK);

	}

	@GetMapping("/nom/{nom}")
	public ResponseEntity<Systeme> getProduitUpc(@PathVariable("nom") String monNom) {
		Systeme monSystemeNom = systemeService.getSystemeByNom(monNom);

		return new ResponseEntity<Systeme>(monSystemeNom, HttpStatus.OK);
	}

	@PutMapping("/update-systeme")
	public ResponseEntity update(@RequestBody Systeme systeme) {

		Systeme reponseDuServiceSysteme = systemeService.doUpdate(systeme);

		return new ResponseEntity<>(reponseDuServiceSysteme, HttpStatus.OK);

	}

}
