package Model;

import java.util.Random;

public class Stock {
	public String name;
	public String type;
	public int quantity;
	
	private String[] candyNames = {
			"Acidofilo",
			"Bouteille cola",
			"Brazil pik",
			"Color Schtroummpf pik",
			"Langues acides",
			"London pik",
			"Miami pik",
			"Pasta Basta",
			"Pasta frutta",
			"Sour snup",
			"Dragibus",
			"Carensac",
			"Fraizibus",
			"Grain de millet",
			"Starmint",
			"Florent violette",
			"Kimono",
			"Pain Zan",
			"Rotella",
			"Zanoïd",
			"Fraise tagada",
			"Croco",
			"Chamallows",
			"Polka",
			"Banane",
			"Ourson",
			"Filament"
			};
	
	private String[] componentsNames = {
			"Additifs",
			"Enrobage",
			"Arôme",
			"Gélifiants",
			"Sucre"
	};
	
	private int maxStock;
	private String[] object;
	
	Random r = new Random();
	
	public Stock(String type){
		this.type = type;
		if(type == "Bonbon"){
			maxStock = 10000;
			object = candyNames;
		}else{
			maxStock = 1000;
			object = componentsNames;
		}
	}
	
	public static Stock create(String type){
		Stock stock = new Stock(type);
		return stock;
	}
	
	public void addStock(int index){
		name = object[index];
		quantity = alea(maxStock);
	}
	
	public int getNumberOfElement(){
		return object.length;
	}
	
	private int alea(int maxRange){
		int value = r.nextInt(maxRange - 0);
		return value;
	}

}
