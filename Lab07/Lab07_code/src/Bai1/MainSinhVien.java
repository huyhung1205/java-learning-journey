package Bai1;

public class MainSinhVien {
	public static void main(String[] args) {
		SinhVien svck = new SinhVienCoKhi("001", "Nguyen Van Toan", 300, 40, "fly");
		SinhVien svit = new SinhVienCoKhi("002", "Nguyen Van Hai", 34, 400, "code");

		System.out.println("Hoc phi sau thue sinh vien co khi: " + svck.getPriceTax());
		System.out.println("Hoc phi sau thue sinh vien IT: " + svit.getPriceTax());
	}
}
