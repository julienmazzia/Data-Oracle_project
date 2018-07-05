package Model;

public class OracleDatabaseFiller {
	
	Connection connection;
	
	public OracleDatabaseFiller(Connection connection) {
		this.connection = connection;
	}
	
	public void fillClientTable(int order, String name, String firstname, String adress, int code, String city, String mail, String country){
		
	}
	
	public void fillCommandTable(int order, String BuyDate, String expec, String reception){
		
	}
	
	public void fillCandyClient(int order, String name, int quantity){
		
	}
	
	public void fillStockBonbon(String name, int quantity){
		
	}
	
	public void fillStockComponent(String name, int quantity){
		
	}

}
