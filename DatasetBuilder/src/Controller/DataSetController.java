package Controller;

import java.util.List;

import Model.*;
import View.Observer;




public class DataSetController implements Observer{
	
	List<Order> orders;
	List<Stock> stockB;
	List<Stock> stockC;

	@Override
	public void update(int number) {
		orders = Model.OrderCreator.createOrders(number);
		stockB = Model.StockCreator.createStock("Bonbon");
		stockC = Model.StockCreator.createStock("Composant");
		MainController.OracleControllerLauncher(this);
	}
	
	public List<Order> getOrders(){
		return orders;
	}
	
	public List<Stock> getStockB(){
		return stockB;
	}
	
	public List<Stock> getStockC(){
		return stockC;
	}
}