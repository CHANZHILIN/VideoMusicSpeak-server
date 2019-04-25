package chen.vms.service.impl;

import chen.vms.dao.PersonMapperDao;
import chen.vms.entity.Person;
import chen.vms.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapperDao personMapperDao;

    public Person findPersonById(long id) {
        return personMapperDao.findPersonById(id);
    }
}