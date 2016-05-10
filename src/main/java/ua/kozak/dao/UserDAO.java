package ua.kozak.dao;

import java.util.List;

import ua.kozak.entity.User;

public interface UserDAO {

	void insert(User user);
	
	User findById(int id);
	
	List<User> getAllUsers();
	
	void remove(User user);
	
	void update(User user);
}
