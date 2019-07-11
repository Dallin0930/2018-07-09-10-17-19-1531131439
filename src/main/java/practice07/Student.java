package practice07;

public class Student extends Person{

	public Student(String name, int age) {
		super(name, age);
		// TODO 自动生成的构造函数存根
	}
	
	 private Klass klass;

	public Klass getKlass() {
		return klass;
	}

	public void setKlass(Klass klass) {
		this.klass = klass;
	}

	public Student(String name, int age, Klass klass) {
		super(name, age);
		this.klass = klass;
	}

	@Override
	public String introduce() {
		// TODO 自动生成的方法存根
		//return super.introduce();
		return this.introduce()+"I am at Class "+this.getKlass()+".";
	}
	 
	
	 
	
}
