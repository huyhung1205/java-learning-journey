# Chương 4:
## 1. Lập trình hướng đối tượng OOP là gì?
OOP: Object-Oriented Programming (Lập trình hướng đối tượng) là một mô hình lập trình dựa trên khái niệm "đối tượng" (object), có thể chứa dữ liệu dưới dạng trường (fields, còn gọi là thuộc tính hoặc properties) và mã dưới dạng phương thức (methods).
Đặc điểm chính của OOP bao gồm:
- Tính đóng gói (Encapsulation): Dữ liệu và các phương thức liên quan được đóng gói trong cùng một đối tượng, giúp bảo vệ dữ liệu khỏi truy cập trái phép.
- Tính kế thừa (Inheritance): Cho phép tạo ra các lớp mới dựa trên các lớp đã tồn tại, giúp tái sử dụng mã và mở rộng chức năng.
- Tính đa hình (Polymorphism): Cho phép các đối tượng của các lớp khác nhau có thể được xử lý thông qua cùng một giao diện, giúp tăng tính linh hoạt và mở rộng của mã.
Lợi ích của OOP:
- Clear Structure: Giúp tổ chức mã nguồn một cách rõ ràng và dễ hiểu.
- Reuse application: Tăng khả năng tái sử dụng mã thông qua kế thừa và đóng gói.
- Design larger and complex programs: Giúp quản lý các chương trình lớn và phức tạp một cách hiệu quả hơn.

## 2. Java Classes and Objects
Class: Lớp là một khuôn mẫu (blueprint) để tạo ra các đối tượng (objects). Nó định nghĩa các thuộc tính (attributes) và phương thức (methods) mà các đối tượng của lớp đó sẽ có.
Object: Đối tượng là một thể hiện cụ thể của một lớp. Mỗi đối tượng có trạng thái riêng (giá trị của các thuộc tính) và hành vi riêng (các phương thức mà nó có thể thực hiện).

## 3. Thực hành tạo Class và Object
[Thực hành](./Lab04_code/src/Lab04_code/Student.java).

```java
public class Student {
    // Thuộc tính (Attributes)
    String name;
    int age;

    // Phương thức (Methods)
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
```
```java
public class Main {
    // Phương thức chính để chạy chương trình
    public static void main(String[] args) {
        // Tạo đối tượng (Object)
        Student student1 = new Student();
        student1.name = "Alice";
        student1.age = 20;

        Student student2 = new Student();
        student2.name = "Bob";
        student2.age = 22;

        // Gọi phương thức để hiển thị thông tin
        student1.displayInfo();
        student2.displayInfo();
    }
}
```

## 4. Class Attributes (Thuộc tính của lớp)
- Attributes (thuộc tính) là các biến được khai báo bên trong một lớp và đại diện cho trạng thái hoặc dữ liệu của đối tượng.
- Mỗi đối tượng của lớp sẽ có bản sao riêng của các thuộc tính này.
- Không giới hạn số lượng thuộc tính trong một lớp, và chúng có thể có các kiểu dữ liệu khác nhau (int, String, boolean, v.v.).
- Để truy cập và sửa đổi các thuộc tính, ta có thể sử dụng các phương thức (methods) hoặc trực tiếp thông qua đối tượng (nếu thuộc tính có phạm vi truy cập phù hợp): `objectName.attributeName.`
- Tên thuộc tính là danh từ, có dạng camelCase (ví dụ: `studentName`, `age`, `isEnrolled`).

## 5. Class Methods (Phương thức của lớp)
- Methods (phương thức) là các hàm được định nghĩa bên trong một lớp và đại diện cho hành vi hoặc chức năng của đối tượng.
- Phương thức có thể nhận tham số (parameters) và trả về giá trị (return value) hoặc không.
- Để gọi một phương thức, ta sử dụng cú pháp: `objectName.methodName(arguments);`
- Tên phương thức thường là động từ, có dạng camelCase (ví dụ: `displayInfo()`, `calculateTotal()`, `isEligible()`).
### 5.1 Định nghĩa method thông thường:
```java
returnType methodName(parameterType parameterName) {
    // method body
}
```
Trong đó:
`returnType`: Kiểu dữ liệu mà phương thức trả về (ví dụ: `int`, `String`, `void` nếu không trả về gì).
`methodName`: Tên của phương thức.
`parameterType parameterName`: Danh sách tham số (có thể có nhiều tham số, cách nhau bằng dấu phẩy).
### 5.2 Method Overloading (Nạp chồng phương thức): 
- Cho phép tạo nhiều phương thức cùng tên trong một lớp, nhưng có các danh sách tham số khác nhau (số lượng hoặc kiểu dữ liệu). Điều này giúp tăng tính linh hoạt và khả năng tái sử dụng mã.
```java
int add(int a, int b) {
    return a + b;
}
double add(double a, double b) {
    return a + b;
}

// Phương thức không có tham số
void printMessage() {
    System.out.println("Hello, World!");
}

// Phương thức với tham số
void printMessage(String message) {
    System.out.println(message);
}
```

