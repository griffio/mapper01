package griffio.data;

import com.google.common.testing.NullPointerTester;
import com.google.common.truth.Truth;
import griffio.mapper.Mapper;
import griffio.person.Person;
import griffio.person.data.PersonItem;
import griffio.person.data.PersonToItemMapper;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PersonToItemMapperTest {

  Mapper<Person, PersonItem> mapper;

  @BeforeMethod
  public void setUp() {
    mapper = new PersonToItemMapper();
  }

  @Test
  public void person_item_Name_must_be_equivalent() {

    Person actual = new Person("Phileas Fogg");

    PersonItem expected = mapper.map(actual);

    Truth.assertThat(actual.getFullName()).isEqualTo(expected.getFullName());
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
