package com.webapp.dao;

import java.util.List;

import com.webapp.entity.Users;

public interface IUsersDAO {
    List<Users> getAllUsers();
    
    Users getUsersById(int id_user);
    
    void createUser(Users user);
    
    void updateUser(Users user);
    
    void deleteUser(int id_user);
    
    boolean UserExists(String first_name, String last_name);
} 
