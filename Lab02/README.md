# Chương 2:

## 1. Java Data Types (Kiểu dữ liệu)
[Các kiểu dữ liệu trong Java](https://www.w3schools.com/java/java_data_types.asp)

### 1.1 Primitive Data Types (Kiểu dữ liệu nguyên thủy):
| Data Type | Size         | Description                          |
|-----------|--------------|--------------------------------------|
| `byte`      | 1 byte       | Stores whole numbers from -128 to 127 |
| `short`     | 2 bytes      | Stores whole numbers from -32,768 to 32,767 |
| `int`       | 4 bytes      | Stores whole numbers from -2,147,483,648 to 2,147,483,647 |
| `long`      | 8 bytes      | Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| `float`     | 4 bytes      | Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits |
| `double`    | 8 bytes      | Stores fractional numbers. Sufficient for storing 15 decimal digits |
| `char`      | 2 bytes      | Stores a single character/letter or ASCII values |
| `boolean`   | 1 bit        | Stores true or false values          |

- Java number [Kiểu số nguyên thủy](https://www.w3schools.com/java/java_data_types_numbers.asp).
    - Integer Types: `byte`, `short`, `int`, `long`.
    Lưu trữ các số nguyên dương hoặc âm (như 123 hoặc -456), không có phần thập phân.
    Ví dụ:
    ```java
    int myNum = 5;
    byte myByte = 100;
    short myShort = 5000;
    long myLong = 15000000000L;
    ```
    - Floating Point Types: `float`, `double`.
    Biểu diễn các số có phần thập phân, chứa một hoặc nhiều chữ số thập phân.
    Ví dụ:
    ```java
    float myFloat = 5.75f; // Lưu ý chữ 'f' ở cuối để chỉ định kiểu float
    double myDouble = 19.99d;
    ```
    Nếu không ký tự `f` hoặc `d` ở cuối biến số, Java sẽ mặc định coi số thập phân là kiểu `double`.
- Boolean types: `boolean`.
    Chỉ có hai giá trị: `true` (đúng) hoặc `false` (sai).
    Ví dụ:
    ```java
    boolean isJavaFun = true;
    boolean isFishTasty = false;
    ```
- Character type: `char`.
    Lưu trữ một ký tự đơn, được đặt trong dấu nháy đơn.
    Ví dụ:
    ```java
    char myGrade = 'A';
    char mySymbol = '$';
    char myNumber = '1';
    char myLetter = 'B';
    char myVar = 65; // Lưu trữ giá trị ASCII của ký tự 'A'
    ```
    [ Bảng tham chiếu ASCII ](https://www.w3schools.com/charsets/ref_html_ascii.asp)

- String (Chuỗi ký tự) không phải là kiểu dữ liệu nguyên thủy mà là một lớp (class) trong Java. Nó được sử dụng để lưu trữ chuỗi ký tự và có nhiều phương thức hữu ích để thao tác với chuỗi.
Ví dụ:
```java
String greeting = "Hello, World!";
```

### 1.2 Non-primitive Data Types (Kiểu dữ liệu tham chiếu):
  - String
  - Arrays
  - Classes

## 2. Java Operators (Toán Tử)
[Java Operators](https://www.w3schools.com/java/java_operators.asp)
### 2.1 Arithmetic Operators (Toán tử số học):
| Toán tử | Tên          | Ví dụ       | Kết quả  |
|----------|---------------|---------------|---------|
| +        | Cộng      | x + y         | Cộng của x và y |
| -        | Trừ   | x - y         | Hiệu của x và y |
| *        | Nhân| x * y         | Tích của x và y |
| /        | Chia      | x / y         | Thương của x và y |
| %        | Phần dư       | x % y         | Phần dư của x chia cho y |
| ++       | Tăng     | ++x or x++    | Tăng giá trị của x lên 1 |
| --       | Giảm     | --x or x--    | Giảm giá trị của x xuống 1 |
### 2.2 Assignment Operators (Toán tử gán):
| Toán tử | Ví dụ   | Tương đương        |
|----------|-----------|----------------|
| =        | x = 5     | x = 5          |
| +=       | x += 3    | x = x + 3      |
| -=       | x -= 3    | x = x - 3      |
| *=       | x *= 3    | x = x * 3      |
| /=       | x /= 3    | x = x / 3      |
| %=       | x %= 3    | x = x % 3      |
### 2.3 Comparison Operators (Toán tử so sánh):
| Toán tử | Tên               | Ví dụ   | Kết quả                  |
|----------|--------------------|-----------|-------------------------|
| ==       | Bằng           | x == y    | Đúng nếu x bằng y |
| !=       | Khác       | x != y    | Đúng nếu x khác y |
| >        | Lớn hơn       | x > y     | Đúng nếu x lớn hơn y |
| <        | Nhỏ hơn          | x < y     | Đúng nếu x nhỏ hơn y |
| >=       | Lớn hơn hoặc bằng | x >= y | Đúng nếu x lớn hơn hoặc bằng y |
| <=       | Nhỏ hơn hoặc bằng    | x <= y | Đúng nếu x nhỏ hơn hoặc bằng y |
### 2.4 Logical Operators (Toán tử logic):
| Toán tử | Tên        | Ví dụ          | Kết quả                                 |
|----------|-------------|------------------|----------------------------------------|
| &&       | AND logic | x < 5 && y < 10 | Đúng nếu cả x < 5 và y < 10 đều đúng |
| \|\|       | OR logic  | x < 5 \|\| y < 10 | Đúng nếu một trong hai x < 5 hoặc y < 10 đúng |
| !        | NOT logic | !(x < 5)        | Đúng nếu x không nhỏ hơn 5          |
### 2.5 Ternary Operator (Toán tử ba ngôi):
Cú pháp: `condition ? value1 : value2;`
Nếu điều kiện đúng, trả về value1; nếu sai, trả về value2.
Ví dụ:
```java
int result = (a > b) ? a : b; // result sẽ nhận giá trị của a nếu a lớn hơn b, ngược lại nhận giá trị của b
```

## 3. Java If...Else
[Java Conditions and If Statements](https://www.w3schools.com/java/java_conditions.asp)
### 3.1 Câu lệnh if
```java
if (điều kiện) {
  // code được thực thi nếu điều kiện đúng
}
```
### 3.2 Câu lệnh if...else
```java
if (điều kiện) {
  // code được thực thi nếu điều kiện đúng
} else {
  // code được thực thi nếu điều kiện sai
}
```
### 3.3 Câu lệnh if...else if...else
```java
if (điều kiện1) {
  // code được thực thi nếu điều kiện1 đúng
} else if (điều kiện2) {
  // code được thực thi nếu điều kiện2 đúng
} else {
  // code được thực thi nếu cả điều kiện1 và điều kiện2 đều sai
}
```

## 4. Java Switch
[Java Switch Statements](https://www.w3schools.com/java/java_switch.asp)
```java
switch (biểu thức) {
    case giá_trị1:
        // code được thực thi nếu biểu thức bằng giá_trị1
        break;
    case giá_trị2:
        // code được thực thi nếu biểu thức bằng giá_trị2
        break;
    ...
    default:
        // code được thực thi nếu biểu thức không khớp với bất kỳ giá_trị nào ở trên
    }
```
`break`: Kết thúc một case trong switch. Nếu không có `break`, chương trình sẽ tiếp tục thực thi các case tiếp theo cho đến khi gặp `break` hoặc kết thúc switch.

## 5. Bài tập Lab 02
Mục tiêu:
- Sử dụng các loại toán tử
- Sử dụng câu điều kiện if/switch

Bài tập:
- [Bài 1](./Lab02_code/src/Lab02_code/Lab02_code.java): Cho phương trình ax + b = 0. Viết chương trình nhập vào 2 số nguyên a và b. Tính toán nghiệm của phương trình
trên và in ra nghiệm.
- [Bài 2](./Lab02_code/src/Lab02_code/Lab02_code.java): Viết chương trình nhập vào 1 số nguyên từ bàn phím. Kiểm tra số nguyên đó là chẵn hay lẻ và in ra kết quả.
- [Bài 3](./Lab02_code/src/Lab02_code/Lab02_code.java): Viết chương trình nhập vào 1 số nguyên từ bàn phím. Kiểm tra số nguyên đó là dương, âm hay bằng 0 và in ra kết quả.
- [Bài 4](./Lab02_code/src/Lab02_code/Lab02_code.java): Viết chương trình tính số tiền điện (in kết quả ra console)
  - Nếu số điện sử dụng từ 0 tới 100, giá mỗi số điện là 1000đ/1 số.
  - Từ số điện 101 (tức là > 100), giá mỗi số điện là 1500đ/1 số.
- [Bài 5](./Lab02_code/src/Lab02_code/Lab02_code.java): Viết chương trình nhập vào 1 số nguyên từ bàn phím (1-7). In ra ngày tương ứng trong tuần (1 - Chủ nhật, 2 - Thứ 2, ..., 7 - Thứ 7). Sử dụng câu lệnh switch-case.