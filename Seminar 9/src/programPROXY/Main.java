package programPROXY;

import clasePROXY.ManagerRezervari;
import clasePROXY.ProxyManager;

public class Main {
    public static void main(String[] args) {
        ManagerRezervari managerRezervari = new ManagerRezervari("Starbucks");
        managerRezervari.rezerva(2);
        ProxyManager proxyManager = new ProxyManager(managerRezervari,4);
        proxyManager.rezerva(2);
        proxyManager.rezerva(4);
    }
}
