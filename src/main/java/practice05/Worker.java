package practice05;

import practice03.Person;

public class Worker extends Person {

	public Worker(String name, int age) {
		super(name, age);
		// TODO 自动生成的构造函数存根
	}
	
	@Override
	public String introduce() {
		// TODO 自动生成的方法存根
		return this.introduce()+"I am a Worker. I have a job.";
		//return super.introduce();
	}
	
}