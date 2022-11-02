

import java.util.Date;

public class Leader extends Employee {

	private int reviewTaskNumber;
	private int supportTaskNumber;
	private double allowance;

	@Override
	public double calMonthlyIncome() {
		return (this.reviewTaskNumber * 4000000) + (this.supportTaskNumber * 400000) + this.getRewardSalary()
				+ this.getAllowance();
	}

	public double calAllowance() {

		Date currentDate = new Date();
		int numberMonthWork = (int) ((currentDate.getTime() - this.getWorkStartingDate().getTime()) / 3600);
		if (numberMonthWork >= 36) {
			return this.getProductivityScore() * 2000000;
		} else {
			return this.getProductivityScore() * 1200000;
		}
	}
	
	public Leader() {
		super();
	}

	public Leader(String empId,int role, String account, Date workStartingDate, double productivityScore, int reviewTaskNumber, int supportTaskNumber) {
		super(empId, role, account, workStartingDate, productivityScore);
		this.reviewTaskNumber = reviewTaskNumber;
		this.supportTaskNumber = supportTaskNumber;
	}

	public int getReviewTaskNumber() {
		return reviewTaskNumber;
	}

	public void setReviewTaskNumber(int reviewTaskNumber) {
		this.reviewTaskNumber = reviewTaskNumber;
	}

	public int getSupportTaskNumber() {
		return supportTaskNumber;
	}

	public void setSupportTaskNumber(int supportTaskNumber) {
		this.supportTaskNumber = supportTaskNumber;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	@Override
	public String toString() {
		return "Leader ["+ super.toString()+",reviewTaskNumber=" + reviewTaskNumber + ", supportTaskNumber=" + supportTaskNumber
				+ ", allowance=" + allowance + "]\n"  ;
	}

}
