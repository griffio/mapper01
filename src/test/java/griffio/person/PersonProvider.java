package griffio.person;

import java.time.LocalDate;
import org.testng.annotations.DataProvider;

public class PersonProvider {

  @DataProvider(name = "person")
  public static Object[][] person() {
    return new Object[][] {
        {"Phileas Fog", LocalDate.now(), Gender.MALE},
        {"Passepartout", LocalDate.now(), Gender.UNSPECIFIED},
        {"Aouda", LocalDate.now(), Gender.FEMALE}
    };
  }
}
