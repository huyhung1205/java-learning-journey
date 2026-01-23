# Chương 1:

## 1. Java là gì?
- Khái niệm: Java là ngôn ngữ lập trình hướng đối tượng, đa nền tảng, được sử dụng rộng rãi trong phát triển ứng dụng web, di động và doanh nghiệp.
- Đặc điểm:
    - Hướng đối tượng (OOP)
    - Chạy trên mọi nền tảng
    - Bảo mật cao
    - Đa luồng...

## 2. Cài đặt môi trường Java
### 2.1 Cài đặt JDK
[(java development kit)](https://www.oracle.com/java/technologies/downloads/archive/)

Kiểm tra version:
```bash
java -version
javac -version
```

### 2.2 Cài đặt IDE
Spring tool suite:

[(sts)](https://spring.io/tools)

Bước 1: Download files
Bước 2: giải nén file .jar
Bước 3: giải nén file contents.zip
Bước 4: Run file sts-4.20.0.RELEASE/SpringToolSuite4.exe

## 3. Hello World trong Java
Yêu cầu:
- Đã cài đặt JDK và IDE
```bash
java -version
javac -version
```
- Đã cài đặt Spring tool suite

Các bước thực hiện:
- Bước 1: Tạo project mới
File -> New -> Java Project
- Bước 2: 
    - Đặt tên project: HelloWorld
    - Sửu dụng JRE: javaSE-17
    - Mặc định, project java được tạo sẵn, bao gồm:
        - JRE System Library: các thư viện viest sẵn của java khi cài đặt java
        - src: thư mục chứa code nguồn của project
    - Ấn Finish
- Bước 3: 
    - Tạo file: src -> New -> Class
    - Đặt tên class: HelloWorld
    - Default -> finish
- Bước 4: Viết code
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
- Bước 5: Chạy chương trình
Cách 1: Nhấn chuột phải vào file HelloWorld.java -> Run As -> Java Application
Cách 2: Chạy từ terminal: Tương tự như chạy file python

## 4. Setup Spring Tool Suite
- Auto-format code: [Stack Overflow](https://stackoverflow.com/a/234625)
- Format code: Ctrl + Shift + F
- Font size: Ctrl + / Ctrl -
- Chạy: Ctrl + F11

## 5. Variables (Khái niệm biến)
## 5.1 Quy tắc khai báo biến
`<type> <variable_name> = <initial_value>;`
- type: kiểu dữ liệu của biến (int, float, double, char, String, boolean, ...)
- variable_name: tên biến, tuân theo quy tắc đặt tên biến trong Java
- initial_value: giá trị khởi tạo cho biến (có thể bỏ qua)
## 5.2 Quý tắc đặt tên biến
- Bắt đầu bằng chữ cái (a-z, A-Z), dấu gạch dưới (_) hoặc dấu đô la ($)
- Không được bắt đầu bằng chữ số (0-9)
- Không được sử dụng từ khóa (keywords) của Java
- Sử dụng kiểu chữ camelCase cho tên biến nhiều từ (ví dụ: myVariableName)
- Không chứa khoảng trắng hoặc ký tự đặc biệt (trừ _ và $)
- Phân biệt chữ hoa và chữ thường (case-sensitive)
## 5.2 Ví dụ khai báo biến
```java 
int age = 25;
float height = 5.9f;
```

## 5.3 Các toán tử thường gặp
- `+`: Phép cộng, ví dụ: `int a = 6 + 4;`
- `-`: Phép trừ, ví dụ: `int b = 6 - 4;`
- `*`: Phép nhân, ví dụ: `int c = 6 * 4;`
- `/`: Phép chia, ví dụ: `int d = 6 / 4;`

Toán tử dùng để thực hiện phép tính số học thực hiện theo quy tắc ưu tiên:
1. Phép nhân (*) và phép chia (/)
2. Phép cộng (+) và phép trừ (-).
3. Từ trái sang phải.

## 6. Các hàm xuất ra màn hình
## 6.1 In ra màn hình Console
- `System.out.print();` : In nội dung bên trong dấu ngoặc mà không xuống dòng.
- `System.out.println();` : In nội dung bên trong dấu ngoặc và xuống dòng.
- `System.out.printf();` : In nội dung theo định dạng cụ thể:
    - %d: số nguyên
    - %f: số thực
    - %.3f: số thực với 3 chữ số thập phân
    - %s: chuỗi ký tự
    - Mặc định là 6 chữ số thập phân

Ví dụ:
```java
float weight = 25.564238;
System.out.println("Cân nặng là: " + weight);
System.out.printf("Cân nặng là: %.3f\n", weight);
```

## 6.2 Nhập từ bàn phím
Sử dụng lớp Scanner từ thư viện java.util để nhập dữ liệu từ bàn phím.
- Bước 1: Tạo đối tượng Scanner
```java
Scanner scanner = new Scanner(System.in);
```
- Bước 2: Sử dụng các phương thức của Scanner để đọc dữ liệu
    - `nextInt()`: Đọc số nguyên -> int
    - `nextFloat()`: Đọc số thực kiểu float -> float
    - `nextLine()`: Đọc chuỗi ký tự -> String
    - `nextDouble()`: Đọc số thực kiểu double -> double
    - `scanner.close()` : Đóng đối tượng Scanner sau khi sử dụng để giải phóng tài nguyên.

Ví dụ:
```java
import java.util.Scanner;
public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();

        System.out.print("Nhập tuổi của bạn: ");
        int age = scanner.nextInt();

        System.out.printf("Chào %s, bạn %d tuổi.\n", name, age);
    }
}
```

## 7. Các hàm toán học

[https://www.w3schools.com/java/java_ref_math.asp](https://www.w3schools.com/java/java_math.asp)

[https://www.w3schools.com/java/java_ref_math.asp](https://www.w3schools.com/java/java_ref_math.asp)

Sử dụng lớp Math từ thư viện java.lang để thực hiện các phép toán học phổ biến:
- `Math.abs(x)`: Trả về giá trị tuyệt đối của x.
- `Math.pow(x, y)`: Trả về x mũ y (x^y).
- `Math.sqrt(x)`: Trả về căn bậc hai của x.
- `Math.max(x, y)`: Trả về giá trị lớn hơn giữa x và y.
- `Math.min(x, y)`: Trả về giá trị nhỏ hơn giữa x và y.
Ví dụ:
```java
int a = -5;
int b = 3;
System.out.println("Giá trị tuyệt đối của a: " + Math.abs(a));
System.out.println("a mũ b: " + Math.pow(a, b));
System.out.println("Căn bậc hai của b: " + Math.sqrt(b));
System.out.println("Giá trị lớn hơn giữa a và b: " + Math.max(a, b));
System.out.println("Giá trị nhỏ hơn giữa a và b: " + Math.min(a, b));
```

## 8. Bài tập Lab 01
Mục tiêu:
- Biết cách tạo 1 project Java trong Spring Tool Suite
- Đọc dữ liệu từ bàn phím
- In dữ liệu ra console

Bài tập:
- Viết chương trình cho phép nhập tên sinh viên, tuổi và điểm trung bình từ bàn phím. In ra màn hình thông tin sinh viên đã nhập theo định dạng:
```bash
Sinh viên: [Tên], Tuổi: [Tuổi], Điểm trung bình: [Điểm trung bình]
```
- Viết chương trình tính diện tích và chu vi hình chữ nhật. Yêu cầu nhập chiều dài và chiều rộng từ bàn phím, sau đó in ra diện tích và chu vi của hình chữ nhật. Gợi ý công thức:
```bash
Diện tích = Chiều dài * Chiều rộng
Chu vi = 2 * (Chiều dài + Chiều rộng)
```