package Model;

import java.util.ArrayList;

public class DataSetBuilder {
	public Order order;
	
	public Order[] CreateOrders(int numbOrders, int type, Object[][] customValues){
		Order[] Order = null;
		for(int i=0; i<numbOrders; i++){
			order = new Order();
		}
		
		return Order;
	}
	
	public Stock[] CreateStock(int type){
		Stock[] stock = null;
		
		return stock;
	}
}
