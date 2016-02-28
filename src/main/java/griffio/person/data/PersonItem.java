package griffio.person.data;

import java.util.List;
import java.util.Objects;
import javax.annotation.Nonnull;

public class PersonItem {

  private String fullName;
  private String dateOfBirth;
  private String gender;
  private List<AddressItem> addressItems;

  public String getFullName() {
    return fullName;
  }

  public void setFullName(@Nonnull String fullName) {
    Objects.requireNonNull(fullName, "fullName must not be null");
    this.fullName = fullName;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(@Nonnull String dateOfBirth) {
    Objects.requireNonNull(dateOfBirth, "dateOfBirth must not be null");
    this.dateOfBirth = dateOfBirth;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(@Nonnull String gender) {
    Objects.requireNonNull(gender, "gender must not be null");
    this.gender = gender;
  }

  public List<AddressItem> getAddressItems() {
    return addressItems;
  }

  public void setAddressItems(@Nonnull List<AddressItem> addressItems) {
    Objects.requireNonNull(addressItems, "addressItems must not be null");
    this.addressItems = addressItems;
  }
}

