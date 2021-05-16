import java.awt.Component;

import javax.swing.JOptionPane;

public class Payroll2021 {

	public static void main(String[] args) {
		
		System.out.println("Name \t\tEmployee ID \t\tEmployee Type \t\tSalary \tHourly Rate \tHours Worked \tSales"); //Table header for output
		String input = JOptionPane.showInputDialog("Enter paycode for next employee\nEnter 1 for Mangagers\nEnter 2 for Hourly Workers\nEnter 3 for Commission Workers\n"
				+ "---------------------------------------------------------------------------------------\nEnter employee code. Enter -1 when done"); //Prompt user to input empCode for switch case
		int empCode = Integer.parseInt(input);
		double tax = 0.9625;
		double paycheck;
		
		while(empCode != -1) {
			switch(empCode) {
			case 1:
				input = JOptionPane.showInputDialog("What is the manager's name?");
				String name = input;
				
				input = JOptionPane.showInputDialog("Enter employee ID number");
				int empID = Integer.parseInt(input);
				input = JOptionPane.showInputDialog("Enter their weekly salary");
				double salary = Double.parseDouble(input);
				
				double yearlySalary = (salary * 52 * tax);
				
				System.out.printf("%s", name);
				System.out.printf(" \t\t" + empID + "\t\tManager \t\t$ %.2f\n", yearlySalary);//Print out information
				
				break;
			case 2:
				input = JOptionPane.showInputDialog("Enter hourly worker name");
				name = input;
				
				input = JOptionPane.showInputDialog("Enter employee ID number");
				empID = Integer.parseInt(input);
				
				input = JOptionPane.showInputDialog("Enter hourly rate");
				double hourlyRate = Double.parseDouble(input);
				
				input = JOptionPane.showInputDialog("Enter hours worked");
				int hoursWorked = Integer.parseInt(input);
				
				if(hoursWorked > 40) {
					double newHours = hoursWorked - 40;
					paycheck =	(hoursWorked * hourlyRate) + newHours * hourlyRate * 1.5 * tax;
				}else {
					paycheck = hourlyRate * hoursWorked * tax;
				}
				
				System.out.printf("%s", name);
				System.out.printf(" \t\t" + empID + "\t\tHourly Worker \t\t\t" + hourlyRate + "\t\t" + hoursWorked + "\t\t$%.2f\n", paycheck);//Print out information
				break;
			case 3:
				input = JOptionPane.showInputDialog("Enter commission worker name");
				name = input;
				
				input = JOptionPane.showInputDialog("Enter employee ID number");
				empID = Integer.parseInt(input);
				
				input = JOptionPane.showInputDialog("Enter gross weekly sales");
				double sales = Double.parseDouble(input);
				
				paycheck = (400 + (0.065 * sales)) * tax;			
				
				System.out.printf("%s", name);
				System.out.printf(" \t\t" + empID + "\t\tSales Force\t\t\t\t\t\t\t $%.2f\n", paycheck);//Print out information
				break;
			default:
				Component frame = null;
				JOptionPane.showMessageDialog(frame, "Wrong input.");
			}
			input = JOptionPane.showInputDialog("Enter paycode for next employee\nEnter 1 for Mangagers\nEnter 2 for Hourly Workers\nEnter 3 for Commission Workers\n---------------------------------------------------------------------------------------\nEnter employee code. Enter -1 when done");
			empCode = Integer.parseInt(input);
			if(empCode == -1) {
				System.exit(0);
			}
		}
	}

}
