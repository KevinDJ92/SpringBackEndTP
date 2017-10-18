package com.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp.entity.Item;
import com.webapp.service.IItemService;

@Controller
@RequestMapping("items")
@CrossOrigin(origins = {"*"})
public class ItemController {

	@Autowired
	IItemService itemService;
	
	@GetMapping("/all-items")
	public ResponseEntity<List<Item>> getAllItem() {
		List<Item> listeItem = itemService.getAllItem();
		
		return new ResponseEntity<List<Item>>(listeItem,HttpStatus.OK);
	}
	
	@GetMapping("/idItem/{id_item}")
	public ResponseEntity<Item> getItemById(@PathVariable("id_item") Integer idItem) {
		Item item = itemService.getItemById(idItem);
		
		return new ResponseEntity<Item>(item,HttpStatus.OK);
	}
	
	@GetMapping("/idCommande/{id_commande}")
	public ResponseEntity<Item> getCommandeById(@PathVariable("id_commande") Integer idCommande) {
		Item item = itemService.getItemByCommandeId(idCommande);
		
		return new ResponseEntity<Item>(item,HttpStatus.OK);
	}
	
	@PostMapping("/add-item")
	public ResponseEntity<Item> add(@RequestBody Item item) {
		Item reponseItemService = itemService.doAdd(item);
		
		return new ResponseEntity<>(reponseItemService,HttpStatus.OK);
	}
	
	@PutMapping("/update-item")
	public ResponseEntity update(@RequestBody Item item) {
		Item reponseItemService = itemService.doUpdate(item);
		
		return new ResponseEntity<>(reponseItemService,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete-item")
	public ResponseEntity delete(@RequestBody Item item) {
		itemService.doDelete(item);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/delete-item-upc")
	public ResponseEntity deleteByUpc(@RequestBody Item item) {
		itemService.doDelete(item);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
