package com.Demo.DemoMapping.RepositoryLayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Demo.DemoMapping.EntityLayer.OrderItem;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
