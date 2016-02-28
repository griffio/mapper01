package griffio.person;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

@Immutable
public class Person {

  private final String fullName;
  private final LocalDate dateOfBirth;
  private final Gender gender;
  private final List<Address> addresses;

  public Person(@Nonnull String fullName, @Nonnull LocalDate dateOfBirth, @Nonnull Gender gender,
      @Nonnull List<Address> addresses) {
    Objects.requireNonNull(fullName, "fullName argument is null");
    Objects.requireNonNull(dateOfBirth, "dateOfBirth argument is null");
    Objects.requireNonNull(gender, "gender argument is null");
    Objects.requireNonNull(addresses, "addresses argument is null");
    this.fullName = fullName;
    this.dateOfBirth = dateOfBirth;
    this.gender = gender;
    this.addresses = Collections.unmodifiableList(addresses);
  }

  public String getFullName() {
    return this.fullName;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public Gender getGender() {
    return gender;
  }

  public List<Address> getAddresses() {
    return addresses;
  }
}