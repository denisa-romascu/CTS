package ro.ase.cts.clase.Builder;

public class BuilderRezervareV2 implements AbstractBuilder{
    private int codRezervare;
    private boolean areMancareInclusa;
    private boolean areScaunElectric;
    private boolean areBauturaRacoritoareInclusa;
    private boolean areMuzicaAmbientalaPersonalizata;
    private String genMuzical;

    @Override
    public Rezervare build() {
        return new Rezervare(codRezervare,areMancareInclusa,areScaunElectric,areBauturaRacoritoareInclusa,areMuzicaAmbientalaPersonalizata,genMuzical);
    }

    public BuilderRezervareV2() {
        codRezervare = 1000;
        genMuzical = "Rock";
    }

    public int getCodRezervare() {
        return codRezervare;
    }
    public BuilderRezervareV2 setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
        return this;
    }
    public boolean isAreMancareInclusa() {
        return areMancareInclusa;
    }
    public BuilderRezervareV2 setAreMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
        return this;
    }
    public boolean isAreScaunElectric() {
        return areScaunElectric;
    }
    public BuilderRezervareV2 setAreScaunElectric(boolean areScaunElectric) {
        this.areScaunElectric = areScaunElectric;
        return this;
    }
    public boolean isAreBauturaRacoritoareInclusa() {
        return areBauturaRacoritoareInclusa;
    }
    public BuilderRezervareV2 setAreBauturaRacoritoareInclusa(boolean areBauturaRacoritoareInclusa) {
        this.areBauturaRacoritoareInclusa = areBauturaRacoritoareInclusa;
        return this;
    }
    public boolean isAreMuzicaAmbientalaPersonalizata() {
        return areMuzicaAmbientalaPersonalizata;
    }
    public BuilderRezervareV2 setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
        this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
        return this;
    }
    public String getGenMuzical() {
        return genMuzical;
    }
    public BuilderRezervareV2 setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
        return this;
    }
}
