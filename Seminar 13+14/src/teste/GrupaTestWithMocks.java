package teste;

import clase.Grupa;
import mock.StudentDummy;
import mock.StudentStub;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrupaTestWithMocks {
    private static Grupa grupa;

    @Test
    public void adaugaStudent(){
        Grupa grupa = new Grupa(1086);
        StudentDummy studentDummy = new StudentDummy();

        grupa.adaugaStudent(studentDummy);
        assertEquals(1, grupa.getStudenti().size());
    }

    @Test
    public void adaugaBounderyStudentSuperior(){
        assertEquals(35, grupa.getStudenti().size());
    }

    @BeforeClass
    public static void creareGrupa(){
        grupa = new Grupa(1086);

        for(int i=0; i<35; i++){
            StudentDummy studentDummy = new StudentDummy();
            grupa.adaugaStudent(studentDummy);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void adaugaBounderyStudentExceptie(){
        StudentDummy studentDummy = new StudentDummy();
        grupa.adaugaStudent(studentDummy);
    }


    @Test
    public void testGetPromovabilitate(){
        Grupa grupa = new Grupa(1088);
        StudentStub studentStub = new StudentStub();
        grupa.adaugaStudent(studentStub);
        assertEquals(0,grupa.getPromovabilitate(),0.01);
    }
}