# Chương 7:

## 1. Inheritance (Kế thừa)
- **subclass** (child): lớp kế thừa từ một lớp khác
- **superclass** (parent): lớp được kế thừa từ
Để kế thừa từ một lớp, hãy sử dụng từ khóa `extends`.
- Cú pháp:
```java
class Subclass extends SuperClass {
}
```
- Nguyên tắc kế thừa:
  - Một lớp chỉ có thể kế thừa duy nhất một lớp cha - đơn kế thừa (single inheritance).
  - Lớp con không trực tiếp truy cập được các thành phần `private` của lớp cha.
  - Lớp con có thể thêm các thuộc tính và phương thức riêng của nó.
  - Lớp con có thể ghi đè (override) các phương thức của lớp cha để cung cấp triển khai cụ thể hơn.
- Keywords:
  - `extends`: để khai báo kế thừa từ một lớp cha.
  - `super`: để tham chiếu đến lớp cha (sử dụng trong constructor hoặc truy cập phương thức, thuộc tính của lớp cha). Sử dụng `super()` khi muốn gọi hàm tạo của lớp cha. Lưu ý: Lệnh gọi `super()`phải là câu lệnh đầu tiên trong hàm tạo của lớp con. Có thể truyền tham số cho `super()` nếu hàm tạo của lớp cha yêu cầu.
  - `this`: để tham chiếu đến đối tượng hiện tại của lớp con. 
  - `final`: để ngăn chặn việc kế thừa hoặc ghi đè phương thức. Sử dụng `final` trước khai báo lớp hoặc phương thức.
  - `private`, `protected`, `public`: xác định phạm vi truy cập của các thành phần trong lớp cha.
    - `private`: chỉ có thể truy cập trong lớp cha.
    - `protected`: có thể truy cập trong cùng gói hoặc từ lớp con.
    - `public`: có thể truy cập từ bất kỳ đâu.
  - `@Override`: chú thích để chỉ ra rằng một phương thức đang được ghi đè từ lớp cha.
  - Method Overriding: lớp con có thể cung cấp triển khai cụ thể cho phương thức đã được định nghĩa trong lớp cha bằng cách sử dụng cùng tên, kiểu trả về và tham số.
  ```java
    @Override
    public void methodName() {
        // implementation
    }
  ```
  - Method Overloading: trong cùng một lớp, có thể định nghĩa nhiều phương thức cùng tên nhưng khác tham số (số lượng hoặc kiểu dữ liệu).
  ```java
    public void methodName(int a) {
        // implementation
    }

    public void methodName(String b) {
        // implementation
    }
  ```

## 2. Super keyword
Bài toán: Tạo class:
  SinhVienIT:
    - id //mã số sinh viên
    - name //tên
    - language //ngôn ngữ lập trình
    - price //học phí
    - tax //tỉ lệ thuế
    Method: getPriceTax = price * tax

  SinhVienCoKhi
  - id //mã số sinh viên
  - name //tên
  - skill //kỹ năng
  - price //học phí
  - tax //tỉ lệ thuế

Yêu cầu:
- Tạo lớp cha [SinhVien](./Lab07_code/src/Lab07_code/SinhVien.java) có các thuộc tính chung id, name, price, tax
- Sử dụng keyword super để truy cập tới thuộc tính và method của cha
- Khởi tạo đối tượng [SinhVienIT](./Lab07_code/src/Lab07_code/SinhVienIT.java) và [SinhVienCoKhi](./Lab07_code/src/Lab07_code/SinhVienCoKhi.java) thông qua constructor của lớp cha.
## 3. Abstraction Class (Basic) - Lớp trừu tượng
[Abstract Methods and Classes](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html) 
- Lớp trừu tượng là lớp không thể khởi tạo đối tượng trực tiếp.
- Lớp trừu tượng có thể chứa phương thức trừu tượng (abstract method) và phương thức thông thường (concrete method).
- Phương thức trừu tượng được khai báo bằng từ khóa `abstract` và không có phần thân.
- Nếu một lớp chứa ít nhất một phương thức trừu tượng thì lớp đó bắt buộc phải được khai báo là lớp trừu tượng.
- Lớp con kế thừa từ lớp trừu tượng phải triển khai `tất cả` các phương thức trừu tượng, hoặc bản thân lớp con cũng phải được khai báo là lớp trừu tượng.
- Lớp trừu tượng có thể có constructor và thuộc tính.
- Phương thức trừu tượng không được khai báo là `private`, `final` hoặc `static`.

