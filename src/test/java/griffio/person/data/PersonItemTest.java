package griffio.person.data;

import com.google.common.testing.NullPointerTester;
import org.testng.annotations.Test;

public class PersonItemTest {

  @Test
  public void person_item_mapper_must_be_nullable() {

    new NullPointerTester().testAllPublicInstanceMethods(new PersonItem());
  }
}