package Model;

import java.util.ArrayList;
import java.util.List;

public class StockCreator {
	public static List<Stock> createStock(String type){
		List<Stock> stocks = new ArrayList<Stock>();
		int lenght;
		Stock stock;
		
		if(type=="Bonbon"){
			lenght = 12;
		}else{
			lenght = Components.values().length+1;
		}
		
		for(int i = 1; i<lenght; i++){
			stock = Stock.create(type);
			stock.addStock(i);
			stocks.add(stock);
		}
		return stocks;
	}
}
