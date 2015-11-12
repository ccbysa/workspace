package p2;

import p1.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee empOne = new Employee("James Smitch");
		Employee empTwo = new Employee("Marry Anna");
		
		empOne.empAge(26);
		empOne.empDesignation("Senoor software engineer");
		empOne.empSalary(1000);
		empOne.printEmployee();
		
		empTwo.empAge(21);
		empTwo.empDesignation("Software engineer");
		empTwo.empSalary(500);
		empTwo.printEmployee();
	}
}
