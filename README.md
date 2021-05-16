# Payroll2021
Payroll2021

**Kenneth Blanton**
**Problem**: A company pays its employees as Managers (who receive a fixed weekly salary), hourly workers (who receives a fixed hourly wage up to 40 hours and then time and half after that), and commission workers (their sales team) - who receive $400 plus 6.5% of their gross weekly sales.   Write a program to compute the weekly pay for each employee. You do not know the number of employees in advance.  Each type of employee has its own pay code: Manager have pay code 1, hourly workers have code 2, and commission workers have code 3.  Use a switch to compute each employee's pay based on the employees' pay code.   A tax amount of 3.75% of gross salary will be deducted. Within the switch, prompt the user (i.e., the payroll clerk) to enter the appropriate facts your program needs to calculate each employee's pay based on that employee's pay code.   The program output should show the employee type, gross pay, and net pay.    Be sure the employee's pay is to the hundredths position.

**Data Requirements**:

**Problem Constants**: double tax
400 for commission and 0.6 each sale for commission workers

**Problem Inputs**:
String input
int empID
Double salary
Double yearlySalary
Double hourlyRate
Int hoursWorked
Int empCode

**Problem Outputs**: int empID
Double salary
Double yearlySalary
Double hourlyRate
Double paycheck
Int hoursWorked
Double tax

**Relevant Formulas**:
paycheck =	(hoursWorked * hourlyRate) + newHours * hourlyRate * 1.5 * tax;
paycheck = hourlyRate * hoursWorked * tax;
paycheck = (400 + (0.065 * sales)) * tax;
yearlySalary = (salary * 52 * tax);
