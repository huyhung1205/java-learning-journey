package Lab07_code;

public class SinhVienIT extends SinhVien {
	private String language;

	public SinhVienIT() {
		super();
	}

	public SinhVienIT(String id, String name, double price, double tax, String language) {
		super(id, name, price, tax);
		this.language = language;
	}

	@Override
	public double getPriceTax() {
		return this.price * this.tax;
	}

	public void hello() {
		IO.print("hello");
	}
}
