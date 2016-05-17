package ua.kozak.servise.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.kozak.dao.RoleDAO;
import ua.kozak.entity.Role;
import ua.kozak.service.RoleService;

@Service
public class RoleServiceImp implements RoleService{

	@Autowired
	private RoleDAO roleDAO;
	
	@Override
	@Transactional
	public void add(String name) {
		roleDAO.insert(new Role(name));
	}

	@Override
	public List<Role> getAllRole() {
		return roleDAO.getAllRoles();
	}

	@Override
	@Transactional
	public void update(int id,String name) {
		Role role = roleDAO.findById(id);
		role.setName(name);
		roleDAO.insert(role);
	}

	@Override
	@Transactional
	public void remove(int id) {
		Role role = roleDAO.findById(id);
		roleDAO.remove(role);
	}

}
