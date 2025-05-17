public abstract class Mensch {
    private int alter;
    private String vorname;
    private String nachname;
    private String addresse;
    private String sozialversicherungsnummer;

    public Mensch(int alter, String vorname, String nachname, String addresse, String sozialversicherungsnummer) {
        this.alter = alter;
        this.vorname = vorname;
        this.nachname = nachname;
        this.addresse = addresse;
        this.sozialversicherungsnummer = sozialversicherungsnummer;
    }

    public int getAlter() {
        return this.alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getVorname() {
        return this.vorname;
    }

    public void setVorname(String Vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return this.nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getAddresse() {
        return this.addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public String getSozialversicherungsnummer() {
        return this.sozialversicherungsnummer;
    }

    public void setSozialversicherungsnummer(String sozialversicherungsnummer) {
        this.sozialversicherungsnummer = sozialversicherungsnummer;
    }
}
