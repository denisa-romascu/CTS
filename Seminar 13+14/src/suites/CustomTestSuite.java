package suites;

import categories.TesteRight;
import categories.TesteUrgente;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses(CompleteTestSuite.class)
@Categories.IncludeCategory(TesteUrgente.class)
@Categories.ExcludeCategory(TesteRight.class)
public class CustomTestSuite {
}
