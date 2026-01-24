package Lab04_code;

import java.util.Scanner;

public class Product {
	String name;
	double price;
	double tax;

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tên sản phẩm: ");
		this.name = sc.nextLine();

		System.out.print("Nhập giá sản phẩm: ");
		this.price = sc.nextDouble();

		System.out.print("Nhập thuế sản phẩm: ");
		this.tax = sc.nextDouble();

		sc.close();
	}

	public void xuatThongTin() {
		System.out.println("Tên sản phẩm: " + this.name);
		System.out.println("Giá sản phẩm: " + this.price);
		System.out.println("Thuế sản phẩm: " + this.tax);
		System.out.println("Số tiền thuế: " + getTaxPrice());
	}

	public double getTaxPrice() {
		return this.price * this.tax;
	}
}
