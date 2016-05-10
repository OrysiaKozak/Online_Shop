package ua.kozak.servise.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.kozak.dao.imp.UserDAOImp;
import ua.kozak.entity.Role;
import ua.kozak.entity.User;
import ua.kozak.service.UserService;

@Service
public class UserServiceImp implements UserService{

	@Autowired
	private UserDAOImp userDAO;

	@Override
	@Transactional
	public void add(String firstName, String secondName, String email,
			String phoneNumber, String roleName) {
		userDAO.insert(new User(firstName, secondName, email, phoneNumber, new Role(roleName)));
	}

	@Override
	public List<User> getAllUsers() {
		return userDAO.getAllUsers();
	}

	@Override
	@Transactional
	public void update(int id, String firstName, String secondName,
			String email, String phoneNumber, String roleName) {
		User user = userDAO.findById(id);
		user.setFirstName(firstName);
		user.setSecondName(secondName);
		user.setEmail(email);
		user.setPhoneNumber(phoneNumber);
		user.setRole(new Role(roleName));
		userDAO.update(user);
	}

	@Override
	@Transactional
	public void remove(int id) {
		User user = userDAO.findById(id);
		userDAO.remove(user);
	}
}
