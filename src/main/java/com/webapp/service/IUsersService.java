package com.webapp.service;

import java.util.List;

import com.webapp.entity.Users;

public interface IUsersService {

    List<Users> getAllUsers();
    
    Users getUserById(int id_user);
    
    boolean createUser(Users users);
    
    void updateUser(Users users);
    
    void deleteUser(int id_user);
}
