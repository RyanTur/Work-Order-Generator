import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
/**
 * Project 3 file handler class
 */
public class FileHandler {

	/**
	 * reads in employee data
	 * @param employeeFileName
	 * @throws FileNotFoundException
	 */
	public void readEmployeeData(String employeeFileName) throws FileNotFoundException {

		//file and scanner declarations
		File file = new File(employeeFileName);
		Scanner scnr = new Scanner(file);

		String firstLine = scnr.nextLine(); //skipping the first line

		//while loop to iterate through the data
		while (scnr.hasNext()) {

			String line = scnr.nextLine(); //reading line 
			String[] token = line.split(","); //splitting the line
			Employee employee = new Employee(token[1], token[2], token[4], token[5], token[3], token[0], token[6], token[7]); //assigning parts of line to a employee object
			Project3.employees.add(employee);//adding employee to employee array list

		}

		scnr.close(); //closing the scanner
	}

	/**
	 * Reads in customer ticket data
	 * @param ticketFileName
	 * @throws FileNotFoundException
	 */
	public void readTicketData(String ticketFileName) throws FileNotFoundException {

		//file and scanner declarations 
		File file = new File(ticketFileName);
		Scanner scnr = new Scanner(file);

		String firstLine = scnr.nextLine(); //skipping the first line

		while (scnr.hasNext()) {

			String line = scnr.nextLine(); //reading line
			String[] token = line.split(","); //splitting the line
			Customer customer = new Customer(token[1], token[2], token[4], token[5], token[3], token[0], token[6]); //assigning parts of line to customer object
			Ticket ticket = new Ticket(customer, token[8], token[7]);//assigning customer and other parts of line to ticket object
			Project3.tickets.add(ticket); //adding ticket to ticket array list

		}

		scnr.close(); //closing the scanner 
	}

	/**
	 * Writing work order data to file
	 * @param workOrderFileName
	 * @throws IOException
	 */
	public void writeData(String workOrderFileName) throws IOException {
		
		//declaring print writer
		PrintWriter writer = new PrintWriter(workOrderFileName);
		
		//printing the header
		writer.println("employee_id,employee_first_name,employee_last_name,clocked_in,customer_id,customer_first_name,customer_last_name,ticket_id,ticket_createdAt,workorder_createdAt");
		
		//for loop to iterate through and write the work orders to file
		for(WorkOrder workOrder : Project3.workOrders) {
			writer.println(workOrder.getFileData());
			logger(workOrder.getInfo());//sending getInfo of work orders to the logger
		}
		
		writer.close(); //closing the writer

	}

	/**
	 * Appends string to logger file
	 * @param log
	 * @throws IOException
	 */
	public void logger(String log) throws IOException {

		File file = new File("logger.txt"); //creating logger file if not made 
		FileWriter writer = new FileWriter(file, true); //initializing file writer
		String timeStamp = new SimpleDateFormat("MM/dd/yyy HH:mm:ss").format(Calendar.getInstance().getTime()); //getting current time and data string 
		writer.append(timeStamp + " " + log + "\n"); //appending time stamp and string to log file
		
		writer.close(); //closing the writer

	}
}

