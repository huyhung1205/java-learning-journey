package Lab07_code;

public class SinhVienCoKhi extends SinhVien {
	private String skill;

	public SinhVienCoKhi() {
		super();
	}

	public SinhVienCoKhi(String id, String name, double price, double tax, String skill) {
		super(id, name, price, tax);
		this.skill = skill;
	}

	@Override
	public double getPriceTax() {
		return this.price * this.tax;
	}

}
