package practice07;

public class Teacher extends Person {
    
	private Klass klass;
	
	public Teacher(String name, int age, Klass klass) {
		super(name, age);
		this.klass = klass;
	}

	public Teacher(String name, int age){
		super(name, age);
		// TODO 自动生成的构造函数存根
	}

	public Klass getKlass() {
		return klass;
	}

	public void setKlass(Klass klass) {
		this.klass = klass;
	}

	@Override
	public String introduce() {
		// TODO 自动生成的方法存根
		//return super.introduce();
		if(this.getClass()==null){
			return this.introduce()+" I am a Teacher. I teach No Class.";
		}else{   
			return this.introduce()+" I am a Teacher. I teach Class."+this.getKlass();
		}
	}
	
	public String introduceWith(Student student)
	{
		if(student.getKlass().equals(this.getKlass()))
		{
			return this.introduce()+" I am a Teacher. I teach "+student;
		}else{
			return this.introduce()+" I am a Teacher. I don't teach "+student;
		}
	}
	
	
	
}
