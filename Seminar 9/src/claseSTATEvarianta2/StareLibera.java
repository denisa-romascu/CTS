package claseSTATEvarianta2;

public class StareLibera implements Stare{

    @Override
    public void modificaStare(Masa masa) {
        if(!(masa.getStare() instanceof StareLibera)){
            System.out.println("Masa cu numarul " + masa.getNrMasa() + " a fost eliberata");
            masa.setStare(this);
        }
        else{
            System.out.println("Masa nu poate fi eliberata");
        }
    }
}
