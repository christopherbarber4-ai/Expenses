/**
 * 
 */
package com.example.expensesproject.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.expensesproject.dao.PersonDao;
import com.example.expensesproject.model.Person;

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
	
	public List<Person> getAllPeople(){
		return personDao.selectAllPeople();
		
	}
	
	public Optional<Person> getPersonById(UUID id){
		return personDao.selectPersonByID(id);
	}
	
	public int deletePerson(UUID id) {
		return personDao.deletePersonByID(id);
	}
	
	public int updatePerson(UUID id, Person newPerson) {
		return personDao.updatePersonById(id, newPerson);
		
	}

}
