package com.kenzie.controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kenzie.model.Role;
import com.kenzie.service.RoleService;

@RestController
public class RoleController {
	@Autowired
	private RoleService service;
	
	@GetMapping("/role")
	public List<Role> listALL(){
		System.out.println("Testing");
		return service.listAllRole();
	}
	
	@GetMapping("/role/{id}")
    public ResponseEntity<Optional<Role>> selectRoleById(@PathVariable Integer id){
        try {
            Optional<Role> foundRole = service.getRoleById(id);
            return new ResponseEntity<>(foundRole, HttpStatus.OK);
        } catch(NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
	}

	@PostMapping("/role")
	public void addRole(@RequestBody Role role) {
		service.createRole(role);
	}
	
	@DeleteMapping("/role/{id}")
	public void deleteRole(@PathVariable Integer id) {
		service.deleteRole(id);
	}
	
	@PutMapping("/role/{id}")
	public void updateRole(@RequestBody Role role, @PathVariable Integer id) {
		service.updateRole(role, id);
	}
	
	
}