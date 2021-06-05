package teste;

import categories.TesteRight;
import categories.TesteUrgente;
import clase.Grupa;
import org.junit.experimental.categories.Category;
import mock.StudentStub;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrupaTestWithStubs {
    @Test
    @Category({TesteRight.class, TesteUrgente.class})
    public void testGetPromovabilitate() {
        Grupa grupa = new Grupa(1088);
        StudentStub studentStub = new StudentStub();
        grupa.adaugaStudent(studentStub);

        assertEquals(0, grupa.getPromovabilitate(), 0.01f);
    }
}