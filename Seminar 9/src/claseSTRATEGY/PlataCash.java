package claseSTRATEGY;

public class PlataCash implements Payable{
    @Override
    public void pay(float suma) {
        System.out.println("A fost realizata o plata cash in valoare de " + suma + " lei.");
    }
}
