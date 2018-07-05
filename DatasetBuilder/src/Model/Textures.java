package Model;

public enum Textures {
	Texture_1("mou"),
	Texture_2("dur")
    ;
	
    private final String text;

    /**
     * @param text
     */
    Textures(final String text) {
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
