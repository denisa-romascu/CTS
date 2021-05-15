package observer_clase;

public class ClientAbonat implements Observer{
    private String numeClient;

    public ClientAbonat(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println("Clientul " + this.numeClient + " a receptionat mesajul " + mesaj);
    }
}
