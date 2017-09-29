package com.webapp.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.entity.Users;

@Transactional
@Repository
public class UsersDAO implements IUsersDAO {
	
	@PersistenceContext	
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Users> getAllUsers() {
		String hql = "FROM Users ORDER BY id_user DESC";
		return (List<Users>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public Users getUsersById(int id_user) {
		return entityManager.find(Users.class, id_user);
	}

	@Override
	public void createUser(Users user) {
		entityManager.persist(user);
	}

	@Override
	public void updateUser(Users user) {
		Users u = getUsersById(user.getId_user());
		
		u.setFirst_name(user.getFirst_name());
		u.setLast_name(user.getLast_name());
		
		entityManager.flush();
	}

	@Override
	public void deleteUser(int id_user) {
		entityManager.remove(getUsersById(id_user));
	}

	@Override
	public boolean UserExists(String first_name, String last_name) {
		String hql = "FROM Users WHERE first_name = ? AND last_name = ?";
		
		int count = entityManager.createQuery(hql).setParameter(1, first_name)
	              .setParameter(2, last_name).getResultList().size();
		
		return count > 0 ? true : false;
	}	
	
} 