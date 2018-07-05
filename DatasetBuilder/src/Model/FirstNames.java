package Model;

public enum FirstNames {
	Firstname_1("Henri"),
	Firstname_2("Edouard"),
	Firstname_3("Igor"),
	Firstname_4("Bell"),
	Firstname_5("Antoine"),
	Firstname_6("Philippe"),
	Firstname_7("Ben"),
	Firstname_8("Anna"),
	Firstname_10("Eve"),
	Firstname_11("Emilie"),
	Firstname_12("Eleanor"),
    ;
	
    private final String text;

    /**
     * @param text
     */
    FirstNames(final String text) {
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
