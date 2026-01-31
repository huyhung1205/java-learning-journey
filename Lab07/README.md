# Chương 7:

## 1. Inheritance (Kế thừa)
- **subclass** (child): lớp kế thừa từ một lớp khác
- **superclass** (parent): lớp được kế thừa từ
Để kế thừa từ một lớp, hãy sử dụng `extends` từ khóa `recipient`.
- Cú pháp:
```java
Subclass extends SuperClass
```
- Nguyên tắc kế thừa:
  - Một lớp chỉ có thể kế thừa duy nhất một lớp cha - đơn kế thừa (single inheritance).
  - Một lớp con kế thừa tất cả các thuộc tính và phương thức của lớp cha (ngoại trừ các thành phần `private`).
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
## 4. Polymorphism (Đa hình)
## 5. Bài tập Lab 07