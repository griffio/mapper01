package griffio.person;

import java.util.Collections;
import java.util.List;
import org.testng.annotations.DataProvider;

import static griffio.person.DateOfBirth.dateOfBirth;

public class DataProviders {

  @DataProvider(name = "person")
  public static Object[][] person() {

    Address address = new Address("Line01", "Town City", "County", "POST CODE");

    List<Address> addresses = Collections.singletonList(address);

    return new Object[][] {
        {"Phileas Fog", dateOfBirth("1966-12-01"), Gender.MALE, addresses},
        {"Passepartout", dateOfBirth("1946-11-21"), Gender.UNSPECIFIED, addresses},
        {"Aouda", dateOfBirth("1956-10-11"), Gender.FEMALE, addresses},
    };
  }

  @DataProvider(name = "address")
  public static Object[][] address() {
    return new Object[][] {
        {"Line01", "Town City", "County", "POST CODE"}
    };
  }
}
