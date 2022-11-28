/**
 * Customer object class 
 */
public class Customer extends Person implements DataHandler{

	//global variable declaration
	private String customerId;
	private String accountNumber;

	/**
	 * Customer constructor method 
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param phoneNumber
	 * @param email
	 * @param customerId
	 * @param accountNumber
	 */
	public Customer(String firstName, String lastName, String address, String phoneNumber, String email, String customerId, String accountNumber) {

		//assigning variables
		super(firstName, lastName, address, phoneNumber, email);
		this.customerId = customerId;
		this.accountNumber = accountNumber;
	}

	/**
	 * Getter method for customer id
	 * @return customer id 
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * Setter method for customer id 
	 * @param customer id 
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/**
	 * Getter method for customer account number 
	 * @return customer account number 
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	
	/**
	 * Setter method for customer account number 
	 * @param customer account number 
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * Getter method for customer info
	 * @return info
	 */
	@Override
	public String getInfo() {

		String customerInfo = String.format("Customer Info:   Customer Name:  " + super.getInfo() + "   Customer ID:  "  + this.getCustomerId() + "   Account Number:  %-20s",  this.getAccountNumber());
		return customerInfo;
	}

	/**
	 * Getter method for customer file data
	 * @return file data
	 */
	@Override
	public String getFileData() {

		return this.getCustomerId() + "," + super.getFileData();
	}
}
