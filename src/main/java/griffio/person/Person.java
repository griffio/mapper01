package griffio.person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

@Immutable
public class Person {

  private final String fullName;
  private final DateOfBirth dateOfBirth;
  private final Gender gender;
  private final List<Address> addresses;

  public Person(@Nonnull String fullName, @Nonnull DateOfBirth dateOfBirth, @Nonnull Gender gender,
      @Nonnull List<Address> addresses) {
    Objects.requireNonNull(fullName, "fullName argument is null");
    Objects.requireNonNull(dateOfBirth, "dateOfBirth argument is null");
    Objects.requireNonNull(gender, "gender argument is null");
    Objects.requireNonNull(addresses, "addresses argument is null");
    this.fullName = fullName;
    this.dateOfBirth = dateOfBirth;
    this.gender = gender;
    this.addresses = new ArrayList<>(addresses);
  }

  public String getFullName() {
    return this.fullName;
  }

  public DateOfBirth getDateOfBirth() {
    return dateOfBirth;
  }

  public Gender getGender() {
    return gender;
  }

  public List<Address> getAddresses() {
    return Collections.unmodifiableList(addresses);
  }
}