package Model;

public enum Countries {
	Country_1("Allemagne"),
	Country_2("Autriche"),
	Country_3("Belgique"),
	Country_4("Bulgarie"),
	Country_5("Chypre"),
	Country_6("Croatie"),
	Country_7("Danemark"),
	Country_8("Espagne"),
	Country_10("Estonie"),
	Country_11("Finlande"),
	Country_12("Grèce"),
	Country_13("Hongrie"),
	Country_14("Irelande"),
	Country_15("Italie"),
	Country_16("Lettonie"),
	Country_17("Lituanie"),
	Country_18("Luxembourg"),
	Country_19("Malte"),
	Country_20("Pays-Bas"),
	Country_21("Pologne"),
	Country_22("Portugal"),
	Country_23("Republique tchèque"),
	Country_24("Roumanie"),
	Country_25("Royaume-Uni"),
	Country_26("Slovaquie"),
	Country_27("Slovénie"),
	Country_28("Suède"),
	Country_29("USA"),
	Country_30("Canada"),
	Country_31("Mexique"),
	Country_32("Japon"),
	Country_33("Chine"),
	Country_34("Afrique du sud"),
    ;
	
    private final String text;

    /**
     * @param text
     */
    Countries(final String text) {
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
