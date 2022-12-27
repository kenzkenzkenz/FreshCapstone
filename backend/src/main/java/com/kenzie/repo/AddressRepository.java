package com.kenzie.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kenzie.model.Address;

public interface AddressRepository extends JpaRepository<Address,Integer> {

}