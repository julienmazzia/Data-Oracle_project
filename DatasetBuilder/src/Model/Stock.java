package Model;

import java.util.Random;

public class Stock {
	public String name;
	public int id;
	public String type;
	public int quantity;
	
	private int maxStock;
	
	Random r = new Random();
	
	public Stock(String type){
		this.type = type;
		if(type == "Bonbon"){
			maxStock = 10000;
		}else{
			maxStock = 1000;
		}
	}
	
	public static Stock create(String type){
		Stock stock = new Stock(type);
		return stock;
	}
	
	public void addStock(int index){
		id = index;
		if(type == "Bonbon"){
			name = Candies.values()[index-1].toString();
			quantity = alea(maxStock);
		}else{
			name = Components.values()[index-1].toString();
			quantity = alea(maxStock);
		}
	}
	
	private int alea(int maxRange){
		int value = r.nextInt(maxRange - 0);
		return value;
	}

}
