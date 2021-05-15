package template_program;

import template_clase.SpectatorNormal;
import template_clase.SpectatorVIP;

public class Main {
    public static void main(String[] args) {
        SpectatorNormal spectatorNormal = new SpectatorNormal("Gigel");
        SpectatorVIP spectatorVIP = new SpectatorVIP("Becali",1);

        spectatorNormal.intraPeStadion();
        System.out.println("----------------");
        spectatorVIP.intraPeStadion();
    }
}
