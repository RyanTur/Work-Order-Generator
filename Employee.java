/**
 * Employee object class 
 */
public class Employee extends Person implements DataHandler{

	//global variable declaration 
	private String employeeId;
	private String clockedIn;
	private String hiredDate;
 /**
  * Employee constructor 
  * @param firstName
  * @param lastName
  * @param address
  * @param phoneNumber
  * @param email
  * @param employeeId
  * @param clockedIn
  * @param hiredDate
  */
	public Employee(String firstName, String lastName, String address, String phoneNumber, String email, String employeeId, String clockedIn, String hiredDate) {

		//assigning variables
		super(firstName, lastName, address, phoneNumber, email);
		this.employeeId = employeeId;
		this.clockedIn = clockedIn;
		this.hiredDate = hiredDate;
	}
	/**
	 * Getter method for employee id
	 * @return employee id
	 */
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	 * Setter method for employee id
	 * @param employee id
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * Getter method for clocked in date
	 * @return clocked in date
	 */
	public String getClockedIn() {
		return clockedIn;
	}

	/**
	 * Setter method for clocked in date
	 * @param clocked in date
	 */
	public void setClockedIn(String clockedIn) {
		this.clockedIn = clockedIn;
	}

	/**
	 * Getter method for hired date
	 * @return hired date
	 */
	public String getHiredDate() {
		return hiredDate;
	}

	/**
	 * Setter method for hired date
	 * @param hired date
	 */
	public void setHiredDate(String hiredDate) {
		this.hiredDate = hiredDate;
	}
	
	/**
	 * Getter method for employee info
	 * @return employee info
	 */
	@Override
	public String getInfo() {
		
		String employeeString = String.format("Employee Info:  Employee Name: " + super.getInfo() + "   " + "Employee ID: " + this.getEmployeeId() + "   " + "Time Clocked In: %-17s", this.getClockedIn());
		
		return employeeString;
	}
	
	/**
	 * Getter method for employee file data
	 * @return employee file data
	 */
	@Override
	public String getFileData() {
		
		String employeeData = getEmployeeId() + "," + super.getFileData() + "," + getClockedIn();
		
		return employeeData;
	}
}
