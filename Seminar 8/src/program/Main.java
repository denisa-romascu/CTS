package program;

import clase.Facade;
import clase.Masa;

public class Main {
    public static void main(String[] args) {
//        Masa masa1 = new Masa(30,10);
//        if(OperatorMese.esteLibera(masa1.getNrMasa())){
//            Picolo picolo1 = new Picolo("Gigel");
//            if(picolo1.esteDebarasataMasa(masa1.getNrMasa())){
//                if(picolo1.esteAranjata(masa1.getNrMasa())){
//                    System.out.println("Poftiti la masa domnule client!");
//                }
//                else{
//                    System.out.println("Va rog mai asteptati putin!");
//                }
//            }
//            else{
//                System.out.println("Va rog mai asteptati putin!");
//            }
//        }
//        else{
//            System.out.println("Va rog mai asteptati putin!");
//        }
//

        if(Facade.esteMasaPregatita(new Masa(30,4))){
            System.out.println("Poftiti la masa domnule client!");
        }
        else{
            System.out.println("Va rog mai asteptati putin");
        }
    }
}
