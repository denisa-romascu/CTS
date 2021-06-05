package mock;

import clase.IStudent;

import java.util.List;

public class StudentFake implements IStudent {
    String valoareGetNume;
    List<Integer> valoareGetNote;
    float valoareCalculeazaMedie;
    int valoareGetNota;
    boolean valoareAreRestante;


    public void setValoareGetNume(String valoareGetNume) {
        this.valoareGetNume = valoareGetNume;
    }
    public void setValoareGetNote(List<Integer> valoareGetNote) {
        this.valoareGetNote = valoareGetNote;
    }
    public void setValoareCalculeazaMedie(float valoareCalculeazaMedie) {
        this.valoareCalculeazaMedie = valoareCalculeazaMedie;
    }
    public void setValoareGetNota(int valoareGetNota) {
        this.valoareGetNota = valoareGetNota;
    }
    public void setValoareAreRestante(boolean valoareAreRestante) {
        this.valoareAreRestante = valoareAreRestante;
    }

    @Override
    public String getNume() {
        return this.valoareGetNume;
    }

    @Override
    public void setNume(String nume) {

    }

    @Override
    public List<Integer> getNote() {
        return this.valoareGetNote;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return this.valoareCalculeazaMedie;
    }

    @Override
    public int getNota(int index) {
        return this.valoareGetNota;
    }

    @Override
    public boolean areRestante() {
        return this.valoareAreRestante;
    }
}
