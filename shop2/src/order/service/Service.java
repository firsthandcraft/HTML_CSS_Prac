package order.service;

import java.util.ArrayList;

import model.Order;
import model.Product;

public interface Service {
	void addOrder(Order o);
	Order getOrder(int num);
	ArrayList<Order> orderList(String o_id, int o_state);
	void editState(String type, int num);
	void delOrder(int num);
	
	
}
