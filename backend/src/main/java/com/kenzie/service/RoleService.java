package com.kenzie.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kenzie.repo.RoleRepository;
import com.kenzie.model.Role;

@Service
public class RoleService {
	@Autowired
	private RoleRepository repo;

	//READ ALL ROLES
	public List<Role> listAllRole() {
		return repo.findAll();
	}
	
	//POST ROLE
	public void createRole(Role role) {
		  repo.save(role);
	}
	
	//READ ROLE BY ID
	public Optional<Role> getRoleById(Integer id) {
		return repo.findById(id);
	}
	
	//DELETE ROLE
	public void deleteRole(Integer id) {
		repo.deleteById(id);
	}
	
	//UPDATE ROLE
	public void updateRole(Role role, Integer id) {
		role.setRoleId(id);
		role.setRoleName(role.getRoleName());
		repo.saveAndFlush(role);
	}

}