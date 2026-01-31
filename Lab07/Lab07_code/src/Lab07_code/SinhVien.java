package Lab07_code;

public class SinhVien {
	protected String id, name;
	protected double price, tax;

	public SinhVien(String id, String name, double price, double tax) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public SinhVien() {
	}

	public double getPriceTax() {
		return this.price * this.tax;
	}

	public void inFor() {
		IO.print("This is class Super");
	}

}