## 6. Constructor (Định nghĩa hàm tạo)
- Constructor là một phương thức đặc biệt được sử dụng để khởi tạo đối tượng khi nó được tạo ra từ lớp.
- Tên của constructor phải trùng với tên của lớp và không có kiểu trả về (ngay cả `void`).
- Constructor có thể nhận tham số để khởi tạo các thuộc tính của đối tượng.
- Mặc định, nếu không định nghĩa constructor nào, Java sẽ cung cấp một constructor mặc định không tham số.
```java
public class Student {
    String name;
    int age;

    // Constructor có tham số
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor mặc định
    public Student() {
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
```
- Keyword `this` được sử dụng để tham chiếu đến thuộc tính của đối tượng hiện tại, giúp phân biệt giữa tham số và thuộc tính khi chúng có cùng tên.

## 7. Access Modifiers (Phạm vi truy cập)
[Java Modifiers](https://www.w3schools.com/java/java_modifiers.asp)
[Question](https://stackoverflow.com/questions/215497/what-is-the-difference-between-public-protected-package-private-and-private-in)

| Modifier | Description | Class | Package | Subclass | World |
|---------------|--------------------------------------------------------------|-------|----------|-------|-------|
| `public` | Lớp này có thể được truy cập bởi bất kỳ lớp nào khác. | Yes   | Yes | Yes | Yes |
| `protected` | Lớp này có thể được truy cập bởi các lớp trong cùng gói (package) và các lớp con (extends). | Yes   | Yes | Yes | No |
| (default) (no modifier) | Lớp này chỉ có thể được truy cập bởi các lớp trong cùng gói (package). | Yes   | Yes     | No | No |
| `private` | Lớp này chỉ có thể được truy cập bên trong chính lớp đó. | Yes | No | No | No |

`package === folder`
Keyword:
- `import`: Sử dụng để nhập các lớp từ các gói khác. `import java.util.List;`
- `super`: Sử dụng để tham chiếu đến lớp cha của một lớp con. `super.methodName();`, `super.attributeName` hoặc `super();` trong constructor.
- `extends`: Sử dụng để tạo một lớp con từ một lớp cha (kế thừa). `public class Dog extends Animal { }`
    class A extends B: A là subclass (lớp con) của B, B là superclass (lớp cha) của A. A thừa hưởng các thuộc tính và phương thức `public` và `protected` từ B.
    `B b = new A();` // b là reference của B, nhưng object thực tế là của A. b chỉ có thể truy cập các phương thức và thuộc tính của B (trừ khi chúng được ghi đè trong A).
    `B b = new B();` // b là reference và object của B. b có thể truy cập tất cả các phương thức và thuộc tính của B.
    `A a = new A();` // a là reference và object của A. a có thể truy cập tất cả các phương thức và thuộc tính của A, bao gồm cả những thứ kế thừa từ B.

## 8. Encapsulation (Đóng gói)
- Encapsulation là một nguyên tắc của lập trình hướng đối tượng, trong đó dữ liệu (thuộc tính) và các phương thức liên quan được đóng gói bên trong một lớp, giúp bảo vệ dữ liệu khỏi truy cập trái phép từ bên ngoài.
- Thông thường, các thuộc tính của lớp được khai báo là `private` và chỉ có thể truy cập thông qua các phương thức `public` gọi là getter và setter.
```java
public class Student {
    // Thuộc tính private
    private String name;
    private int age;

    // Getter cho thuộc tính name
    public String getName() {
        return name;
    }

    // Setter cho thuộc tính name
    public void setName(String name) {
        this.name = name;
    }

    // Getter cho thuộc tính age
    public int getAge() {
        return age;
    }

    // Setter cho thuộc tính age
    public void setAge(int age) {
        if (age > 0) { // Kiểm tra hợp lệ trước khi gán giá trị
            this.age = age;
        }
    }
}
```

Tip: Sử dụng getter và setter giúp kiểm soát cách dữ liệu được truy cập và sửa đổi, đồng thời cho phép thực hiện các kiểm tra hợp lệ khi cần thiết.
Right-click on view editor -> Source (Alt+Shift+S) -> Generate Getters and Setters...

## 9. Bài tập Lab 04
Mục tiêu:
- Tạo 1 class hoàn chỉnh.
- Biết cách sử dụng Oject (instance từ class đã tạo).

Yêu cầu:
Tạo class Product với các thuộc tính:
```java
    name (String): tên sản phẩm
    price (double): giá sản phẩm
    tax (double): thuế sản phẩm
```
- [Bài 1:](./Lab04_code/src/Lab04_code/Product.java) Tạo class với yêu cầu ở trên, đặt tên là Product.java. Khai báo các thuộc tính: name, price, tax. Tạo thêm 2 method cho class trên:
    - nhapThongTin(): void (dùng để nhập thông tin object)
    - xuatThongTin(): void (in ra thông tin object đã tạo)
    - getTaxPrice(): double
    số tiền thuế = price * tax
- [Bài 2:](./Lab04_code/src/Lab04_code/Bai02.java) Kế thừa bài 1, và bổ sung thêm:
    - Trong hàm main, tạo 2 object Products và in thông tin ra màn hình
    => sử dụng constructor
- [Bài 3:](./Lab04_code/src/Lab04_code/Bai03.java) Kế thừa bài tập 2, bổ sung thêm:
    - getter/setter
    - sử dụng keyword private