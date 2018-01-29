package com.poc.corporatesociety.Order;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.corporatesociety.Customer.Customer;

@RestController
@RequestMapping("/order")
public class OrderController {
	private OrderRepository orderRepository;

	public OrderController(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}
	
	@PostMapping("/placeOrder")
	public void placeOrder(@RequestBody Order order){
		this.orderRepository.insert(order);
	}
	
	@PostMapping("/updateOrder")
	public void updateOrder(@RequestBody Order orderObj) {
		this.orderRepository.save(orderObj);
	}
	
	@DeleteMapping("/deleteOrder/{id}")
	public void deleteOrder(@PathVariable("id") String id) {
		this.orderRepository.delete(id);
	}
}
