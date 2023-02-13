package danov5;

public class Manager extends Employee {
	private int financialBonus;

	public Manager() {

	}

	public Manager(String name, int salary, int financialBonus) {
		super(name, salary);
		this.financialBonus = financialBonus;
	}

	public int getFinancialBonus() {
		return financialBonus;
	}

	public void setFinancialBonus(int financialBonus) {
		this.financialBonus = financialBonus;
	}
	
	public String toString() {
		return "Manager " + super.toString()+ ", financial bonus:" + financialBonus;
	}

}
