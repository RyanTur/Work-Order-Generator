/**
 * work order object class 
 */
public class WorkOrder implements DataHandler {

	//global variable declaration
	private Employee employee;
	private Ticket ticket;
	private String createdAt;

	/**
	 * Work order constructor
	 * @param employee
	 * @param ticket
	 * @param createdAt
	 */
	public WorkOrder(Employee employee, Ticket ticket, String createdAt) {
 
		//assigning variables
		this.employee = employee;
		this.ticket = ticket;
		this.createdAt = createdAt;
	}

	/**
	 * Getter method for employee
	 * @return employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * Setter method for employee
	 * @param employee
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	/**
	 * Getter method for ticket
	 * @return ticket
	 */
	public Ticket getTicket() {
		return ticket;
	}

	/**
	 * Setter method for ticket
	 * @param ticket
	 */
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	/**
	 * Getter method for work order created date
	 * @return created date
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * Setter method for work order created date
	 * @param work order created date
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * Getter method for work order info
	 * @return work order info
	 */
	@Override
	public String getInfo() {

		String workOrderInfo = employee.getInfo() + "  " + ticket.getInfo() + "  Work Order Info:   Created At: " + this.getCreatedAt();
		return workOrderInfo;	
	}

	/**
	 * Getter method for work order file data
	 * @return work order file data
	 */
	@Override
	public String getFileData() {

		return employee.getFileData() + "," + ticket.getFileData() + "," + this.getCreatedAt();

	}
}
