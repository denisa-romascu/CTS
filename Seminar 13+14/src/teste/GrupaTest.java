package teste;

import categories.TesteRight;
import categories.TesteUrgente;
import clase.Grupa;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;

public class GrupaTest {

    @Test
    @Category(TesteRight.class)
    public void testConstructorRight() {
        Grupa grupa = new Grupa(1086);
        assertEquals(1086, grupa.getNrGrupa());
    }

    @Test
    public void testConstructorLimitaInferioara() {
        Grupa grupa = new Grupa(1000);
        assertEquals(1000, grupa.getNrGrupa());
    }

    @Test
    public void testConstructorLimitaSuperioara() {
        Grupa grupa = new Grupa(1100);
        assertEquals(1100, grupa.getNrGrupa());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorExceptie() {
        Grupa grupa = new Grupa(900);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorExceptie2() {
        Grupa grupa = new Grupa(900);
    }

    @Test(timeout = 500)
    public void testConstructorPerformance() {
        Grupa grupa = new Grupa(1086);
    }

    @Test
    @Category(TesteUrgente.class)
    public void testConstructorRange() {
        Grupa grupa = new Grupa(1001);
        assertEquals(1001, grupa.getNrGrupa());
        Grupa grupa2 = new Grupa(1099);
        assertEquals(1099, grupa2.getNrGrupa());
    }

    @Test
    public void testConstructorExistance() {
        Grupa grupa = new Grupa(1041);
        assertNotNull(grupa.getStudenti());
    }
}