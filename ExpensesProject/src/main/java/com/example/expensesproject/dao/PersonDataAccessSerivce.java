/**
 * 
 */
package com.example.expensesproject.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.expensesproject.model.Person;

/**
 * 
 */
@Repository("postgres")
public class PersonDataAccessSerivce implements PersonDao {

	@Override
	public int insertPerson(UUID id, Person person) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Person> selectAllPeople() {
		// TODO Auto-generated method stub
		return List.of(new Person(UUID.randomUUID(), "From Postgres DB"));
	}

	@Override
	public int deletePersonByID(UUID id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatePersonById(UUID id, Person person) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Optional<Person> selectPersonByID(UUID ID) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
