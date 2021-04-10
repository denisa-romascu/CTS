package program;

import clase.AdapterLeasingClase;
import clase.AdapterLeasingObiect;
import clase.Creditable;
import clase.Leasing;

public class Main {
    public static void printeazaInformatiiClient(Creditable credit){
        credit.crediteaza();
    }

    public static void main(String[] args) {
        Leasing leasing = new Leasing("Denisa",10000);
        AdapterLeasingObiect adapterLeasingObiect = new AdapterLeasingObiect(leasing);
        adapterLeasingObiect.crediteaza();

        System.out.println("");
        System.out.println("================== Adapter de Obiecte ==================");
        printeazaInformatiiClient(adapterLeasingObiect);

        System.out.println("");
        System.out.println("================== Adapter de Clase ==================");
        AdapterLeasingClase adapterLeasingClase = new AdapterLeasingClase("Elena",20000);
        printeazaInformatiiClient(adapterLeasingClase);
    }
}
