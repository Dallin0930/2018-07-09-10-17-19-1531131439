package practice07;

public class Klass {
	private int number;

	public Klass(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Object getDisplayName() {
		// TODO 自动生成的方法存根
		return "Class"+this.getNumber();
	}
	
	
	
}
