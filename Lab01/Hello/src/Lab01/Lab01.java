package Lab01;

import java.util.Scanner;

public class Lab01 {

//	Viết chương trình cho phép nhập tên sinh viên, tuổi và điểm trung bình từ bàn phím.
//	In ra màn hình thông tin sinh viên đã nhập theo định dạng:
//	Sinh viên: [Tên], Tuổi: [Tuổi], Điểm trung bình: [Điểm trung bình]
	public void Bai01(Scanner s) {
		System.out.print("Nhập tên sinh viên: ");
		String name = s.nextLine();
		System.out.print("Nhập tuổi: ");
		int old = s.nextInt();
		System.out.print("Nhập điểm trung bình: ");
		double score = s.nextDouble();
		System.out.print("Sinh viên: " + name);
		System.out.print(", Tuổi: " + old);
		System.out.print(", Điểm trung bình: " + score);
	}

//	Viết chương trình tính diện tích và chu vi hình chữ nhật.
//	Yêu cầu nhập chiều dài và chiều rộng từ bàn phím, sau đó in ra diện tích và chu vi của hình chữ nhật.
//	Gợi ý công thức:
//	Diện tích = Chiều dài * Chiều rộng
//	Chu vi = 2 * (Chiều dài + Chiều rộng)
	public void Bai02(Scanner s) {
		System.out.print("Nhập chiều dài: ");
		double a = s.nextDouble();
		System.out.print("Nhập chiều rộng: ");
		double b = s.nextDouble();
		System.out.println("Diện tích = " + a * b);
		System.out.println("Chu vi = " + 2 * (a + b));
	}

	public void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		Bai01(s);
		Bai02(s);
		s.close();
	}
}
