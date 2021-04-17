package programFlyweight;

import claseFlyweight.FlyweightFactory;
import claseFlyweight.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare r1 = new Rezervare(1,1);
        Rezervare r2 = new Rezervare(2,1);
        Rezervare r3 = new Rezervare(3,1);

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        flyweightFactory.getClient("123456").printeazaRezervare(r1);
        flyweightFactory.getClient("987654").printeazaRezervare(r2);
        flyweightFactory.getClient("123456").printeazaRezervare(r3); //clientul 1 face rezervarea 3
    }
}
