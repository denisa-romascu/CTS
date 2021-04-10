package program.decorator;

import clase.decorator.Card;
import clase.decorator.DecoratorContactlessCard;
import clase.decorator.DecoratorContactlessTelefon;

public class Main {
    public static void main(String[] args) {
        Card card = new Card("Popescu Alina");
        card.platestePOS();
        card.platesteOnline();

        System.out.println("");
        System.out.println("============= DECORATOR CONTACTLESS =============");
        DecoratorContactlessCard decoratorContactlessCard = new DecoratorContactlessCard(card);
        decoratorContactlessCard.platesteContactless();
        decoratorContactlessCard.platesteOnline();

        System.out.println("");
        System.out.println("============= DECORATOR CONTACTLESS CU TELEFONUL =============");
        DecoratorContactlessTelefon decoratorContactlessTelefon = new DecoratorContactlessTelefon(card);
        decoratorContactlessTelefon.platestePOS();
        decoratorContactlessTelefon.platesteContactless();
    }
}
