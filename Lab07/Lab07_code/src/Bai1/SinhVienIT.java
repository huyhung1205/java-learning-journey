package Bai1;

public class SinhVienIT extends SinhVien {
	private String language;

	public SinhVienIT(String id, String name, double price, double tax, String language) {
		super(id, name, price, tax);
		this.language = language;
	}

}
