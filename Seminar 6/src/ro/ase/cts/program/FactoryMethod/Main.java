package ro.ase.cts.program.FactoryMethod;

import ro.ase.cts.clase.FactoryMethod.*;

public class Main {

    public static void afiseazaInformatiiJucator(FabricaJucatori fabrica, String nume, int nrTricou){
        Jucator jucator = fabrica.creazaJucator(nume, nrTricou);
        System.out.println(jucator.toString());
    }
    public static void main(String[] args) {
        afiseazaInformatiiJucator(new FabricaAtacant(),"Popescu",15);
        afiseazaInformatiiJucator(new FabricaPortar(),"Ionescu",17);
        afiseazaInformatiiJucator(new FabricaMijlocas(),"Georgescu",11);
    }
}
