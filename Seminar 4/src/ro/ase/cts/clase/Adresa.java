package ro.ase.cts.clase;

public class Adresa {
    private String strada;
    private float kmStrada;
    private int numar;

    private static Adresa adresaLazy = null;

    private Adresa() {
        this.strada = "";
        this.numar = 0;
        this.kmStrada = 0.5f;
    }

    private Adresa(String strada, float kmStrada, int numar) {
        this.strada = strada;
        this.kmStrada = kmStrada;
        this.numar = numar;
    }

    public static Adresa getInstance(String strada, float kmStrada, int numar) {
        if(adresaLazy == null){
            adresaLazy = new Adresa(strada,kmStrada, numar);
        }
        return adresaLazy;
    }


    //-------------------GETTERI SI SETTERI-------------------
    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public float getKmStrada() {
        return kmStrada;
    }

    public void setKmStrada(float kmStrada) {
        this.kmStrada = kmStrada;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Adresa{");
        sb.append("strada='").append(strada).append('\'');
        sb.append(", kmStrada=").append(kmStrada);
        sb.append(", numar=").append(numar);
        sb.append('}');
        return sb.toString();
    }
}
