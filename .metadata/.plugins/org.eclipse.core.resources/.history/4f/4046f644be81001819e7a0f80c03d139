package Model;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OracleDatabaseFiller {
	
	ConnectionOracle connection;
	Statement state;
	List<String> commandQueries = new ArrayList<String>();
	private static int CommandNumber;
	
	public OracleDatabaseFiller(ConnectionOracle connection) {
		this.connection = connection;
		try {
			state = connection.connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fillClientTable(int order, String name, String firstname, String adress, int code, String city, String mail, String country){
		try {
			ResultSet result = state.executeQuery("Select * from bonbon");
			ResultSetMetaData resultMeta = result.getMetaData();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fillCommandTable(int order, String BuyDate, String expec, String reception, int id_client){
		System.out.println(CommandNumber++);
		/*commandQueries.add("insert into commande values("+ CommandNumber++ +","+ BuyDate +","+ expec +","+ reception +","+ id_client +")");
		try {
			Statement statement = connection.connection.createStatement();
			state = connection.connection.createStatement();
			state.executeUpdate("insert into commande values("+ order +","+ BuyDate +","+ expec +","+ reception +","+ id_client +")");
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	
	public void fillCandyClient(int order, String name, int quantity){
		
	}
	
	public void fillStockBonbon(String name, int quantity){
		
	}
	
	public void fillStockComponent(String name, int quantity){
		
	}

}
