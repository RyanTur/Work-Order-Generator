/*
 * Author: Ryan Turlington
 * Course: COP3503
 * Project #3
 * Title  :  Objects and Classes
 * Due Date: 11/23/2002
 * 
 * reads in a list of employees and  customer tickets and then assigns an even number of work orders per employee
 */
import java.text.SimpleDateFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * reads in a list of employees and  customer tickets and then assigns an even number of work orders per employee
 */
public class Project3 {

	//declaring public static variables 
	public static String employeeFileName = "employee_data.csv";
	public static String ticketFileName = "ticket_data.csv";
	public static String workOrderFileName = "workorder_data.csv";

	public static ArrayList<Employee> employees = new ArrayList<Employee>();
	public static ArrayList<Ticket> tickets = new ArrayList<Ticket>();
	public static ArrayList<WorkOrder> workOrders = new ArrayList<WorkOrder>();

	public static void main(String[] args) {

		try {
			FileHandler fileHandler = new FileHandler(); //creating fileHandler
			
			//printing to console and logger 
			System.out.println("Loading Employee Data");
			fileHandler.logger("Loading Employee Data");

			fileHandler.readEmployeeData(employeeFileName);//calling file handler to read-in employees

			//printing to console and logger 
			System.out.println("Loading Ticket Data");
			fileHandler.logger("Loading Ticket Data");

			fileHandler.readTicketData(ticketFileName);//calling file handler to read-in customer tickets

			//printing to console and logger 
			System.out.println("Creating Work Orders");
			fileHandler.logger("Creating Work Orders");

			createWorkOrders(); //calling method to create the work orders

			//printing to console and logger 
			System.out.println("Writing Work Order Data to File");
			fileHandler.logger("Writing Work Order Data to File");

			fileHandler.writeData(workOrderFileName);//calling file handler to output the work orders to text files

			//printing to console and logger 
			System.out.println("Work Orders Created. Program Exiting");
			fileHandler.logger("Work Orders Created. Program Exiting");

		} catch (IOException e) {
			System.out.println("An error has occurred please try agian.");
			e.printStackTrace();
		}
	}
/**
 * Uses global variables to combine customer tickets and employees to create the work orders
 */
	public static void createWorkOrders() {

		int i = 0; //initializing a variable to count
		
		//while loop to run through all the tickets
		while (i < tickets.size()) {

			//for loop to iterate number of employees
			for(int j = 0; j < employees.size(); j++) {
				
				//if check to determine if a work order needs to be created 
				if(i < tickets.size()) {
					
					//creating a string with the current date format 
					String createdAt = new SimpleDateFormat("MM/dd/yyy HH:mm:ss").format(Calendar.getInstance().getTime());
					WorkOrder workOrder = new WorkOrder(employees.get(j), tickets.get(i), createdAt);//creating the work order
					workOrders.add(workOrder); //adding the work order to the array list
					i++; //counting number of passes
				} else j = employees.size(); //if check not passed, ends the loop
			}
		}
	}
}