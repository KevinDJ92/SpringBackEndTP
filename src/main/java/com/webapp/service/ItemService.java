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
		
		addItem.setIdItem(item.getIdItem());
		addItem.setIdCommande(item.getIdCommande());
		addItem.setCodeProduit(item.getCodeProduit());
		addItem.setUpc(item.getUpc());
		addItem.setQuantite(item.getQuantite());
		addItem.setPrixAchat(item.getPrixAchat());
		addItem.setPrixVendant(item.getPrixVendant());
		addItem.setPrixAjuste(item.getPrixAjuste());
		
		return itemRepository.save(addItem);
		
	}
	
	@Override
	public Item doUpdate(Item item) {
		
		Item updateItem = itemRepository.findOne(item.getIdItem());


		updateItem.setIdItem(item.getIdItem());
		updateItem.setIdCommande(item.getIdCommande());
		updateItem.setCodeProduit(item.getCodeProduit());
		updateItem.setUpc(item.getUpc());
		updateItem.setQuantite(item.getQuantite());
		updateItem.setPrixAchat(item.getPrixAchat());
		updateItem.setPrixVendant(item.getPrixVendant());
		updateItem.setPrixAjuste(item.getPrixAjuste());
		

        return itemRepository.save(updateItem);
	}
	
	@Override
	public void doDelete(Item item) {
		Item deleteItem = itemRepository.findOne(item.getIdItem());
		
		itemRepository.delete(deleteItem);
	}
	
	@Override
	public void doDeleteByUpc(Item item) {
		Item deleteItemByUpc = itemRepository.findItemByUpc(item.getUpc());
		
		itemRepository.delete(deleteItemByUpc);
	}
}
