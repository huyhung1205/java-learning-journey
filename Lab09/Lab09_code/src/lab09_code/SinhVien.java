package lab09_code;

import java.util.Scanner;

public class SinhVien {
	String maSv, hoTen;
	double diem;
	int age;

	public String getMaSv() {
		return maSv;
	}

	public void setMaSv(String maSv) {
		this.maSv = maSv;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public SinhVien(String maSv, String hoTen, double diem, int age) {
		this.maSv = maSv;
		this.hoTen = hoTen;
		this.diem = diem;
		this.age = age;
	}

	public SinhVien() {
	}

	public void display() {
		System.out.println("SinhVien [maSv=" + maSv + ", hoTen=" + hoTen + ", diem=" + diem + ", age=" + age + "]");
	}

	private void checkDiem(double diem) throws Exception {
		if (diem < 0 || diem > 10)
			throw new Exception("Điểm không hợp lệ!!!");
	}

	private void checkAge(int age) throws Exception {
		if (age < 18 || age > 100)
			throw new Exception("Tuổi không hợp lệ!!!");
	}

	public void input() {
		try (Scanner s = new Scanner(System.in)) {
			System.out.print("Nhập mã số sinh viên: ");
			maSv = s.nextLine();

			System.out.print("Nhập họ tên sinh viên: ");
			hoTen = s.nextLine();

			while (true) {
				System.out.print("Nhập điểm sinh viên: ");
				try {
					diem = s.nextInt();
					checkDiem(diem);
					break;
				} catch (java.util.InputMismatchException e) {
					System.out.println("Hãy nhập số!");
					s.nextLine();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}

			while (true) {
				System.out.print("Nhập tuổi sinh viên: ");
				try {
					age = s.nextInt();
					checkAge(age);
					break;
				} catch (java.util.InputMismatchException e) {
					System.out.println("Hãy nhập số!");
					s.nextLine();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		} catch (Exception e) {
		}
	}
}
