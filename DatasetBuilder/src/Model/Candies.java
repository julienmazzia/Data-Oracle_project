package Model;

public enum Candies {
	Candy_1("Acidofilo"),
	Candy_2("Bouteille cola"),
	Candy_3("Brazil pik"),
	Candy_4("Color Schtroummpf pik"),
	Candy_5("Langues acides"),
	Candy_6("London pik"),
	Candy_7("Miami pik"),
	Candy_8("Pasta Basta"),
	Candy_9("Pasta frutta"),
	Candy_10("Sour snup"),
	Candy_11("Dragibus"),
	Candy_12("Carensac"),
	Candy_13("Fraizibus"),
	Candy_14("Grain de millet"),
	Candy_15("Starmint"),
	Candy_16("Florent violette"),
	Candy_17("Kimono"),
	Candy_18("Pain Zan"),
	Candy_19("Rotella"),
	Candy_20("Zanoïd"),
	Candy_21("Fraise tagada"),
	Candy_22("Croco"),
	Candy_23("Chamallows"),
	Candy_24("Polka"),
	Candy_25("Banane"),
	Candy_26("Ourson"),
	Candy_27("Filament")
    ;
	
    private final String text;

    /**
     * @param text
     */
    Candies(final String text) {
        this.text = text;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return text;
    }
}
