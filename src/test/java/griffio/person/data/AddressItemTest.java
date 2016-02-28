package griffio.person.data;

import com.google.common.testing.NullPointerTester;
import org.testng.annotations.Test;

public class AddressItemTest {

  @Test
  public void address_item_mapper_must_be_non_nullable() {

    new NullPointerTester().testAllPublicInstanceMethods(new AddressItem());
  }
}