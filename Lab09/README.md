# Chương 9:
## 1. Try...catch
### 1.1 Exception là gì?
- Chương trình khi được chạy gồm 2 bước:
    + 1 là compile (từ code java -> byte code ). nếu có lỗi (compile-time error), thì chương trình báo ngay, chương trình sẽ không được chạy.
    + 2 là runtime (chạy chương trình). nếu có lỗi (runtime exception), thì chương trình sẽ bị dừng lại, và lỗi sẽ được gọi là exception (ngoại lệ).
--> Ngoại lệ là lỗi xảy ra trong quá trình chạy chương trình, và nó sẽ làm chương trình bị dừng lại.
- [Phân loại exception](https://www.geeksforgeeks.org/java/exceptions-in-java/)
    - Checked Exception: Bắt buộc phải xử lý (ví dụ: IOException, SQLException). Nếu không dùng try...catch hoặc throws, chương trình không compile được.
    - Unchecked Exception: Không bắt buộc phải xử lý (ví dụ: NullPointerException, ArithmeticException). Thường là lỗi logic.
    - Error: Lỗi nghiêm trọng mà chương trình không thể phục hồi (ví dụ: OutOfMemoryError).
    
### 1.2 Try...catch ?
- Cú pháp:
```java
try {
    // code có thể gây ra exception
} catch (ExceptionType e) {
    // code xử lý khi exception xảy ra
}
```

## 2. Keyword finally
- Dùng để viết đoạn code luôn luôn chạy, dù có exception hay không.
- Thường dùng để đóng file, kết nối database, giải phóng tài nguyên.

```java
try {
    // code có thể gây ra exception
} catch (ExceptionType e) {
    // code xử lý khi exception xảy ra
} finally {
    // code luôn luôn chạy
}
```

## 3. Keyword throw và throws
- throw: Dùng để ném một exception cụ thể.
```java
throw new ExceptionType("Message");
```

- throws: Khai báo phương thức có thể ném exception, để caller biết và xử lý.
```java
// Khai báo phương thức có thể ném bất kỳ exception nào
public void method() throws Exception {
    // code có thể ném exception
    throw new Exception("Có lỗi xảy ra!!");
}
// Khai báo phương thức có thể ném một loại exception cụ thể
public void method() throws ExceptionType {
    // code có thể ném exception
    throw new ExceptionType("Có lỗi xảy ra!!");
}
```

- Lấy nội dung exception:
```java
try {
    // code có thể gây ra exception
} catch (Exception e) {
    // lấy nội dung lỗi exception
    System.out.println(e.getMessage());

    // Lấy nội dung lỗi exception gồm cả tên exception
    System.out.println(e.toString());

    // Lấy stack trace (dòng lỗi siêu chi tiết)
    e.printStackTrace();
}
```

## 4. Bài tập Lab 09
Tạo class SinhVien bao gồm:
masv: String
hoten: String
diem: double
age: int
- Viết setter, getter, constructor, toString
- Nhập dữ liệu sinh viên từ bàn phím và in ra màn hình (với hàm toString)
- Xử lý ngoại lệ cho các trường hợp
+ 0< điểm < 10. điểm là số thực
+ 18 < age < 100. tuổi là số nguyên
=> nếu có ngoại lệ thì thông báo lỗi và yêu cầu nhập lại