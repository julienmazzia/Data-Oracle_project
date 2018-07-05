package Model;

public enum Cities {
	City_1("Londres"),
	City_2("Paris"),
	City_3("Townsville"),
	City_4("Stockholm"),
	City_5("Kiev"),
	City_6("Osukowa"),
	City_7("Brescia"),
	City_8("Hambourg"),
	City_10("Pekin"),
	City_11("Kyoto"),
	City_12("Barcelone"),
    ;
	
    private final String text;

    /**
     * @param text
     */
    Cities(final String text) {
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
