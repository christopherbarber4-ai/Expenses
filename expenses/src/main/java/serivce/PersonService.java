/**
 * 
 */
package serivce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import dao.FakePersonDataAccessService;
import dao.PersonDao;
import model.Person;

/**
 * 
 */
@Service
public class PersonService {
	
	private final PersonDao personDao;
	
	
	@Autowired
	public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
		this.personDao = personDao;
	}
	
	public int addPerson(Person person) {
		return PersonDao.insertPerson(person);
		
	}

}
