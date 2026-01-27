package Lab06_code;

import java.util.ArrayList;

public class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		ArrayList<Student> s = new ArrayList<>();
		Student s1 = new Student(0, "Nguyễn Văn A");
		Student s2 = new Student(1, "Nguyễn Văn B");
		Student s3 = new Student(2, "Trần Văn Lữ");
		Student s4 = new Student(3, "Trần Văn Mạnh");
		Student s5 = new Student(4, "Nguyễn Quỳnh Trâm");
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);

		for (Student i : s)
			if (i.name.contains("Nguyễn"))
				System.out.println(i.name);
	}
}
