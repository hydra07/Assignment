
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
//import java.util.Scanner;

public class Main {

//	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<Employee> employeeList = new ArrayList<Employee>();
	public static void main(String[] args) throws IOException, NumberFormatException, ParseException {
		String[] options = { "Input from CSV file", "Caculate","Caculate All","Print sort income","Print sort role","Export file", "Exit" };
		int choice;
	
		do{
				System.out.println("Enter number: ");
				choice = Menu.getChoice(options);
			switch (choice) {
			case 1:// Input from CSV file
				employeeList = File.inputCSV();
				for (Employee employee : employeeList) {
					System.out.println(employee);
				}
				break;
			case 2:// Caculate
				//employeeList = File.inputCSV();
				// System.out.println("Input empId to caculate: ");
				String id = Inputter.inputId("Input empId[MNV000] to caculate: ","[mM][nN][vV][\\d]{3}");
				System.out.println(Caculate.calculate(employeeList,id));
				// System.out.println("Do you want to update?(y/n)");
				String ans = Inputter.inputChar("Do you want to update?(y/n)");
				if(ans.equals("Y"))employeeList=Caculate.update(employeeList,id,Caculate.calculate(employeeList,id));
				System.out.println("Update success!");
				break;
			case 3:
				employeeList = Caculate.calculate(employeeList);
				break;
			case 4:// Print sort income
				// employeeList = File.inputCSV();
				//calculate(employeeList);
				Compare.compareIncomeAndAccountThenPrint(employeeList);
				break;
			case 5:// Print sort role
				// employeeList = File.inputCSV();
				//calculate(employeeList);
				Compare.compareRoleAndEmpIdThenPrint(employeeList);
				break;
			case 6:
				File.outputCSV(employeeList);
				break;
			case 7://exit
				System.out.println("Exit");
				System.exit(2);
          }
						}while (true);
          }

	}
