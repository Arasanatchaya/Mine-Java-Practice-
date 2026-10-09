package com.Polymorphism;

class Emp{
	void work() {
		System.out.println("Employee Works");
	}
}
class Developer extends Emp{

	@Override
	void work()
	{
		System.out.println("Developer writes code");
	}
}
class Tester extends Emp{
	@Override
	void work() {
		System.out.println("Tester tests software");
	}
}
class Manager extends Emp{
	
	@Override
	void work()
	{
		System.out.println("Manager manages the team");
	}
}

public class Employee {
	public static void main(String[] args) {
		Emp e=new Emp();
		e.work();
		Developer d=new Developer();
		d.work();
		Tester t=new Tester();
		t.work();
		Manager m=new Manager();
		m.work();
	}

}
