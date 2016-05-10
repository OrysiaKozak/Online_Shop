package ua.kozak.service;

import java.util.List;

import ua.kozak.entity.Role;

public interface RoleService {

	public void add(String name);

	public List<Role> getAllRole();

	public void update(int id,String name);

	public void remove(int id);
}
