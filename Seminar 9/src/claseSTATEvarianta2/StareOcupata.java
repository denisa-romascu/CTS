package claseSTATEvarianta2;

public class StareOcupata implements Stare{

    @Override
    public void modificaStare(Masa masa) {
        if( !(masa.getStare() instanceof StareOcupata)){
            System.out.println("Masa cu nr "+masa.getNrMasa() + " a fost ocupata");
            masa.setStare(this);
        }
        else{
               System.out.println("Masa nu poate fi ocupata");
        }
    }
}
