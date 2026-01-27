package Lab06_code;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Bai6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pattern p = Pattern.compile(",");
		System.out.print("Nhập đoạn văn bản của bạn: ");
		String replaced = sc.nextLine().replaceAll("\\s+", "-");
		System.out.println(replaced);
		sc.close();
	}

}
