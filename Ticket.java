/**
 * Ticket object class
 */
public class Ticket implements DataHandler{
	
	//global variable declaration
	private Customer customer;
	private String createdAt;
	private String ticketId;

	/**
	 * Ticket constructor 
	 * @param customer
	 * @param createdAt
	 * @param ticketId
	 */
	public Ticket(Customer customer, String createdAt, String ticketId) {

		//assigning variables
		this.customer = customer;
		this.createdAt = createdAt;
		this.ticketId = ticketId;
	}
	/**
	 * Getter method for ticket created date
	 * @return created date
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * Setter method for ticket created date
	 * @param created date
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * Getter method for customer 
	 * @return customer 
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * Setter method for customer 
	 * @param customer
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * Getter method for ticket id
	 * @return ticket id 
	 */
	public String getTicketId() {
		return ticketId;
	}

	/**
	 * Setter method for ticket id 
	 * @param ticket id 
	 */
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	/**
	 * Getter method for ticket info 
	 * @return ticket info 
	 */
	@Override
	public String getInfo() {

		String ticketInfo = String.format(customer.getInfo() + "   Created At:  %-17s + " +  "Ticket ID: " + this.getTicketId(), this.getCreatedAt()); 
		return ticketInfo;
	}
	/**
	 * Getter method for ticket file data
	 * @return ticket file data 
	 */
	@Override
	public String getFileData() {

		return customer.getFileData() + "," + this.getTicketId() + "," + this.getCreatedAt();
	}
}
