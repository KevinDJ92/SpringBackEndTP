package com.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.dao.ItemRepository;
import com.webapp.entity.Item;
import com.webapp.entity.Produit;

@Service
public class ItemService implements IItemService {
	
	@Autowired
	ItemRepository itemRepository;
	
	@Override
	public List<Item> getAllItem() {
		return itemRepository.findAll();
	}

	@Override
	public Item getItemById(Integer itemId) {
		return itemRepository.findOne(itemId);
	}
	//Plus important travailler sur recherche par idCommande
	@Override
	public Item getItemByCommandeId(Integer commandeId) {
		return itemRepository.findOne(commandeId);
	}
	
	@Override
	public Item doAdd(Item item) {
		
		Item addItem = new Item();
		
		addItem.setId_item(item.getId_item());
		addItem.setId_commande(item.getId_commande());
		addItem.setCode_produit(item.getCode_produit());
		addItem.setUpc(item.getUpc());
		addItem.setQuantite(item.getQuantite());
		addItem.setPrix_achat(item.getPrix_achat());
		addItem.setPrix_vendant(item.getPrix_vendant());
		addItem.setPrix_ajuste(item.getPrix_ajuste());
		
		return itemRepository.save(addItem);
		
	}
	
	@Override
	public Item doUpdate(Item item) {
		
		Item updateItem = itemRepository.findOne(item.getId_item());


		updateItem.setId_item(item.getId_item());
		updateItem.setId_commande(item.getId_commande());
		updateItem.setCode_produit(item.getCode_produit());
		updateItem.setUpc(item.getUpc());
		updateItem.setQuantite(item.getQuantite());
		updateItem.setPrix_achat(item.getPrix_achat());
		updateItem.setPrix_vendant(item.getPrix_vendant());
		updateItem.setPrix_ajuste(item.getPrix_ajuste());
		

        return itemRepository.save(updateItem);
	}
	
	@Override
	public void doDelete(Item item) {
		Item deleteItem = itemRepository.findOne(item.getId_item());
		
		itemRepository.delete(deleteItem);
	}
	
	@Override
	public void doDeleteByUpc(Item item) {
		Item deleteItemByUpc = itemRepository.findItemByUpc(item.getUpc());
		
		itemRepository.delete(deleteItemByUpc);
	}
}
