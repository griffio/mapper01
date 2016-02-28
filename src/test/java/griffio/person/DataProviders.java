package griffio.person;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import org.testng.annotations.DataProvider;

public class DataProviders {

  @DataProvider(name = "person")
  public static Object[][] person() {

    Address address = new Address("Line01", "Town City", "County", "POST CODE");

    List<Address> addresses = Collections.singletonList(address);

    return new Object[][] {
        {"Phileas Fog", LocalDate.now(), Gender.MALE, addresses},
        {"Passepartout", LocalDate.now(), Gender.UNSPECIFIED, addresses},
        {"Aouda", LocalDate.now(), Gender.FEMALE, addresses},
    };
  }

  @DataProvider(name = "address")
  public static Object[][] address() {
    return new Object[][] {
        {"Line01", "Town City", "County", "POST CODE"}
    };
  }
}
