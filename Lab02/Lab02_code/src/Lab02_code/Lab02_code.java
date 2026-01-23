package Lab02_code;

import java.util.Scanner;

public class Lab02_code {

//	Cho phương trình ax + b = 0. Viết chương trình nhập vào 2 số nguyên a và b. Tính toán nghiệm của phương trình
	public void Bai1(Scanner s) {
		System.out.println("Phương trình ax + b = 0");
		System.out.print("Nhập a: ");
		double a = s.nextDouble();
		System.out.print("Nhập b: ");
		double b = s.nextDouble();
		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm!");
		} else if (a == 0) {
			System.out.println("Phương trình vô nghiệm!");
		} else {
			double x = (-b / a) == 0 ? 0 : (-b / a);
			System.out.println("Phương trình có nghiệm x = " + x);
		}
	}

//	Viết chương trình nhập vào 1 số nguyên từ bàn phím. Kiểm tra số nguyên đó là chẵn hay lẻ và in ra kết quả.
	public void Bai2(Scanner s) {
		System.out.print("Kiểm tra chẵn lẻ\n");
		System.out.print("Nhập số nguyên: ");
		int a = s.nextInt();
		System.out.printf("Số %d là số %s.", a, (a % 2 == 0) ? "chẵn" : "lẻ");
	}

//	Viết chương trình nhập vào 1 số nguyên từ bàn phím. Kiểm tra số nguyên đó là dương, âm hay bằng 0 và in ra kết quả.
	public void Bai3(Scanner s) {
		System.out.print("Nhập số nguyên: ");
		int a = s.nextInt();
		if (a == 0) {
			System.out.println("Số vừa nhập là số 0.");
		} else {
			System.out.printf("Số vừa nhập là số %s.", a > 0 ? "dương" : "âm");
		}
	}

//	Viết chương trình tính số tiền điện (in kết quả ra console)
//	  - Nếu số điện sử dụng từ 0 tới 100, giá mỗi số điện là 1000đ/1 số.
//	  - Từ số điện 101 (tức là > 100), giá mỗi số điện là 1500đ/1 số.
	public void Bai4(Scanner s) {
		System.out.print("Nhập số điện: ");
		int a = s.nextInt();
		double var = 0;
		if (a <= 100) {
			var = a * 1000;
		} else {
			var = 100 * 1000 + (a - 100) * 1500;
		}
		System.out.printf("Tiền điện = %.0f VND", var);

	}

//	Viết chương trình nhập vào 1 số nguyên từ bàn phím (1-7). In ra ngày tương ứng trong tuần (1 - Chủ nhật, 2 - Thứ 2, ..., 7 - Thứ 7). Sử dụng câu lệnh switch-case.
	public void Bai5(Scanner s) {
		System.out.print("Nhập số nguyên: ");
		int day = s.nextInt();
		switch (day) {
		case 1:
			System.out.print("Hôm nay là Chủ nhật.");
			break;
		case 2:
			System.out.print("Hôm nay là Thứ hai.");
			break;
		case 3:
			System.out.print("Hôm nay là Thứ ba.");
			break;
		case 4:
			System.out.print("Hôm nay là Thứ tư.");
			break;
		case 5:
			System.out.print("Hôm nay là Thứ năm.");
			break;
		case 6:
			System.out.print("Hôm nay là Thứ sáu.");
			break;
		case 7:
			System.out.print("Hôm nay là Thứ bảy.");
			break;
		default:
			System.out.print("Định dạng không hợp lệ!");
			break;
		}
	}

	public void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		Bai1(sc);
//		Bai2(sc);
//		Bai3(sc);
//		Bai4(sc);
		Bai5(sc);

		sc.close();
	}
}
