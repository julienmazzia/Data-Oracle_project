package Controller;

import java.util.List;

import Model.Candy;
import Model.Connection;
import Model.OracleDatabaseFiller;
import Model.Order;
import Model.Stock;

public class OracleController {
	
	List<Order> orders;
	List<Stock> stockB;
	List<Stock> stockC;
	Connection connection;
	OracleDatabaseFiller CAD;
	
	public OracleController(DataSetController dataSet){
		orders = dataSet.getOrders();
		stockB = dataSet.getStockB();
		stockC = dataSet.getStockC();
		getConnection();
	}
	
	public void getConnection(){
		connection = Connection.getConnection();
	}
	
	public void fillDatabase(){
		for (Order order : orders) {
			CAD.fillClientTable(order.orderNumber, order.name, order.firstname, order.adress, order.code, order.city, order.mail, order.country);
			CAD.fillCommandTable(order.orderNumber, order.buyDate, order.expec, order.recep);
			for (Candy candy : order.candies){
				CAD.fillCandyClient(order.orderNumber, candy.name, candy.quantity);
			}
		}
		
		for (Stock stock : stockB) {
			CAD.fillStockBonbon(stock.name, stock.quantity);
		}

		for (Stock stock : stockC) {
			CAD.fillStockComponent(stock.name, stock.quantity);
		}
	}
	
}
