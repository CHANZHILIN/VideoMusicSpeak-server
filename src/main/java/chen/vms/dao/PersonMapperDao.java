package chen.vms.dao;

import chen.vms.entity.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonMapperDao {
    Person findPersonById(long id);
}