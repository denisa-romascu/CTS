package teste;

import clase.Student;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @org.junit.Test
    public void testConstructorWorksCorectlyForName() {
        String nume = "Gigel";
        Student student = new Student(nume);

        assertEquals(nume,student.getNume());
    }

    @org.junit.Test
    public void setNume() {
        String nume = "Popescu";
        Student student = new Student();
        student.setNume(nume);

        assertEquals(nume, student.getNume());
    }

    @org.junit.Test
    public void testConstructorWorksCorrectly() {
        Student student = new Student();

        assertNotNull("Lista de note nu a fost initializata",student.getNote());
        assertNotNull("Numele nu a fost initializat", student.getNume());
    }

    @org.junit.Test
    public void adaugaNota() {
        Student student = new Student();
        int nota = 10;
        student.adaugaNota(nota);
        assertEquals(nota,student.getNota(0));
    }

    @org.junit.Test
    public void testGetNota() {
        Student student = new Student();
        int nota = 10;
        student.adaugaNota(5);
        student.adaugaNota(7);
        student.adaugaNota(9);
        student.adaugaNota(4);
        assertEquals(9,student.getNota(2));
    }

    @org.junit.Test
    public void testAdaugaOSinguraNota() {
        Student student = new Student();
        int nota = 10;
        student.adaugaNota(nota);
        assertEquals(1,student.getNote().size());
    }

    @org.junit.Test
    public void testAdaugaNotaIncorecta() {
        Student student = new Student();

        //1
        try{
            //2
            student.adaugaNota(-1);
            //3 - nu ajunge aici
            fail("Nu trebuia sa ajunga aici. Metoda nu arunca exceptie");
        }
        catch(IllegalArgumentException ex){
            //4
        }
        catch(Exception e){
            //5 - nu ajunge aici
            fail("Nu arunca o exceptie de tipul IllegalArgument");
        }
        //6
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdaugaNotaIncorectaJunit4() {
        Student student = new Student();
        student.adaugaNota(-1);
    }

    @org.junit.Test
    public void testStudentulAreRestante() {
        Student student = new Student();
        student.adaugaNota(3);
        boolean rezultat = student.areRestante();
        assert(rezultat);
    }

    @org.junit.Test
    public void testStudentulNuAreRestante() {
        Student student = new Student();
        student.adaugaNota(7);
        student.adaugaNota(10);
        assertFalse(student.areRestante());
    }

    @org.junit.Test
    public void testCalculeazaMedieCorecta() {
        Student student = new Student();
        student.adaugaNota(10);
        student.adaugaNota(9);
        assertEquals(9.5, student.calculeazaMedie(),0.0001);
    }
}