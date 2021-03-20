// Clasa EAGER initialization

package ro.ase.cts.clase;

public class Parlament {
    private String tara;
    private int nrParlamentari;
    private int durataMandat;
    private String denumireSediu;

    // obiectul unic pentru Singleton
    private static Parlament parlament = new Parlament();

    //daca raman constructorii publici, ii putem apela de mai multe ori => facem mai multe obiecte => nu mai avem Singleton
    // constructor privat pentru Singleton, poate fi apelat doar in interiorul clasei
    private Parlament() {
        this.tara = "";
        this.nrParlamentari = 0;
        this.durataMandat = 0;
        this.denumireSediu = "";
    }
    // constructor privat pentru Singleton, poate fi apelat doar in interiorul clasei
    private Parlament(String tara, int nrParlamentari, int durataMandat, String denumireSediu) {
        this.tara = tara;
        this.nrParlamentari = nrParlamentari;
        this.durataMandat = durataMandat;
        this.denumireSediu = denumireSediu;
    }

    //pentru Singleton
    public static Parlament getInstance(){
        return parlament;
    }

    //-------------------GETTERI SI SETTERI-------------------
    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public int getNrParlamentari() {
        return nrParlamentari;
    }

    public void setNrParlamentari(int nrParlamentari) {
        this.nrParlamentari = nrParlamentari;
    }

    public int getDurataMandat() {
        return durataMandat;
    }

    public void setDurataMandat(int durataMandat) {
        this.durataMandat = durataMandat;
    }

    public String getDenumireSediu() {
        return denumireSediu;
    }

    public void setDenumireSediu(String denumireSediu) {
        this.denumireSediu = denumireSediu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Parlament{");
        sb.append("tara='").append(tara).append('\'');
        sb.append(", nrParlamentari=").append(nrParlamentari);
        sb.append(", durataMandat=").append(durataMandat);
        sb.append(", denumireSediu='").append(denumireSediu).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
