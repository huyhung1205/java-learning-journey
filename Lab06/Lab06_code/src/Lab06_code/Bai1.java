package Lab06_code;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Nhập username: ");
		String userName = s.nextLine();

		System.out.print("Nhập password: ");
		String passWord = s.nextLine();

		if (userName.equals("admin") && passWord.equals("12345"))
			System.out.println("Đăng nhập thành công.");
		else
			System.out.println("Đăng nhập không thành công.");

		s.close();
	}
}
