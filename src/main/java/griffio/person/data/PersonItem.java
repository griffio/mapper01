package griffio.person.data;

import java.util.Objects;
import javax.annotation.Nonnull;

public class PersonItem {

  private String fullName;

  public String getFullName() {
    return fullName;
  }

  public void setFullName(@Nonnull String fullName) {
    Objects.requireNonNull(fullName, "fullName must not be null");
    this.fullName = fullName;
  }
}

