package Command_program;

import Command_clase.*;

public class Main {
    public static void main(String[] args) {
        ManagerComenzi managerComenzi = new ManagerComenzi();

        Executant cont = new Executant("Gigel");

        ComandaCreare comandaCreare = new ComandaCreare(cont, 1000);
        managerComenzi.adaugaComanda(comandaCreare);

        managerComenzi.adaugaComanda(new ComandaRetragere(cont, 123));

        managerComenzi.executaComanda();

        managerComenzi.adaugaComanda(new ComandaDepunere(cont, 1234));

        managerComenzi.adaugaComanda(new ComandaRetragere(cont, 2200));

        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
    }
}
