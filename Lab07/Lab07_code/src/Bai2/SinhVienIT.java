package Bai2;

public class SinhVienIT extends SinhVien {
	private String language;

	public SinhVienIT(String id, String name, double price, double tax, String language) {
		super(id, name, price, tax);
		this.language = language;
	}

	@Override
	String getMajor() {
		return "Công nghệ thông tin";
	}

	@Override
	public String toString() {
		return "[language=" + language + ", id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax + "]";
	}
}
