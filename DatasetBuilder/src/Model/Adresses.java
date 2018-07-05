package Model;

public enum Adresses {
	Adress_1("Boulevard des Antilopes"),
	Adress_2("Avenue Berlingot"),
	Adress_3("Rue du Szimpla Kert"),
	Adress_4("Place Septon"),
	Adress_5("Impasse des Roses"),
	Adress_6("Avenue de la république")
    ;

    private final String text;

    /**
     * @param text
     */
    Adresses(final String text) {
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
