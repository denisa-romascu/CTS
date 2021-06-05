package mock;

import clase.IStudent;

import java.util.List;

public class StudentStub implements IStudent {
    @Override
    public String getNume() {
        return "Denisa";
    }

    @Override
    public void setNume(String nume) {

    }

    @Override
    public List<Integer> getNote() {
        return null;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return 8;
    }

    @Override
    public int getNota(int index) {
        return 9;
    }

    @Override
    public boolean areRestante() {
        return true;
    }
}
