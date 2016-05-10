package ua.kozak.service;

import java.util.List;

import ua.kozak.entity.User;

public interface UserService {

	public void add(String firstName, String secondName, String email,
			String phoneNumber, String roleName);

	public List<User> getAllUsers();

	public void update(int id,String firstName, String secondName, String email,
			String phoneNumber, String roleName);

	public void remove(int id);
}
