package Input;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập tên của bạn: ");
		String name = scanner.nextLine();

		System.out.print("Nhập tuổi của bạn: ");
		int age = scanner.nextInt();

		System.out.printf("Chào %s, bạn %d tuổi.\n", name, age);
		scanner.close();
	}
}
