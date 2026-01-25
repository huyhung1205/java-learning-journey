package Lab05_code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// Khởi tạo danh sách
		ArrayList<String> list = new ArrayList<>();

		// Nhập danh sách tên sinh viên
		while (true) {
			System.out.print("Nhập tên sinh viên: ");
			list.add(s.nextLine());
			System.out.print("Tiếp tục nhập(y/n)?");
			String c = s.nextLine().toLowerCase();
			if (c.equals("n"))
				break;
		}

		// Danh sách sinh viên vừa nhập
		System.out.println("Danh sách tên sinh viên vừa nhập: ");
		for (String name : list) {
			System.out.println(name);
		}

		// Sắp xếp danh sách theo thứ tự bảng chữ cái
		Collections.sort(list);

		// Danh sách sinh viên sau sắp xếp
		System.out.println("\nDanh sách sinh viên sau sắp xếp:");
		for (String name : list) {
			System.out.println(name);
		}

		s.close();
	}
}
