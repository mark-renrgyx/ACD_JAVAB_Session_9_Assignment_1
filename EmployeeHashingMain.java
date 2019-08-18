package week1.day9.assignment1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EmployeeHashingMain {

	public static void main(String[] args) {
		
		Map<Integer, String> employees = new HashMap<Integer, String>();
		
		employees.put(1, "Tim");
		employees.put(2, "Bill");
		employees.put(5, "Bob");
		employees.put(4, "Steve");
		
		Collection<String> employeeNames = employees.values();
		
		System.out.println(employeeNames);
	}
}
