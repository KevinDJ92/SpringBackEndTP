package com.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.dao.IUsersDAO;
import com.webapp.entity.Users;

@Service
public class UsersService implements IUsersService {
	
	@Autowired
	private IUsersDAO usersDAO;
	
	@Override
	public List<Users> getAllUsers() {
		return usersDAO.getAllUsers();
	}
	

	@Override
	public Users getUserById(int id_user) {
		Users obj = usersDAO.getUsersById(id_user);
		return obj;

	}

	@Override
	public synchronized boolean createUser(Users user) {
		if (usersDAO.UserExists(user.getFirst_name(), user.getLast_name())) {
			return false;
		} 
		else {	
			usersDAO.createUser(user);
			return true;
		}
	}
	
	@Override
	public void updateUser(Users user) {
		usersDAO.updateUser(user);
	}

	@Override
	public void deleteUser(int id_user) {
		usersDAO.deleteUser(id_user);
	}
	
}
