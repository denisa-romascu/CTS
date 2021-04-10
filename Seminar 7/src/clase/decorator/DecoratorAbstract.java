package clase.decorator;

public abstract class DecoratorAbstract implements CardBancar{
    private CardBancar card;

    public DecoratorAbstract(CardBancar card) {
        this.card = card;
    }

    public CardBancar getCard() {
        return card;
    }

    @Override
    public void platestePOS() {
        this.card.platestePOS();
    }

    @Override
    public void platesteOnline() {
        this.card.platesteOnline();
    }

    public abstract void platesteContactless();
}
