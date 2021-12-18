package com.bl.empwageuc9and10;

public class EmployeWageCal {
public static void main(String[] args) {
		
		Employee infosysEmp = new Employee("Infosys", "Rahul", 6, 18, 22, 50);
		int infosysEmpWage = infosysEmp.calculateEmpWage();
		System.out.println(infosysEmp.empName + " is working with " + infosysEmp.companyName + ", and he is earning "
				+ infosysEmpWage + "$ monthly");
	
		
		Employee dmartEmp = new Employee("DMart", "Raju", 8, 17, 20, 70);
		int dmartEmpWage = dmartEmp.calculateEmpWage();

		System.out.println(dmartEmp.empName + " is working with " + dmartEmp.companyName + ", and he is earning "
				+ dmartEmpWage + "$ monthly");

		Employee rILEmp = new Employee("Reliance", "Ganesh", 5, 15, 25, 60);
		int rILEmpWage = rILEmp.calculateEmpWage();
		System.out.println(rILEmp.empName + " is working with " + rILEmp.companyName + ", and he is earning "
				+ rILEmpWage + "$ monthly");
		
	}
}
