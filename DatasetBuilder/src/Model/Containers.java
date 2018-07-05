package Model;

public enum Containers {
	Container("Sachet", 10),
	Container_2("Boite", 25),
	Container_3("Echantillon", 3)
    ;
	
    private final String text;
    private final int quantity;

    /**
     * @param text
     */
    Containers(final String text, final int quantity) {
        this.text = text;
        this.quantity = quantity;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return text;
    }
    
    public int getQuantity(){
    	return quantity;
    }
}
