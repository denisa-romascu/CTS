package clase.decorator;

public class Card implements CardBancar{
    private String titular;

    public Card(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    @Override
    public void platestePOS() {
        System.out.println(this.titular + " a platit prin intermediul POS-ului");
    }

    @Override
    public void platesteOnline() {
        System.out.println(this.titular + " a platit online");
    }
}
