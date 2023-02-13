package danov5;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee("Ivan", 1000);
		Secretary s1 = new Secretary("Mariq", 2300, "Chinese");
		Manager m1 = new Manager("Asen", 3000, 360);

		System.out.println(e1.toString());
		System.out.println(s1.toString());
		System.out.println(m1.toString());
		
	}

}
