package Bai2;

abstract class SinhVien {
	protected String id, name;
	protected double price, tax;

	public SinhVien(String id, String name, double price, double tax) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public double getPriceTax() {
		return price * tax;
	}

	abstract String getMajor();
}
