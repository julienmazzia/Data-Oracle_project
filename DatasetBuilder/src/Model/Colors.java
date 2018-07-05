package Model;

public enum Colors {
	Color_1("Rouge"),
	Color_2("Orange"),
	Color_3("Jaune"),
	Color_4("Vert"),
	Color_5("Bleu"),
	Color_6("Violet"),
	Color_7("Noir"),
	Color_8("Marron")
    ;
	
    private final String text;

    /**
     * @param text
     */
    Colors(final String text) {
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
