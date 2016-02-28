package griffio.person.data;

import com.google.common.testing.NullPointerTester;
import com.google.common.truth.Truth;
import griffio.mapper.Mapper;
import griffio.person.Address;
import griffio.person.DataProviders;
import griffio.person.Gender;
import griffio.person.Person;
import java.time.LocalDate;
import java.util.List;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;

public class PersonToItemMapperTest {

  Mapper<Person, PersonItem> mapper;

  @BeforeMethod
  public void setUp() {
    mapper = new PersonToItemMapper(new AddressToAddressItemMapper());
  }

  @Test(dataProvider = "person", dataProviderClass = DataProviders.class)
  public void person_item_must_be_equivalent(String fullName, LocalDate dateOfBirth, Gender gender,
      List<Address> addresses) {

    Person actual = new Person(fullName, dateOfBirth, gender, addresses);

    PersonItem expected = mapper.map(actual);

    Truth.assertThat(actual.getFullName()).isEqualTo(expected.getFullName());

    Truth.assertThat(actual.getDateOfBirth().format(ISO_LOCAL_DATE))
        .isEqualTo(expected.getDateOfBirth());

    Truth.assertThat(actual.getGender().toString()).isEqualTo(expected.getGender());

    Truth.assertThat(actual.getAddresses()).isNotEmpty();
  }

  @Test
  public void person_item_must_be_null() {

    PersonItem actual = mapper.map(null);

    Truth.assertThat(actual).isNull();
  }

  @Test
  public void person_item_mapper_must_be_nullable() {

    new NullPointerTester().testAllPublicInstanceMethods(mapper);
  }
}
