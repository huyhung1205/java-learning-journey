package Lab04_code;

public class Bai02 {

	String name;
	double price;
	double tax;

	// Constructor
	public Bai02(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	void xuatThongTin() {
		System.out.println("Tên: " + name);
		System.out.println("Giá: " + price);
		System.out.println("Thuế: " + tax);
		System.out.println("Tiền thuế: " + getTaxPrice());
	}

	double getTaxPrice() {
		return price * tax;
	}

	// Hàm main để test
	public static void main(String[] args) {
		Bai02 p1 = new Bai02("Áo khoác", 200000, 0.1);
		Bai02 p2 = new Bai02("Giày thể thao", 500000, 0.05);

		p1.xuatThongTin();
		p2.xuatThongTin();
	}

}
