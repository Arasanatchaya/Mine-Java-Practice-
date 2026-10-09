package com.constructoe;

public class stu {
	String name;
	int age;
	String course;
	
	stu(String name,int age,String course){
		this.name=name;
		this.age=age;
		this.course=course;
	}
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Course: "+course);
	}
	public static void main(String[] args) {
		
		stu s1=new stu("Atchaya",21,"BCA");
		stu s2=new stu("Mugil",13,"10th");
		stu s3=new stu("Bhavan",23,"MCA");
		s1.display();
		s2.display();
		s3.display();
	}

}
