package claseSTATEvarianta2;

import claseSTATE.Libera;
import claseSTATE.Rezervata;
import claseSTATE.State;

public class Masa {
    private int nrMasa;
    private Stare stare;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
        this.stare = new StareLibera();
    }

    public Stare getStare() {
        return stare;
    }
    public int getNrMasa() {
        return nrMasa;
    }
    public void setStare(Stare stare) {
        this.stare = stare;
    }

    public void ocupaMasa(){
        StareOcupata stareOcupata = new StareOcupata() ;
        stareOcupata.modificaStare(this);
    }
    public void elibereazaMasa(){
        StareLibera stareLibera = new StareLibera() ;
        stareLibera.modificaStare(this);
    }
    public void rezervaMasa(){
        StareRezervata stareRezervata = new StareRezervata() ;
        stareRezervata.modificaStare(this);
    }
}
