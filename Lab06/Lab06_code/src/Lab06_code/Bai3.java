package Lab06_code;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pattern p = Pattern.compile(".+@gmail.com$");
		while (true) {
			System.out.print("Nhập email của bạn: ");
			String emailString = sc.nextLine();
			if (p.matcher(emailString).matches())
				System.out.println("Email hợp lệ!");
			else
				System.out.println("Email không hợp lệ!");
			sc.close();
		}
	}
}
