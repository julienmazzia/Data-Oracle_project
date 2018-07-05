package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Candy {
	public String name;
	public String color;
	public String texture;
	public int quantity;
	
	private int max;
	
	private String[] names = {
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
	
	private String[] colors = {
			"Rouge",
			"Orange",
			"Jaune",
			"Vert",
			"Bleu",
			"Violet",
			"Noir",
			"Marron"
			};
	
	private String[] textures = {"mou", "dur"};
	
	Random r = new Random();
	
	public Candy(int max){
		this.max = max;
		name = names[alea(names.length)];
		color = colors[alea(colors.length)];
		texture = textures[alea(textures.length)];
	}
	
	public static Candy create(int max){
		Candy candy = new Candy(max);
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
