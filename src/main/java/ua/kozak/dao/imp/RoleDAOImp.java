package ua.kozak.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ua.kozak.dao.RoleDAO;
import ua.kozak.entity.Role;

@Repository
public class RoleDAOImp implements RoleDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	public void insert(Role role){
		entityManager.persist(role);
	}
	
	public void remove(Role role){
		entityManager.remove(role);
	}
	
	public Role findById(int id){
		return entityManager.find(Role.class,id);
	}
	
	public List<Role> getAllRoles(){
		return entityManager.createQuery("from Role",Role.class).getResultList();
	}
	
	public void update(Role role){
		entityManager.merge(role);
	}
	
}
