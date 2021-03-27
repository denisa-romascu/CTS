package ro.ase.cts.factory;

public class FactorySingleton {
    private static FactorySingleton factorySingleton = null;

    public static synchronized FactorySingleton getInstance(){
        //LAZY initialization
        if(FactorySingleton.factorySingleton == null){
            FactorySingleton.factorySingleton = new FactorySingleton();
        }
        return FactorySingleton.factorySingleton;
    }

    //trebuie sa facem constructorul explicit privat
    private FactorySingleton(){

    }

    public PersonalMedical create(TipPersonal tip, String nume, float salariu){
        switch (tip){
            case MEDIC: return new Medic(nume,salariu);
            case ASISTENT: return new Asistent(nume,salariu);
            case BRANCARDIER: return new Brancardier(nume,salariu);
            default: throw new IllegalArgumentException("Tipul nu este corect!");
        }
    }
}
