import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;

public abstract class Employee {

	private String empId;
	private int role;
	private String account;
	private Date workStartingDate;
	private double productivityScore;
	private double monthlyIncome;
	private double rewardSalary;

	public Employee() {
		super();
	}

	public Employee(String empId, int role, String account, Date workStartingDate, double productivityScore) {
		super();
		this.empId = empId;
		this.role = role;
		this.account = account;
		this.workStartingDate = workStartingDate;
		this.productivityScore = productivityScore;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Date getWorkStartingDate() {
		return workStartingDate;
	}

	public void setWorkStartingDate(Date workStartingDate) {
		this.workStartingDate = workStartingDate;
	}

	public double getProductivityScore() {
		return productivityScore;
	}

	public void setProductivityScore(double productivityScore) {
		this.productivityScore = productivityScore;
	}

	public double getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public double getRewardSalary() {
		return rewardSalary;
	}

	public void setRewardSalary(double rewardSalary) {
		this.rewardSalary = rewardSalary;
	}

	public abstract double calMonthlyIncome();

	public double calReward() {
		return this.productivityScore * 3000000;
	}

	@Override
	public String toString() {
		NumberFormat formatter = new DecimalFormat("#0.00");
		return "empId=" + empId + ", role=" + role + ", account=" + account + ", workStartingDate="
				+ workStartingDate + ", productivityScore=" + productivityScore + ", monthlyIncome=" + formatter.format(monthlyIncome)
				+ ", rewardSalary=" + formatter.format(rewardSalary);
	}
}
