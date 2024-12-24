package com.Demo.DemoMapping.DemoTest;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Demo.DemoMapping.EntityLayer.Category;
import com.Demo.DemoMapping.EntityLayer.MenuItem;
import com.Demo.DemoMapping.EntityLayer.Order;
import com.Demo.DemoMapping.EntityLayer.OrderItem;
import com.Demo.DemoMapping.EntityLayer.Status;
import com.Demo.DemoMapping.RepositoryLayer.MenuItemRepository;
import com.Demo.DemoMapping.RepositoryLayer.OrderRepository;

@SpringBootTest
public class RepositoryTest {
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private MenuItemRepository menuItemRepository;
	@Test
	public void saveWithItemTest()
	{
		MenuItem menuItem=new MenuItem();
		menuItem.setName("Pizza");
		menuItem.setPrice(120.00);
		menuItem.setAvailableQuantity(9);
		menuItem.setCategory(Category.MAIN_COURSE);
		
		menuItem=menuItemRepository.save(menuItem);
		
		Order order=new Order();
		order.setCustomerName("Boobalan");
		order.setCustomerphone("9487748320");
		order.setStatus(Status.READY);
		
		OrderItem orderItem=new OrderItem();
		orderItem.setMenuItem(menuItem);
		orderItem.setOrder(order);
		orderItem.setQuantity(5);
		orderItem.setSubtotal(600.00);
		
		order.setItems(List.of(orderItem));
	
		order=orderRepository.save(order);
		
	}
	
	

}
