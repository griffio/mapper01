package griffio.person.data;

import java.util.Objects;
import javax.annotation.Nonnull;

public class AddressItem {

  private String line1;
  private String townOrCity;
  private String county;
  private String postCode;

  public AddressItem() {
  }

  public String getLine1() {
    return line1;
  }

  public void setLine1(@Nonnull String line1) {
    Objects.requireNonNull(line1, "line1 must not be null");
    this.line1 = line1;
  }

  public String getTownOrCity() {
    return townOrCity;
  }

  public void setTownOrCity(@Nonnull String townOrCity) {
    Objects.requireNonNull(townOrCity, "townOrCity must not be null");
    this.townOrCity = townOrCity;
  }

  public String getCounty() {
    return county;
  }

  public void setCounty(@Nonnull String county) {
    Objects.requireNonNull(county, "county must not be null");
    this.county = county;
  }

  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(@Nonnull String postCode) {
    Objects.requireNonNull(postCode, "postCode must not be null");
    this.postCode = postCode;
  }
}
