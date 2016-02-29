package griffio.person.data;

import griffio.mapper.Mapper;
import griffio.person.Address;
import griffio.person.Person;
import java.util.List;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Named;

import static java.util.stream.Collectors.toList;

@Named("personToItemMapper")
public class PersonToItemMapper implements Mapper<Person, PersonItem> {

  private final Mapper<Address, AddressItem> addressMapper;

  @Inject
  public PersonToItemMapper(Mapper<Address, AddressItem> addressMapper) {
    this.addressMapper = addressMapper;
  }

  @Override
  public PersonItem map(@Nullable Person person) {

    if (person == null) {
      return null;
    }

    PersonItem personItem = new PersonItem();
    personItem.setFullName(person.getFullName());
    personItem.setDateOfBirth(person.getDateOfBirth().toString());
    personItem.setGender(person.getGender().toString());

    List<AddressItem> addressItems;
    addressItems = person.getAddresses().stream().map(addressMapper::map).collect(toList());

    personItem.setAddressItems(addressItems);

    return personItem;
  }
}
