/**
 * 
 */
package com.example.expensesproject.dao;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.expensesproject.model.*;

/**
 * 
 */
@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao {

	private static List<Person> DB = new ArrayList<>();

	@Override
	public int insertPerson(UUID id, Person person) {
		DB.add(new Person(id, person.getName()));
		return 1;
	}

	@Override
	public List<Person> selectAllPeople() {
		return DB;
	}

	@Override
	public int deletePersonByID(UUID id) {
		Optional<Person> personMaybe = selectPersonByID(id);
		if (personMaybe.isEmpty()) {
			return 0;
		}
		DB.remove(personMaybe.get());
		return 1;
	}

	@Override
	public int updatePersonById(UUID id, Person update) {
		return selectPersonByID(id).map(person -> {
			int indexOfPersonToUpdate = DB.indexOf(person);
			if (indexOfPersonToUpdate >= 0) {
				DB.set(indexOfPersonToUpdate, new Person(id, update.getName()));
				return 1;
			}
			return 0;
		}).orElse(0);
	}

	@Override
	public Optional<Person> selectPersonByID(UUID ID) {
		// TODO Auto-generated method stub
		return DB.stream().filter(person -> person.getId().equals(ID)).findFirst();
	}

}
