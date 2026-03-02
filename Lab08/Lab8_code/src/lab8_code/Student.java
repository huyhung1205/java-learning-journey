package lab8_code;

import java.util.Scanner;

public class Student extends Person {
	Scanner sc = new Scanner(System.in);
	private int mark;
	private String grade;

	public Student(String id, String name, int age, int mark) {
		super(id, name, age);
		this.mark = mark;
	}

	public Student() {
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade() {
		if (mark >= 8)
			this.grade = "A";
		else if (mark >= 7)
			this.grade = "B";
		else if (mark >= 6)
			this.grade = "C";
		else if (mark >= 5)
			this.grade = "D";
		else
			this.grade = "Tach cmnr";
	}

	@Override
	public void input() {
		super.input();
		System.out.print("Nhap mark: ");
		this.mark = sc.nextInt();
	}

	@Override
	public void display() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Student: [" + super.toString() + ", mark=" + mark + ", grade=" + grade + "]";
	}
}
