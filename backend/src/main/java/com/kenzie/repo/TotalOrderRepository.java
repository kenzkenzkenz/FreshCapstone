package com.kenzie.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kenzie.model.TotalOrder;

public interface TotalOrderRepository extends JpaRepository<TotalOrder,Integer> {

}