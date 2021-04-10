package clase.adapter;

public class AdapterLeasingObiect implements Creditable{
    private Leasing leasing;

    public AdapterLeasingObiect(Leasing leasing){
        this.leasing = leasing;
    }

    @Override
    public void crediteaza() {
        this.leasing.oferaLeasing();
    }
}
