/**
 * 
 */
package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import dao.PersonDao;
import model.Person;

/**
 * 
 */
@Service
public class PersonService {
	
	private PersonDao personDao;
	
	@Autowired
	public void PersonSerice(@Qualifier("fakeDao") PersonDao personDao) {
		this.personDao = personDao;
	}
	
	public int addPerson(Person person) {
		return personDao.insertPerson(person);
	}

}
