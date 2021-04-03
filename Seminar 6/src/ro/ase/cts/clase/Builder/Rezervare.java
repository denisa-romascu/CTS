package ro.ase.cts.clase.Builder;

public class Rezervare {
    private int codRezervare;
    private boolean areMancareInclusa;
    private boolean areScaunElectric;
    private boolean areBauturaRacoritoareInclusa;
    private boolean areMuzicaAmbientalaPersonalizata;
    private String genMuzical;

    public Rezervare(int codRezervare, boolean areMancareInclusa, boolean areScaunElectric, boolean areBauturaRacoritoareInclusa, boolean areMuzicaAmbientalaPersonalizata, String genMuzical) {
        this.codRezervare = codRezervare;
        this.areMancareInclusa = areMancareInclusa;
        this.areScaunElectric = areScaunElectric;
        this.areBauturaRacoritoareInclusa = areBauturaRacoritoareInclusa;
        this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
        this.genMuzical = genMuzical;
    }

    public int getCodRezervare() {
        return codRezervare;
    }
    public void setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
    }
    public boolean isAreMancareInclusa() {
        return areMancareInclusa;
    }
    public void setAreMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
    }
    public boolean isAreScaunElectric() {
        return areScaunElectric;
    }
    public void setAreScaunElectric(boolean areScaunElectric) {
        this.areScaunElectric = areScaunElectric;
    }
    public boolean isAreBauturaRacoritoareInclusa() {
        return areBauturaRacoritoareInclusa;
    }
    public void setAreBauturaRacoritoareInclusa(boolean areBauturaRacoritoareInclusa) {
        this.areBauturaRacoritoareInclusa = areBauturaRacoritoareInclusa;
    }
    public boolean isAreMuzicaAmbientalaPersonalizata() {
        return areMuzicaAmbientalaPersonalizata;
    }
    public void setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
        this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
    }
    public String getGenMuzical() {
        return genMuzical;
    }
    public void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("codRezervare=").append(codRezervare);
        sb.append(", areMancareInclusa=").append(areMancareInclusa);
        sb.append(", areScaunElectric=").append(areScaunElectric);
        sb.append(", areBauturaRacoritoareInclusa=").append(areBauturaRacoritoareInclusa);
        sb.append(", areMuzicaAmbientalaPersonalizata=").append(areMuzicaAmbientalaPersonalizata);
        sb.append(", genMuzical='").append(genMuzical).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
