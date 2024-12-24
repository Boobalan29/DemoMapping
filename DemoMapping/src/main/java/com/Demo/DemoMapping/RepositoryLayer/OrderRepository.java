package com.Demo.DemoMapping.RepositoryLayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Demo.DemoMapping.EntityLayer.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

}
