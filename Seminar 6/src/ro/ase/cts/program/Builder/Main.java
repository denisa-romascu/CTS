package ro.ase.cts.program.Builder;

import ro.ase.cts.clase.Builder.BuilderRezervare;
import ro.ase.cts.clase.Builder.BuilderRezervareV2;
import ro.ase.cts.clase.Builder.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare(12,false,true,false,true,"rock");

        BuilderRezervare builderRezervare = new BuilderRezervare().setCodRezervare(1).
                setAreMancareInclusa(true).
                setAreMuzicaAmbientalaPersonalizata(true).setGenMuzical("Rock");
        Rezervare rezervare1 = builderRezervare.build();

        Rezervare rezervare2 = new BuilderRezervare().setCodRezervare(2)
                .setAreBauturiRacoritoare(true).build();

        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());

        Rezervare rezervare3 = builderRezervare.setCodRezervare(4).build();

        BuilderRezervareV2 builderV2 = new BuilderRezervareV2().setAreMancareInclusa(true).setAreScaunElectric(true).setAreBauturaRacoritoareInclusa(true);

        Rezervare rez1 = builderV2.setCodRezervare(10).build();
        Rezervare rez2 = builderV2.setCodRezervare(11).build();

        System.out.println("=======================");
        System.out.println(rez1.toString());
        System.out.println(rez2.toString());
    }
}
