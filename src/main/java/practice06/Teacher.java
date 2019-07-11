package practice06;

import practice07.Klass;

public class Teacher extends Person {
    private int klass;
    
	public Teacher(String name, int age, Klass klass2) {
		super(name, age);
		// TODO 自动生成的构造函数存根
	}
	public Teacher(String name, int age, int klass) {
		super(name, age);
		this.klass = klass;
	}
	public int getKlass() {
		return klass;
	}
	public void setKlass(int klass) {
		this.klass = klass;
	}
	@Override
	public String introduce() {
		// TODO 自动生成的方法存根
		if(this.getClass()==null){
			return this.introduce()+" I am a Teacher. I teach No Class.";
		}else{
			return this.introduce()+" I am a Teacher. I teach Class."+this.getKlass();
		}
		//return super.introduce();
	}
	
	
}
