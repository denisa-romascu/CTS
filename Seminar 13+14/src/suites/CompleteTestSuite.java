package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.GrupaTest;
import teste.GrupaTestWithFakes;
import teste.GrupaTestWithMocks;
import teste.GrupaTestWithStubs;

@RunWith(Suite.class)
@Suite.SuiteClasses({GrupaTest.class, GrupaTestWithFakes.class, GrupaTestWithStubs.class, GrupaTestWithMocks.class})
public class CompleteTestSuite {

}
