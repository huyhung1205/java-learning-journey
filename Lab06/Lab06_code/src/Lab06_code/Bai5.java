package Lab06_code;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pattern p = Pattern.compile("\\bN\\w*");
		while (true) {
			System.out.print("Nhập đoạn văn bản của bạn: ");
			Matcher m = p.matcher(sc.nextLine());
			int i = 0;
			while (m.find())
				i++;
			if (i == 0)
				System.out.println("không tìm thấy!");
			else
				System.out.printf("Có %d trong đoạn văn!\n", i);
		}
	}
}
