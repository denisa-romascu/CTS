package ro.ase.cts.factory;

public class Asistent extends PersonalMedical{
    private int durataLucru;

    public Asistent(String nume, float salariu, int durataLucru) {
        super(nume, salariu);
        this.durataLucru = durataLucru;
    }

    // constructor fara durataLucru
    public Asistent(String nume, float salariu) {
        super(nume, salariu);
    }

    //setter durataLucru
    public void setDurataLucru(int durataLucru) {
        this.durataLucru = durataLucru;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistent{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
