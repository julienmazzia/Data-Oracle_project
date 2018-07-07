package Controller;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.Candy;
import Model.ConnectionOracle;
import Model.OracleDatabaseFiller;
import Model.Order;
import Model.Stock;

public class OracleController {
	
	List<Order> orders;
	List<Stock> stockB;
	List<Stock> stockC;
	ConnectionOracle connection;
	OracleDatabaseFiller CAD;
	
	public OracleController(DataSetController dataSet){
		orders = dataSet.getOrders();
		stockB = dataSet.getStockB();
		stockC = dataSet.getStockC();
		getConnection();
		fillDatabase();
	}
	
	public void getConnection(){
		connection = ConnectionOracle.getConnection();
	}
	
	public void fillDatabase(){
		CAD = new  OracleDatabaseFiller(connection);
		List<String> commands = new ArrayList<String>();
		List<String> candies = new ArrayList<String>();
		List<String> stocksB = new ArrayList<String>();
		List<String> stocksC = new ArrayList<String>();
		int i=0;
		try {
			Statement statement = connection.connection.createStatement();
			Statement statement2 = connection.connection.createStatement();
			Statement statement3 = connection.connection.createStatement();
			Statement statement4 = connection.connection.createStatement();
		
		for (Order order : orders) {
			commands.add("insert into commande(id_commande, demande, reception_attendue, reception, id_client) values("+ i + ", "+ order.buyDate +","+ order.expec +","+ order.recep +","+ order.id_name +")");
			for(Candy candy : order.candies){
				int container = (order.containerValue) +1;
				candies.add("insert into bonbon_client(id_contenant, id_commande, quantity, id_bonbon) values("+ container +","+ i +","+ candy.quantity +","+ candy.id +")");
				System.out.println("insert into bonbon_client(id_contenant, id_commande, quantity, id_bonbon) values("+ container +","+ i +","+ candy.quantity +","+ candy.id +")");
			}
			i++;
		}
		
		for (Stock stock : stockB){
			stocksB.add("insert into stock_bonbon(quantite, id_bonbon) values("+ stock.quantity +", "+ stock.id +")");
		}
		int[] quantities = {0, 0, 0, 0, 0};
		int j=0;
		for (Stock stock : stockC){
				quantities[j] = stock.quantity;
				j++;
		}
		
		
		stocksC.add("insert into stock_composant(additif, enrobage, arome, gelifiant, sucre) values("+ quantities[0] +", "+ quantities[1] +", "+ quantities[2] +", "+ quantities[3] +", "+ quantities[4]+")");
		
		for (String query : commands) {
			statement.addBatch(query);
		}
		
		for (String query : stocksB) {
			statement2.addBatch(query);
		}
		
		for (String query : stocksC) {
			statement3.addBatch(query);
		}
		
		for (String query : candies) {
			statement4.addBatch(query);
		}
		
		statement.executeBatch();
		statement2.executeBatch();
		statement3.executeBatch();
		statement4.executeBatch();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (Stock stock : stockB) {
			CAD.fillStockBonbon(stock.name, stock.quantity);
		}

		for (Stock stock : stockC) {
			CAD.fillStockComponent(stock.name, stock.quantity);
		}
	}
	
}
