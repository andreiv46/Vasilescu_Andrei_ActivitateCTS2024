package suite;

import dubluri.AreFake;
import org.example.clase.PachetTuristicTest;
import org.example.clase.PachetTuristicTestWithFxture;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PachetTuristicTestWithFxture.class})
@Categories.IncludeCategory(AreFake.class)
public class SuitaCostum {

}
