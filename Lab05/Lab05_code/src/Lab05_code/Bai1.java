package Lab05_code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Tạo danh sách số thực
		ArrayList<Double> list = new ArrayList<>();

		// Nhập danh sách các số thực
		while (true) {
			System.out.print("Nhập giá trị: ");
			double a = sc.nextDouble();
			list.add(a);
			sc.nextLine();
			System.out.print("Tiếp tục nhập(y/n)?");
			String c = sc.nextLine().toLowerCase();
			if (c.equals("n"))
				break;
		}

		// Xuất danh sách ra màn hình
		System.out.print("Danh sách các số thực vừa nhập:\n");
		for (double i : list) {
			System.out.print(i + " ");
		}
		System.out.println();

		// Giá trị lớn nhất
		System.out.println("Giá trị lớn nhất trong danh sách: " + Collections.max(list));

		// Giá trị nhỏ nhất
		System.out.println("Giá trị nhỏ nhất trong danh sách: " + Collections.min(list));

		sc.close();
	}
}
