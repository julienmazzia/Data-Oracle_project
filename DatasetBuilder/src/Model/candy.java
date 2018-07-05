package Model;

import java.util.Random;

public class Candy {
	public String name;
	public String color;
	public String texture;
	public int quantity;
	
	Random r = new Random();
	
	public Candy(){
		name = Candies.values()[alea(Candies.values().length)].toString();
		color = Colors.values()[alea(Colors.values().length)].toString();
		texture = Textures.values()[alea(Textures.values().length)].toString();
	}
	
	public static Candy create(){
		Candy candy = new Candy();
		return candy;
	}
	
	public int addCandies(int quantity){
		if(quantity > 1){
			quantity = alea(quantity-1) + 1;			
		}

		this.quantity = quantity;
		return quantity;
	}
	
	private int alea(int maxRange){
		int value = r.nextInt(maxRange - 0);
		return value;
	}
	
	
	}
