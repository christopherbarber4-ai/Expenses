/**
 * 
 */
package model;

import java.util.UUID;

/**
 * 
 */
public class Person {
	
	private final UUID id;
	private final String name;
	
	
	public Person(UUID id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public UUID getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	
	

}
