package ua.kozak.dao;

import java.util.List;

import ua.kozak.entity.Role;

public interface RoleDAO {

	void insert(Role role);
	
	void remove(Role role);
	
	Role findById(int id);
	
	List<Role> getAllRoles();
	
	void update(Role role);
}
