package Model;

public enum Components {
	
	Component_1("Additifs"),
	Component_2("Enrobage"),
	Component_3("Arôme"),
	Component_4("Gélifiants"),
	Component_5("Sucre")
    ;
	
    private final String text;

    /**
     * @param text
     */
    Components(final String text) {
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
