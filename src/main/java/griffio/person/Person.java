package griffio.person;

import java.util.Objects;
import javax.annotation.Nonnull;

public class Person implements Comparable<Person> {

  private final String fullName;

  public Person(@Nonnull String fullName) {
    Objects.requireNonNull(fullName, "fullName argument is null");
    this.fullName = fullName;
  }

  public String getFullName() {
    return this.fullName;
  }

  @Override public int compareTo(@Nonnull Person other) {
    Objects.requireNonNull(other, "person argument is null");
    return this.fullName.compareTo(other.fullName);
  }
}