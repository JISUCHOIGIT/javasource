package poly2;

import poly.Employee;

public class Ceo extends Employee {
	@Override
	public void work() {
		System.out.println(super.getName()+" "+super.getPosition()+"가 일한다.");
		super.work();
	}
}
