package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OrderCreator {
	public static List<Order> createOrders(int number){
		List<Order> ListOrder = new ArrayList<Order>();
		ConnectionOracle connection = ConnectionOracle.getConnection();
		Statement st;
		Order order;
		int total=0;
		try {
			st = connection.connection.createStatement();
			ResultSet query = st.executeQuery("SELECT COUNT(*) AS TOTAL FROM client");
			while(query.next()){
				total = query.getInt("TOTAL");
			}
			
			for(int i = 0; i<number; i++){
				order = Order.create(total);
				ListOrder.add(order);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return ListOrder;
	}
}
