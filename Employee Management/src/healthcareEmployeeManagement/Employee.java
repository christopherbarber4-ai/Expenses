/**
 * 
 */
package healthcareEmployeeManagement;

/**
 * Class that enables the production of specific employee types
 */
public class Employee {

	// INSTANCE VARIABLES
	private String name;
	BusinessUnit bUnit;
	private int yearsService;
	private double salary;
	private String location;

	// CONSTRUCTORS

	public Employee() {

	}

	public Employee(String name, BusinessUnit bUnit, int yearsService, double salary, String location)
			throws IllegalArgumentException {
		this.name = name;
		this.bUnit = bUnit;
		this.yearsService = yearsService;
		this.setSalary(salary);
		this.location = location;
	}

	// METHODS INCLUDING GETTERS AND SETTERS

	/**
	 * gets the name
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * sets the name
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * gets the Business unit
	 * @return the bUnit
	 */
	public BusinessUnit getbUnit() {
		return bUnit;
	}

	/**
	 * sets the Business unit
	 * @param bUnit the bUnit to set
	 */
	public void setbUnit(BusinessUnit bUnit) {
		this.bUnit = bUnit;
	}

	/**
	 * gets the years of service
	 * @return the yearsService
	 */
	public int getYearsService() {
		return yearsService;
	}

	/**
	 * sets the years of service
	 * @param yearsService the yearsService to set
	 */
	public void setYearsService(int yearsService) {
		this.yearsService = yearsService;
	}

	/**
	 * gets the salary
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * sets the salary
	 * @param salary the salary to set
	 * @throws IllegalArgumentException if the salary entered is not at least £1
	 */
	public void setSalary(double salary) throws IllegalArgumentException {
		if (salary > 0) {
			this.salary = salary;
		} else {
			throw new IllegalArgumentException("Error, salary must be at least £1");
		}
	}

	/**
	 * gets the location
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * sets the location
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	public void displayRecord() {

	}

	public void receiveSalary() {

	}

	public void calcBenefits() {

	}

}
