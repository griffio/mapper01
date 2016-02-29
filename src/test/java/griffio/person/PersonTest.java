package griffio.person;

import com.google.common.testing.NullPointerTester;
import java.time.LocalDate;
import java.util.List;
import org.testng.annotations.Test;

import static com.google.common.truth.Truth.assertThat;

public class PersonTest {

  @Test
  public void constructor_must_be_nonnull() {

    new NullPointerTester()
        .setDefault(DateOfBirth.class, DateOfBirth.dateOfBirth(LocalDate.now()))
        .testAllPublicConstructors(Person.class);
  }

  @Test(dataProvider = "person", dataProviderClass = DataProviders.class)
  public void person_must_be_equivalent(String fullName, DateOfBirth dateOfBirth, Gender gender,
      List<Address> addresses) {

    Person actual = new Person(fullName, dateOfBirth, gender, addresses);

    assertThat(actual.getFullName()).isEqualTo(fullName);
    assertThat(actual.getDateOfBirth()).isEqualTo(dateOfBirth);
    assertThat(actual.getGender()).isEqualTo(gender);
    assertThat(actual.getAddresses()).isNotEmpty();
  }
}