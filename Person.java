/**
 * Person object class 
 */
public class Person implements DataHandler {

	//global variable declaration 
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
	private String email;
	
	/**
	 * Person constructor method
	 * @param first Name
	 * @param last Name
	 * @param address
	 * @param phone Number
	 * @param email
	 */
	public Person(String firstName, String lastName, String address, String phoneNumber, String email) {
		
		//assigning variables
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	/**
	 * Getter method for last name
	 * @return last Name
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * Setter method for last name
	 * @param last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Getter method for address
	 * @return address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Setter method for address
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * Getter method for phone number 
	 * @return phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * Setter method for phone number
	 * @param phone number
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * Getter method for email
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Setter method for email
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * Getter method for first name
	 * @return first name
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Setter method for first name
	 * @param first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Getter method for person info
	 * @return info
	 */
	public String getInfo() {
		
		String name = String.format("%-11s %-13s", firstName, lastName);
				
		return name;
	}
	/**
	 * Getter method for person file data
	 * @return file data
	 */
	@Override
	public String getFileData() {
		
		return this.getFirstName() + "," + this.getLastName();
	}

}


