package griffio.person.data;

import com.google.common.testing.NullPointerTester;
import com.google.common.truth.Truth;
import griffio.mapper.Mapper;
import griffio.person.Address;
import griffio.person.Gender;
import griffio.person.Person;
import griffio.person.PersonProvider;
import java.time.LocalDate;
import java.util.Collections;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PersonToItemMapperTest {

  Mapper<Person, PersonItem> mapper;

  @BeforeMethod
  public void setUp() {
    mapper = new PersonToItemMapper();
  }

  @Test(dataProvider = "person", dataProviderClass = PersonProvider.class)
  public void person_item_must_be_equivalent(String fullName, LocalDate dateOfBirth, Gender gender) {

    Person actual = new Person(fullName, dateOfBirth, gender, Collections.<Address>emptyList());

    PersonItem expected = mapper.map(actual);

    Truth.assertThat(actual.getFullName()).isEqualTo(expected.getFullName());

    Truth.assertThat(actual.getDateOfBirth()).isEqualTo(expected.getDateOfBirth());

    Truth.assertThat(actual.getGender()).isEqualTo(expected.getGender());

    Truth.assertThat(actual.getAddresses()).isEmpty();
  }

  @Test
  public void person_item_must_be_null() {

    Mapper<Person, PersonItem> mapper = new PersonToItemMapper();

    PersonItem actual = mapper.map(null);

    Truth.assertThat(actual).isNull();
  }

  @Test
  public void person_item_mapper_must_be_nullable() {

    new NullPointerTester().testAllPublicInstanceMethods(mapper);
  }
}
