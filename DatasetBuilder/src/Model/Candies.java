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
	Candy_11("Dragibus")
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
