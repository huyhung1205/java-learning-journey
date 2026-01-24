package Lab04_code;

public class Bai03 {
	private String name;
	private double price;
	private double tax;

	// Constructor
	public Bai03(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	// Getter & Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	// Method
	public double getTaxPrice() {
		return price * tax;
	}

	public void xuatThongTin() {
		System.out.println("Tên: " + name);
		System.out.println("Giá: " + price);
		System.out.println("Thuế: " + tax);
		System.out.println("Tiền thuế: " + getTaxPrice());
	}

	// Main
	public static void main(String[] args) {
		Bai03 p1 = new Bai03("Laptop", 15000000, 0.1);
		Bai03 p2 = new Bai03("Điện thoại", 8000000, 0.08);

		p1.xuatThongTin();
		p2.xuatThongTin();

		// Dùng setter để đổi giá
		p1.setPrice(16000000);
		System.out.println("Sau khi đổi giá:");
		p1.xuatThongTin();
	}

}
