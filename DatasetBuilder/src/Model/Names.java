package Model;

public enum Names {
	Name_1("Kalinski"),
	Name_2("De Gaulle"),
	Name_3("Bonaparte"),
	Name_4("Bell"),
	Name_5("Pelfort"),
	Name_6("Fibonaccio"),
	Name_7("Iglesias"),
	Name_8("Dürbrodsky"),
	Name_9("Ford"),
    ;

    private final String text;

    /**
     * @param text
     */
    Names(final String text) {
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
