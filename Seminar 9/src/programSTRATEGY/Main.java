package programSTRATEGY;

import claseSTRATEGY.Client;
import claseSTRATEGY.PlataBonuriMasa;
import claseSTRATEGY.PlataCard;
import claseSTRATEGY.PlataCash;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Ionel", new PlataCash());
        client.platesteNota(200);
        client.setPlata(new PlataCard());
        client.platesteNota((float)100.3);
        client.setPlata(new PlataBonuriMasa());
        client.platesteNota((float)1000.5);
    }
}
