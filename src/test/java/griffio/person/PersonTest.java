package griffio.person;

import com.google.common.testing.NullPointerTester;
import com.google.common.truth.Truth;
import java.time.LocalDate;
import java.util.List;
import org.testng.annotations.Test;

public class PersonTest {

  @Test
  public void constructor_must_be_nonnull() {

    new NullPointerTester().testAllPublicConstructors(Person.class);
  }

  @Test(dataProvider = "person", dataProviderClass = DataProviders.class)
  public void person_must_be_equivalent(String fullName, LocalDate dateOfBirth, Gender gender,
      List<Address> addresses) {

    Person actual = new Person(fullName, dateOfBirth, gender, addresses);

    Truth.assertThat(actual.getFullName()).isEqualTo(fullName);
    Truth.assertThat(actual.getDateOfBirth()).isEqualTo(dateOfBirth);
    Truth.assertThat(actual.getGender()).isEqualTo(gender);
    Truth.assertThat(actual.getAddresses()).isNotEmpty();
  }
}