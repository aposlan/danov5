package danov5;

public class Secretary extends Employee {

	private String otherLanguages;

	public Secretary() {

	}

	public Secretary(String name, int salary, String otherLanguages) {
		super(name, salary);
		this.otherLanguages = otherLanguages;
	}

	public String getOtherLanguages() {
		return otherLanguages;
	}

	public void setOtherLanguages(String otherLanguages) {
		this.otherLanguages = otherLanguages;
	}
	
	public String toString() {
		return "Secretary " + super.toString()+ ", other languages:" + otherLanguages;
	}

}
