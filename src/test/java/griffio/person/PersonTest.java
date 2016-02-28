package griffio.person;

import com.google.common.testing.NullPointerTester;
import com.google.common.truth.Truth;
import org.testng.annotations.Test;

public class PersonTest {

  @Test
  public void constructor_must_be_nonnull() {

    new NullPointerTester().testAllPublicConstructors(Person.class);
  }

  @Test
  public void fullName_must_be_equivalent() {

    String expected = "Phileas Fog";

    Person actual = new Person(expected);

    Truth.assertThat(expected).isEqualTo(actual.getFullName());

  }
}