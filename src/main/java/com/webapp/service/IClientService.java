package com.webapp.service;

import java.util.List;

import com.webapp.entity.Client;

public interface IClientService {

	List<Client> getAllClient();
	Client getClientById(Integer idClient);
	Client getClientByClient(String monClient);
	Client getClientByAdresse(String monAdresse);
	Client getClientByNumeroTelephone(String monNumeroTelephone);
	Client doUpdate(Client client);
	Client doAdd(Client client);
}
