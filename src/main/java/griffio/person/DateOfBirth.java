package griffio.person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

@Immutable
public final class DateOfBirth implements Comparable<DateOfBirth> {

  private final LocalDate localDate;

  public DateOfBirth(LocalDate localDate) {
    this.localDate = localDate;
  }

  public static DateOfBirth dateOfBirth(LocalDate dateOfBirth) {
    return new DateOfBirth(dateOfBirth);
  }

  public static DateOfBirth dateOfBirth(String dateOfBirth) {
    return new DateOfBirth(LocalDate.parse(dateOfBirth));
  }

  public LocalDate asLocalDate() {
    return localDate;
  }

  @Override public int compareTo(@Nonnull DateOfBirth other) {
    return localDate.compareTo(other.localDate);
  }

  @Override public boolean equals(Object other) {
    if (this == other) return true;
    if (!(other instanceof DateOfBirth)) return false;
    DateOfBirth that = (DateOfBirth) other;
    return Objects.equals(localDate, that.localDate);
  }

  @Override public int hashCode() {
    return Objects.hash(localDate);
  }

  @Override public String toString() {
    return this.localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
  }
}
