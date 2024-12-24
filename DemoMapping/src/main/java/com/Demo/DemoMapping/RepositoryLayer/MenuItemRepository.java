package com.Demo.DemoMapping.RepositoryLayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Demo.DemoMapping.EntityLayer.MenuItem;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem,Long> {

}
