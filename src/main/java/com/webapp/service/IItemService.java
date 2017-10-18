package com.webapp.service;

import java.util.List;

import com.webapp.entity.Item;

public interface IItemService {

	List<Item> getAllItem();
	Item getItemById(Integer idItem);
	Item getItemByCommandeId(Integer idCommande);
	Item doUpdate(Item item);
	Item doAdd(Item item);
	void doDelete(Item item);
	void doDeleteByUpc(Item item);
}
