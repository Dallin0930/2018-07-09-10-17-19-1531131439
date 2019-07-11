package practice02;

import practice07.Klass;

public class Student extends Person{
	
	private Klass klass;

	
	public Student(String name, int age, Klass klass2) {
		super(name, age);
		this.klass = klass2;
	}

	public Klass getKlass() {
		return klass;
	}

	public void setKlass(Klass klass) {
		this.klass = klass;
	}


	public Student(String name, int age) {
		super(name, age);
		// TODO 自动生成的构造函数存根
	}
	
	

	@Override
	public String introduce() { 
		return "I am a Student. I am at Class "+this.getKlass()+".";
		//return super.introduce();
	}
	
	
	
	
	
	
}
