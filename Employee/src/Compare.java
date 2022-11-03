import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Compare{
	//input data from arraylist 
	//comapre income and account
	//print
	public static void compareIncomeAndAccountThenPrint(ArrayList<Employee> employeeList){
		Collections.sort(employeeList, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getMonthlyIncome() > o2.getMonthlyIncome()){
					return -1;
				}else if(o1.getMonthlyIncome() < o2.getMonthlyIncome()){
					return 1;
				}else{
					return o1.getAccount().compareTo(o2.getAccount());
				}
			}
		});
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
	//input data from arraylist
	//compare role and empId
	//print
	public static void compareRoleAndEmpIdThenPrint(ArrayList<Employee> employeeList){
		Collections.sort(employeeList, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getRole() > o2.getRole()){
					return 1;
				}else if(o1.getRole() < o2.getRole()){
					return -1;
				}else{
					return o1.getEmpId().compareTo(o2.getEmpId());
				}
			}
		});
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
}