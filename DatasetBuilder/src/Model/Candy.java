package Model;

import java.util.Random;

public class Candy {
	public int id;
	public String name;
	public String color;
	public String texture;
	public int quantity;
	
	Random r = new Random();
	
	public Candy(){
		id = alea(Candies.values().length-1)+1;
		name = Candies.values()[id].toString();
		color = Colors.values()[alea(Colors.values().length)].toString();
		texture = Textures.values()[alea(Textures.values().length)].toString();
	}
	
	public static Candy create(){
		Candy candy = new Candy();
		return candy;
	}
	
	public int addCandies(int quantity){
		if(quantity > 1){
			quantity = alea(quantity) + 1;			
		}

		this.quantity = quantity;
		return quantity;
	}
	
	private int alea(int maxRange){
		int value = r.nextInt(maxRange - 0);
		return value;
	}
	
	
	}
