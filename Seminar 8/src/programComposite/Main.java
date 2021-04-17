package programComposite;

import claseComposite.Produs;
import claseComposite.Sectiune;

public class Main {
    public static void main(String[] args) {
        Sectiune bauturi = new Sectiune("bauturi");
        Sectiune desert = new Sectiune("desert");

        Produs cola = new Produs("cola");
        Produs tiramisu = new Produs("Tiramisu");
        Produs frappe = new Produs("Frappe");

        Sectiune meniu = new Sectiune("Meniu");
        meniu.adaugaNod(bauturi);
        meniu.adaugaNod(desert);

        bauturi.adaugaNod(cola);
        bauturi.adaugaNod(frappe);
        desert.adaugaNod(tiramisu);

        meniu.printareElement();
        System.out.println("==============================================");

        desert.adaugaNod(frappe);
        bauturi.stergeNod(frappe);

        meniu.printareElement();
    }
}
