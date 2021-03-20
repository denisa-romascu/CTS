package ro.ase.cts.program;
import ro.ase.cts.clase.Adresa;
import ro.ase.cts.clase.Parlament;
import ro.ase.cts.clase.ParlamentLazy;

public class Main {
    public static void main(String[] args) {

        //Parlament parlament1 = new Parlament("Romania", 123, 4, "Idk");
        //Parlament parlament2 = new Parlament("Bulgaria", 200, 5, "Idk2");

        //SINGLETON face shallow copy pentru acelasi obiect
        Parlament parlament1 = Parlament.getInstance();
        Parlament parlament2 = Parlament.getInstance();

        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());

        System.out.println("========================");
        parlament1.setTara("Romania");
        parlament2.setNrParlamentari(300);
        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());

        ParlamentLazy parlamentLazy1 = ParlamentLazy.getInstance("Serbia",400,8,"Sediul Serbiei");
        ParlamentLazy parlamentLazy2 = ParlamentLazy.getInstance("UK",500,2,"Sediul UK");

        System.out.println("========================");
        System.out.println(parlamentLazy1.toString());
        System.out.println(parlamentLazy2.toString());

        Adresa adresa1 = Adresa.getInstance("Victoriei",10.5f,2);
        Adresa adresa2 = Adresa.getInstance("Dudesti",4.6f,5);

        System.out.println("=============ADRESA===========");
        System.out.println(adresa1.toString());
        System.out.println(adresa2.toString());


    }
}