package com.webapp.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.webapp.entity.Systeme;

public interface SystemeRepository extends CrudRepository<Systeme, Integer> {

	List<Systeme> findAll();

	Systeme findOne(Integer systemeId);

	Systeme findByNom(String monSysteme);

	<S extends Systeme> S save(Systeme monSysteme);

	void delete(Systeme systeme);
	
}
