package Lab03_code;

import java.util.Arrays;
import java.util.Scanner;

public class Lab03_code {
	public boolean isPrime(int a) {
		if (a <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(a); i++)
			if (a % i == 0)
				return false;
		return true;
	}

	public void Bai1(Scanner s) {
		System.out.println("Chương trình kiểm tra số nguyên tố:");
		System.out.print("Nhập số nguyên: ");
		int a = s.nextInt();
		System.out.printf("%d %s là số nguyên tố.", a, isPrime(a) ? "" : "không phải");
	}

	public void Bai2(Scanner s) {
		System.out.println("Bảng cửu chương:");
		System.out.print("Nhập số dương:");
		int a = s.nextInt();
		System.out.println("Bảng cửu chương: " + a);
		for (int i = 1; i <= 10; i++)
			System.out.printf("%2d x %2d = %3d\n", a, i, a * i);
	}

	public void Bai3(Scanner s) {
		System.out.println("Nhập mảng số nguyên:");
		System.out.println("Nhập số lượng phần tử:");
		int n = s.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Nhập giá trị array[%d] = ", i);
			array[i] = s.nextInt();
		}
		Arrays.sort(array);
		System.out.println("Mảng đã sắp xếp: " + Arrays.toString(array));
		System.out.println("Phần tử lớn nhất: " + array[array.length - 1]);
		System.out.println("Phần tử nhỏ nhất: " + array[0]);
	}

	public void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Bai1(sc);
		// Bai2(sc);
		Bai3(sc);

		sc.close();
	}
}
