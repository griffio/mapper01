package griffio.person;

import com.google.common.testing.NullPointerTester;
import org.testng.annotations.Test;

import static com.google.common.truth.Truth.assertThat;

public class AddressTest {

  @Test
  public void constructor_must_be_nonnull() {

    new NullPointerTester().testAllPublicConstructors(Address.class);
  }

  @Test(dataProvider = "address", dataProviderClass = DataProviders.class)
  public void person_must_be_equivalent(String line1, String townOrCity, String county,
      String postcode) {

    Address actual = new Address(line1, townOrCity, county, postcode);

    assertThat(actual.getLine1()).isEqualTo(line1);
    assertThat(actual.getTownOrCity()).isEqualTo(townOrCity);
    assertThat(actual.getCounty()).isEqualTo(county);
    assertThat(actual.getPostCode()).isEqualTo(postcode);
  }
}