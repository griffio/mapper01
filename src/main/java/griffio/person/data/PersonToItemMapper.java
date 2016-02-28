package griffio.person.data;

import griffio.mapper.Mapper;
import griffio.person.Person;
import javax.annotation.Nullable;
import javax.inject.Named;

@Named("personToItemMapper")
public class PersonToItemMapper implements Mapper<Person, PersonItem> {

  public PersonToItemMapper() {
  }

  @Override
  public PersonItem map(@Nullable Person person) {

    if (person == null) {
      return null;
    }

    PersonItem item = new PersonItem();
    //BeanUtils.copyProperties(person, item); we could use reflection but could be brittle if Person changes in the future
    item.setFullName(person.getFullName());

    return item;
  }
}
