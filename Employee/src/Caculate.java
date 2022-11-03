import java.util.ArrayList;
public class Caculate {
	//input arraylist and string then return position of string in arraylist
	public static int findPosition(ArrayList<Employee> employeeList, String empId){
		// String listEmpId = employeeList.getEmpId();
		//System.out.println(employeeList.indexOf(empId));
		int temp=-1;
		for (int i = 0; i < employeeList.size(); i++)if(employeeList.get(i).getEmpId().contains(empId))temp=i;
		return temp;
	}
  //input data from ArrayList<Employee> employeeList
  //caculate RewardSalary,MontlyIncome for employee, caculate Allowance for managerment and leader, final return ArrayList<Employee> employeeList
  //function to caculate
	public static ArrayList<Employee> update(ArrayList<Employee> arr, String empId, Employee employee){
		int position = findPosition(arr, empId);
		arr.set(position, employee);
		return arr;
	}
	public static Employee calculate(ArrayList<Employee> arr, String empId) {
		int i = findPosition(arr, empId);
    // for(i=0;i<=arr.size();i++)
			if (arr.get(i) instanceof Management) {
				Management tempMana = (Management) arr.get(i);//ép kiểu từ employee sang management 
				tempMana.setRewardSalary(tempMana.calReward());
				tempMana.setAllowance(tempMana.calAllowance());
				tempMana.setMonthlyIncome(tempMana.calMonthlyIncome());

			} else if (arr.get(i) instanceof Leader) {
				Leader tempLeader = (Leader) arr.get(i);//ép kiểu từ employee sang leader
				tempLeader.setRewardSalary(tempLeader.calReward());
				tempLeader.setAllowance(tempLeader.calAllowance());
				tempLeader.setMonthlyIncome(tempLeader.calMonthlyIncome());

			} else {
				Dev tempDev = (Dev) arr.get(i);//ép kiểu từ employee sang dev
				tempDev.setRewardSalary(tempDev.calReward());
				tempDev.setMonthlyIncome(tempDev.calMonthlyIncome());

			}
  	
		return arr.get(i);
	}

	static ArrayList<Employee> calculate(ArrayList<Employee> input) {

		for (Employee employee : input) {
			if (employee instanceof Management) {
				Management tempMana = (Management) employee;//ép kiểu từ employee sang management 
				tempMana.setRewardSalary(tempMana.calReward());
				tempMana.setAllowance(tempMana.calAllowance());
				tempMana.setMonthlyIncome(tempMana.calMonthlyIncome());

			} else if (employee instanceof Leader) {
				Leader tempLeader = (Leader) employee;//ép kiểu từ employee sang leader
				tempLeader.setRewardSalary(tempLeader.calReward());
				tempLeader.setAllowance(tempLeader.calAllowance());
				tempLeader.setMonthlyIncome(tempLeader.calMonthlyIncome());

			} else {
				Dev tempDev = (Dev) employee;//ép kiểu từ employee sang dev
				tempDev.setRewardSalary(tempDev.calReward());
				tempDev.setMonthlyIncome(tempDev.calMonthlyIncome());

			}
		}

		return input;
	}
}