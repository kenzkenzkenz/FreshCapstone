package com.kenzie.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kenzie.model.Bundle;

public interface BundleRepository extends JpaRepository<Bundle,Integer> {

}