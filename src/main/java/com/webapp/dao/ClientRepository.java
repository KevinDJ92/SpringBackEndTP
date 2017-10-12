package com.webapp.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.webapp.entity.Client;

public interface ClientRepository extends CrudRepository<Client, Integer>{

	List<Client> findAll();
	Client findOne(Integer idClient);
	Client findByTelephone(String numeroTelephone);
	Client findByClient(String nomClient);
	Client findByAdresse(String adresseClient);
	<S extends Client> S save(Client monClient);
	
	
}
