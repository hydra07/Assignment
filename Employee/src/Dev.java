
import java.util.Date;

public class Dev extends Employee {
	private int doneTaskNumber;

	@Override
	public double calMonthlyIncome() {
		return this.doneTaskNumber * 1500000 + this.getRewardSalary();
	}

	public Dev() {
		super();
	}

	public Dev(String empId, int role, String account, Date workStartingDate, double productivityScore, int doneTaskNumber) {
		super(empId, role, account,  workStartingDate, productivityScore);
		this.doneTaskNumber = doneTaskNumber;
	}

	public int getDoneTaskNumber() {
		return doneTaskNumber;
	}

	public void setDoneTaskNumber(int doneTaskNumber) {
		this.doneTaskNumber = doneTaskNumber;
	}

	@Override
	public String toString() {
		return "Dev ["+ super.toString()+"doneTaskNumber=" + doneTaskNumber + "]\n";
	}
}
