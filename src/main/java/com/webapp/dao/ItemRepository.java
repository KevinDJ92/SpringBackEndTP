package com.webapp.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webapp.entity.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer> {
//
//	List<Item> findAll();
//	Item findOne(Integer idItem);
//	Item findByCodeProduit(Integer codeProduit);
//	Item findItemByUpc(String itemUpc);
//	<S extends Item> S save(Item monItem);
//	void delete(Item item);
	
}
