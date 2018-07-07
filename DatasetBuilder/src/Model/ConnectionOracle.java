package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionOracle {
	
	private static ConnectionOracle connectionOracle;
	
	public Connection connection = null;
	
	private ConnectionOracle() throws SQLException, ClassNotFoundException{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Fusal587");
	}
	
	public static ConnectionOracle getConnection(){
		if( connectionOracle == null){
			try {
				connectionOracle = new ConnectionOracle();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return connectionOracle;
	}
}
