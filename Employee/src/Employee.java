import java.util.Arrays;

public class Employee implements Comparable<Employee> {
	int emp_id;
	String emp_name;
	Organisation organisation;
	int salary;

	Employee(int id, String name, Organisation organisation, int salary) {
		this.emp_id = id;
		this.emp_name = name;
		this.organisation = organisation;
		this.salary = salary;
	}

	void printSalary() {
		System.out.println("salary of " + emp_name + " " + salary);
	}

	public static Employee heighestSalary(Employee[] employees) {
		Arrays.sort(employees);
		System.out.println(employees);
		return employees[0];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(123, "vikas", Organisation.WELLSFARGO, 200000);
		Employee emp2 = new Employee(223, "Punam", Organisation.TCS, 100000);
		Employee emp3 = new Employee(333, "jayant", Organisation.ACCENTURE, 1500000);

		emp2.printSalary();
		Employee[] employees = { emp1, emp2, emp3 };
		Employee emp = heighestSalary(employees);
		System.out.println("highest salary of emp: " + emp.emp_name + " is: " + emp.salary);

	}

	@Override
	public int compareTo(Employee o) {
		return o.salary - this.salary;
	}

}
