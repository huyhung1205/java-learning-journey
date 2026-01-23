package mat;

public class math {
	public static void main(String[] args) {
		double a = -5;
		double b = 3;
		System.out.println("Giá trị tuyệt đối của a: " + Math.abs(a));
		System.out.println("a mũ b: " + Math.pow(a, b));
		System.out.println("Căn bậc hai của b: " + Math.sqrt(b));
		System.out.println("Giá trị lớn hơn giữa a và b: " + Math.max(a, b));
		System.out.println("Giá trị nhỏ hơn giữa a và b: " + Math.min(a, b));
	}
}
