package griffio.person.data;

import griffio.mapper.Mapper;
import griffio.person.Address;
import javax.inject.Named;

@Named("addressToAddressItemMapper")
public class AddressToAddressItemMapper implements Mapper<Address, AddressItem> {

  @Override
  public AddressItem map(final Address address) {

    if (address == null) {
      return null;
    }

    AddressItem addressItem = new AddressItem();
    addressItem.setLine1(address.getLine1());
    addressItem.setTownOrCity(address.getTownOrCity());
    addressItem.setCounty(address.getCounty());
    addressItem.setPostCode(address.getPostCode());

    return addressItem;
  }
}