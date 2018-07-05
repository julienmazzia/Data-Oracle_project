package Model;

public enum MailsType {
	Mails_type_1("gmail.com"),
	Mails_type_2("yahoo.com"),
	Mails_type_3("icloud.com"),
	Mails_type_4("free.fr")
    ;
	
    private final String text;

    /**
     * @param text
     */
    MailsType(final String text) {
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
