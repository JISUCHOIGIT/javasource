package poly2;

import poly.Employee;

public class Parttime extends Employee {
	@Override
	public void work() {
		System.out.println(super.getName()+" "+super.getPosition()+"주어진 시간동안 일한다.");
		super.work();
	}
}
