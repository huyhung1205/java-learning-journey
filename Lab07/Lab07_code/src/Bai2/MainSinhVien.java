package Bai2;

public class MainSinhVien {
	public static void main(String[] args) {
		SinhVien svck = new SinhVienCoKhi("001", "Nguyen Van Toan", 300, 40, "fly");
		SinhVien svit = new SinhVienIT("002", "Nguyen Van Hai", 34, 400, "code");

		System.out.println("Nganh: " + svck.getMajor() + ", Ten: " + svck.toString());

		System.out.println("Nganh: " + svit.getMajor() + ", Ten: " + svit.toString());
	}
}
