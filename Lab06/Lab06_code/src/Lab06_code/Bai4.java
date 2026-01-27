package Lab06_code;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pattern p = Pattern.compile("^0\\d{9}");
		while (true) {
			System.out.print("Nhập số điện thoại của bạn: ");
			String emailString = sc.nextLine();
			if (p.matcher(emailString).matches())
				System.out.println("Số điện thoại hợp lệ!");
			else
				System.out.println("Số điện thoại không hợp lệ!");
			sc.close();
		}
	}
}
