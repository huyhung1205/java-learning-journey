package Bai2;

public class SinhVienCoKhi extends SinhVien {
	private String skill;

	public SinhVienCoKhi(String id, String name, double price, double tax, String skill) {
		super(id, name, price, tax);
		this.skill = skill;
	}

	@Override
	String getMajor() {
		return "Cơ khí";
	}

	@Override
	public String toString() {
		return "[skill=" + skill + ", id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax + "]";
	}
}
