package com.webapp.service;

import java.util.List;

import com.webapp.entity.Item;

public interface IItemService {

	List<Item> getAllItem();
	Item getItemById(Integer idItem);
	Item getCommandeById(Integer idCommande);
	Item getClientByAdresse(String monAdresse);
	Item getClientByNumeroTelephone(String monNumeroTelephone);
	Item doUpdate(Item item);
	Item doAdd(Item item);
	Item doRemove(Item item);
}
