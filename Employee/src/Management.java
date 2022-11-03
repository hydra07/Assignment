import java.util.Date;
public class Management extends Employee {

	private int resolveIssueNumber;
	private int otherTaskNumber;
	private double allowance;

	@Override
	public double calMonthlyIncome() {
		return (this.resolveIssueNumber * 5000000) + (this.otherTaskNumber * 500000) + this.getRewardSalary()
				+ this.getAllowance();
	}

	public double calAllowance() {
		Date currentDate = new Date();
		Date workStartingDate = this.getWorkStartingDate();
		long tmp = Math.abs(currentDate.getTime()-workStartingDate.getTime());
		long tmp2 = tmp/(24*60*60*1000);
		long numberMonthWork =  (((tmp2)*8)/30);
		if (numberMonthWork >= 36) {
			return this.getProductivityScore() * 2000000;
		} else {
			return this.getProductivityScore() * 1200000;
		}
	}

	public Management() {
		super();
	}

	public Management(String empId, int role, String account, Date workStartingDate, double productivityScore,
			int resolveIssueNumber, int otherTaskNumber) {
		super(empId, role, account, workStartingDate, productivityScore);
		this.resolveIssueNumber = resolveIssueNumber;
		this.otherTaskNumber = otherTaskNumber;
	}

	public int getResolveIssueNumber() {
		return resolveIssueNumber;
	}

	public void setResolveIssueNumber(int resolveIssueNumber) {
		this.resolveIssueNumber = resolveIssueNumber;
	}

	public int getOtherTaskNumber() {
		return otherTaskNumber;
	}

	public void setOtherTaskNumber(int otherTaskNumber) {
		this.otherTaskNumber = otherTaskNumber;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	@Override
	public String toString() {
		return "Management ["+ super.toString()+", resolveIssueNumber=" + resolveIssueNumber + ", otherTaskNumber=" + otherTaskNumber
				+ ", allowance=" + allowance + "]\n" ;
	}

}