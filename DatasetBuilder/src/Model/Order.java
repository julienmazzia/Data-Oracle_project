package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {
	public static int orderNumber = 0;
	public String name;
	public String firstname;
	public String adress;
	public int code;
	public String city;
	public String mail;
	public String country;
	public String container;
	
	public String buyDate;
	public String expec;
	public String recep;
	
	public List<Candy> candies = new ArrayList<Candy>();
	
	Random r = new Random();
	
	public Order(){
		orderNumber ++;
		name = Names.values()[alea(Names.values().length)].toString();
		firstname = FirstNames.values()[alea(FirstNames.values().length)].toString();
		adress = Adresses.values()[alea(Adresses.values().length)].toString();
		code = alea(10000);
		city = Cities.values()[alea(Cities.values().length)].toString();
		mail = firstname + "." + name + "@" + MailsType.values()[alea(MailsType.values().length)].toString();
		country = Countries.values()[alea(Countries.values().length)].toString();
		String[] dates = createDates();
		buyDate = dates[0];
		expec = dates[1];
		recep = dates[2];
		
		int containerValue = alea(Containers.values().length);
		container = Containers.values()[containerValue].toString();
		addCandy(Containers.values()[containerValue].getQuantity());
	}
	
	public static Order create(){
		Order order = new Order();
		return order;
	}
	
	private String[] createDates(){
		int month = alea(12-1)+1;
		int month2 = month;
		int month3 = month;
		int day = 0;
		int dateE[] = {};
		int dateR[] = {};
		int maxOfDays = 0;
		String dayFormat;
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
			maxOfDays = 31;
			day = alea(maxOfDays-1) +1;
			dateE = createNextDate(day, month, maxOfDays);
			dateR = createNextDate(day, month, maxOfDays);
		}else if(month == 4 || month == 6 || month == 9 || month == 11){
			maxOfDays = 30;
			day = alea(maxOfDays-1) +1;
			dateE = createNextDate(day, month, maxOfDays);
			dateR = createNextDate(day, month, maxOfDays);
		}else if(month ==2){
			maxOfDays = 28;
			day = alea(maxOfDays-1) +1;
			dateE = createNextDate(day, month, maxOfDays);
			dateR = createNextDate(day, month, maxOfDays);
		}
		
		String[] dates = {String.format("%02d", day)+"-"+String.format("%02d", month)+"-2018", String.format("%02d", dateE[0])+"-"+String.format("%02d",dateE[1])+"-2018", String.format("%02d", dateR[0])+"-"+String.format("%02d",dateR[1])+"-2018"};
		
		return dates;
	}
	
	private int[] createNextDate(int startValue, int month, int max){
		int day = startValue + alea(5);
		if(day>max){
			day = day - max;
			month++;
		}
		int[] date = {day, month};
		return date;
	}
	
	private int alea(int maxRange){
		int value = r.nextInt(maxRange - 0);
		return value;
	}
	
	private void addCandy(int quantity){
		while(quantity>0){
			Candy candy = Candy.create();
			quantity = quantity - candy.addCandies(quantity);
			candies.add(candy);
		}
	}
}