Ví dụ:
```java
abstract class ClassName {
    abstract void methodName();

    void anotherMethod() {
        // implementation
    }
}
```

## 4. Polymorphism (Đa hình)
[Polymorphism](https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html)

- Đa hình là khả năng một đối tượng có thể được tham chiếu thông qua nhiều kiểu dữ liệu khác nhau (thường là kiểu lớp cha hoặc interface).
- Trong Java, đa hình được chia thành hai loại:
  - Đa hình thời gian biên dịch (Compile-time polymorphism): đạt được thông qua nạp chồng phương thức (method overloading).
  - Đa hình thời gian chạy (Runtime polymorphism): đạt được thông qua ghi đè phương thức (method overriding) trong kế thừa hoặc cài đặt interface.
- Upcasting và downcasting:
  - Upcasting: chuyển đối tượng từ lớp con sang lớp cha, an toàn và không cần ép kiểu.
  - Downcasting: chuyển từ lớp cha sang lớp con, cần ép kiểu rõ ràng và có thể gây lỗi tại runtime nếu sai kiểu.
- Polymorphism cho phép sử dụng một giao diện hoặc lớp cha chung để xử lý các đối tượng thuộc các lớp khác nhau một cách linh hoạt.

## 5. Bài tập Lab 07

Mục tiêu:
- Hiểu và vận dụng kế thừa (Inheritance)
- Sử dụng đúng keyword super
- Áp dụng lớp trừu tượng (Abstract Class)
- Minh hoạ đa hình (Polymorphism) trong Java

Bài tập:
- Bài 1: 
  - Tạo lớp cha [`SinhVien`](./Lab07_code/src/Bai1/SinhVien.java) gồm:
      Thuộc tính: id, name, price, tax
      Constructor có tham số
      Phương thức: `double getPriceTax();`, getPriceTax = price * tax
  - Tạo lớp con [`SinhVienIT`](./Lab07_code/src/Bai1/SinhVienIT.java):
      Thuộc tính riêng: language
      Sử dụng super để gọi constructor lớp cha
  - Tạo lớp con [`SinhVienCoKhi`](./Lab07_code/src/Bai1/SinhVienCoKhi.java):
      Thuộc tính riêng: skill
      Sử dụng super để gọi constructor lớp cha
  - Viết chương trình [`main`](./Lab07_code/src/Bai1/MainSinhVien.java):
      Khởi tạo đối tượng `SinhVienIT` và `SinhVienCoKhi`
      In ra học phí sau thuế

- Bài 2: Lớp trừu tượng (Abstract Class)
  - Chuyển lớp [`SinhVien`](./Lab07_code/src/Bai2/SinhVien.java) thành lớp trừu tượng
  - Khai báo phương thức trừu tượng trong lớp `SinhVien`: `abstract String getMajor();`
  - Trong lớp [`SinhVienIT`](./Lab07_code/src/Bai2/SinhVienIT.java):
    - Ghi đè (override) phương thức `getMajor()`
    - Trả về chuỗi "Công nghệ thông tin"
  - Trong lớp [`SinhVienCoKhi`](./Lab07_code/src/Bai2/SinhVienCoKhi.java):
    - Ghi đè (override) phương thức `getMajor()`
    - Trả về chuỗi "Cơ khí"
  - Viết chương trình [`main`](./Lab07_code/src/Bai2/MainSinhVien.java):
    - Khởi tạo đối tượng `SinhVienIT` và `SinhVienCoKhi` thông qua kiểu lớp cha `SinhVien`
    - Gọi phương thức `getMajor()` để hiển thị ngành học của từng sinh viên