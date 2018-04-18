package com.webapp.service;

import java.util.List;

import com.webapp.entity.Systeme;

public interface ISystemeService {

	List<Systeme> getAllSysteme();

	Systeme getSystemeById(Integer systemeId);

	Systeme getSystemeByNom(String monSysteme);

	Systeme doUpdate(Systeme systeme);

	Systeme doAdd(Systeme systeme);

	void doDelete(Systeme systeme);

	void doDeleteByNom(Systeme systeme);

	
}
