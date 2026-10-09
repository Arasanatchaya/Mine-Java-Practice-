package com.Encapsulation;

public class Student {

	private String name;
	private int age;
	private int mark;
	
	//Name
	public  String getName()
	{
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	//Age
	public int getAge() {
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark)
	{
		if(mark>=0 && mark<=100)
		{
			this.mark=mark;
		}
		else {
			System.out.println("Invalid Mark");
		}
		
	}
	
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setName("Atchaya");
		System.out.println(s1.getName());
		s1.setAge(21);
		System.out.println(s1.getAge());
		s1.setMark(-1);
		System.out.println(s1.getMark());
	}
	
}
