package poly2;

import poly.Employee;

public class Adminstrator extends Employee {
	@Override
	public void work() {
		System.out.println(super.getName()+" "+super.getPosition()+"가 열심히 일을 일한다.");
	}
}
