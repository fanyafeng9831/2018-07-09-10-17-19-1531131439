package practice02;

public class Student extends Person{
	
	private int classNum;

	public Student(String name, int age, int classNum) {
		super(name, age);
		this.classNum = classNum;
	}



	public int getClassNum() {
		return classNum;
	}



	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}



	@Override
	public String introduce() {
		return String.format("I am a Student. I am at Class %d.", this.getClassNum());
	}
}
