package programSTATEvarianta2;

import claseSTATEvarianta2.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(1);
        masa1.elibereazaMasa();
        masa1.ocupaMasa();
        masa1.rezervaMasa();
        masa1.elibereazaMasa();
        masa1.rezervaMasa();
    }
}
