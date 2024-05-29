package suite;

import org.example.clase.PachetTuristicTest;
import org.example.clase.PachetTuristicTestWithFxture;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PachetTuristicTestWithFxture.class})
public class SuitaCompleta {

}
