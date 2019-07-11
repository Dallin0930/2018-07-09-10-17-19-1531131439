package practice03;

public class Student extends Person{
    private int klass;

	
	public Student(String name, int age, int klass) {
		super(name, klass);
		this.klass = klass;
	}

	public int getKlass() {
		return klass;
	}

	public void setKlass(int klass) {
		this.klass = klass;
	}


	public Student(String name, int age) {
		super(name, age);
		// TODO 自动生成的构造函数存根
	}
	
	

	public String introduce() { 
		return "I am a Student. I am at Class "+this.getKlass()+".";
		//return super.introduce();
	}
}
