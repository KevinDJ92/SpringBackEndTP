package com.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.dao.ClientRepository;
import com.webapp.entity.Client;

@Service
public class ClientService implements IClientService {

	@Autowired 
	ClientRepository clientRepository;
	
	@Override
	public List<Client> getAllClient() {
		return clientRepository.findAll();
	}
	
	@Override
	public Client getClientById(Integer idClient) {
		return clientRepository.findOne(idClient);
	}
	
	@Override
	public Client getClientByClient(String nomClient) {
		return clientRepository.findByClient(nomClient);
	}
	
	@Override
	public Client getClientByAdresse(String adresseClient) {
		return clientRepository.findByAdresse(adresseClient);
	}
	
	@Override
	public Client getClientByNumeroTelephone(String numeroTelephone) {
		return clientRepository.findByTelephone(numeroTelephone);	
	}
	
	@Override
	public Client doUpdate(Client client) {
		
		Client clientUpdate = clientRepository.findOne(client.getId_client());
		
		clientUpdate.setClient(client.getClient());
		clientUpdate.setTelephone(client.getTelephone());
		clientUpdate.setContact(client.getContact());
		clientUpdate.setAdresse(client.getAdresse());
		clientUpdate.setDescription(client.getDescription());
		clientUpdate.setCode_utilisateur(client.getCode_utilisateur());
		
		
		return clientRepository.save(clientUpdate);
		
	
	}
	
	@Override
	public Client doAdd(Client client) {
		
		Client nouveauClient = new Client();
		
		nouveauClient.setClient(client.getClient());
		nouveauClient.setTelephone(client.getTelephone());
		nouveauClient.setContact(client.getContact());
		nouveauClient.setAdresse(client.getAdresse());
		nouveauClient.setDescription(client.getDescription());
		nouveauClient.setCode_utilisateur(client.getCode_utilisateur());
		
		return clientRepository.save(nouveauClient);
	}
}
