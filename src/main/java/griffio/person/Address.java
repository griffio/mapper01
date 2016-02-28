package griffio.person;

import java.util.Objects;
import javax.annotation.Nonnull;

public class Address {

  private String line1;
  private String townOrCity;
  private String county;
  private String postCode;

  public Address(@Nonnull String line1, @Nonnull String townOrCity, @Nonnull String county,
      @Nonnull String postCode) {
    Objects.requireNonNull(line1, "line1 argument is null");
    Objects.requireNonNull(townOrCity, "townOrCity argument is null");
    Objects.requireNonNull(county, "county argument is null");
    Objects.requireNonNull(postCode, "postCode argument is null");
    this.line1 = line1;
    this.townOrCity = townOrCity;
    this.county = county;
    this.postCode = postCode;
  }

  public String getLine1() {
    return line1;
  }

  public String getTownOrCity() {
    return townOrCity;
  }

  public String getCounty() {
    return county;
  }

  public String getPostCode() {
    return postCode;
  }
}
