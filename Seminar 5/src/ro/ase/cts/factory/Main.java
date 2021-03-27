package ro.ase.cts.factory;

public class Main {
    public static void main(String[] args) {

        // SIMPLE FACTORY
        Factory factory = new Factory();

        PersonalMedical medic1= factory.create(TipPersonal.MEDIC,"Ionescu",5000);
        PersonalMedical asistent1 = factory.create(TipPersonal.ASISTENT,"Popescu",2000);

        System.out.println(medic1);
        System.out.println(asistent1);

        // FACTORY SINGLETON
        PersonalMedical medic2 = FactorySingleton.getInstance().create(TipPersonal.MEDIC,"Ion",7000);
        System.out.println(medic2);
    }
}
