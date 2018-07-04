package Model;

import java.util.ArrayList;

public class Order {
	public int order;
	public String name;
	public String firstName;
	public String adress;
	public int code;
	public String city;
	public String payment;
	public int cost;
	public String country;
	
	public String container;
	public String buyDate;
	public String Expec;
	public String Recep;
	
	public ArrayList<candy[]> candies;
	public candy[] candy;
	
	public int expecRange;
	public int delivRange;
	
	private String[] names = {"Kalinski", "De Gaulle", "Bonaparte", "Bell", "Pelfort", "Ford", "Fibonaccio", "Iglesias", "Dürbrodsky"};
	private String[] firstNames = {"Henri", "Edouard", "Igor", "Antoine", "Philippe", "Ben", "Anna", "Eve", "Emilie", "Eleanor"};
	private String[] addresses = {"Boulevard des Antilopes","Avenue Berlingot", "Rue du Szimpla Kert", "Place Septon", "Impasse des Roses", "Avenue de la république"};
	private String[] cities = {"Londres", "Paris", "Townsville", "Stockholm", "Kiev", "Osukowa", "Brescia", "Hambourg"};
	private String[] payments = {"Espéce", "Chèque", "Visa", "Mastercard", "Bitcoin"};
	private String[] countries = {"Allemagne", "Autriche", "Belgique", "Bulgarie", "Chypre", "Croatie", "Danemark", "Espagne", "Estonie", "Finlande", "France", "Grèce",
									"Hongrie", "Irelande", "Italie", "Lettonie", "Lituanie", "Luxembourg", "Malte", "Pays-Base", "Pologne", "Portugal", "Republique tchèque",
									"Roumanie", "Royaume-Uni", "Slovaquie", "Slovénie", "Suède", "USA", "Canada", "Mexique", "Japon", "Chine", "Afrique du sud"};
	private String[] containers = {"Sachet", "Boite", "Echantillon"};
	
	public Order(int expecRange, int delivRange){
		this.expecRange = expecRange;
		this.delivRange = delivRange;
	}
	
	public void createValues(){
		
	}
}
