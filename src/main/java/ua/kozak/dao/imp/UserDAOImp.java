package ua.kozak.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ua.kozak.dao.UserDAO;
import ua.kozak.entity.User;

@Repository
public class UserDAOImp implements UserDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	public void insert(User user){
		entityManager.persist(user);
	}
	
	public User findById(int id){
		return entityManager.find(User.class, id);
	}
	
	public List<User> getAllUsers(){
		return entityManager.createQuery("from User", User.class).getResultList();
	}
	
	public void remove(User user){
		entityManager.remove(user);
	}
	
	public void update(User user){
		entityManager.merge(user);
	}
}
