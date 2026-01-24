# Chương 3:
## 1. Java Loops (Vòng lặp)
-  [For Loop](https://www.w3schools.com/java/java_for_loop.asp): Lặp với số lần xác định trước
```java
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
```
statement 1: Khai báo biến vòng lặp
statement 2: Điều kiện dừng vòng lặp
statement 3: Tăng/giảm biến vòng lặp
Ví dụ:
```java
for (int i = 0; i < 5; i++) {
  System.out.println(i);
}
```
statement 1: `int i = 0` (Khai báo biến i bắt đầu từ 0)
statement 2: `i < 5` (Vòng lặp tiếp tục khi i nhỏ hơn 5)
statement 3: `i++` (Tăng i lên 1 sau mỗi lần lặp)

- [While Loop](https://www.w3schools.com/java/java_while_loop.asp): Lặp khi điều kiện đúng
    - Java While Loop: Kiểu vòng lặp kiểm tra điều kiện trước khi thực hiện khối lệnh
    - Do...While Loop: Lặp ít nhất một lần, sau đó kiểm tra điều kiện
```java
while (condition) {
  // code block to be executed
}
```
```java
do {
  // code block to be executed
} while (condition);
```

condition: Điều kiện để tiếp tục vòng lặp
Ví dụ:
```java
int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}
```
```java
int i = 0;
do {
  System.out.println(i);
  i++;
} while (i < 5);
```

- [Break/Continue Statement](https://www.w3schools.com/java/java_break.asp)
    - `break`: Dừng vòng lặp
    - `continue`: Bỏ qua lần lặp hiện tại và chuyển sang lần lặp tiếp theo

## 2. Java Arrays (Mảng)
### [2.1 Java Arrays](https://www.w3schools.com/java/java_arrays.asp)
- Mảng là một cấu trúc dữ liệu dùng để lưu trữ nhiều giá trị cùng kiểu trong một biến duy nhất.

Khai báo mảng:
```java
// Cú pháp khai báo mảng
dataType[] arrayName = new dataType[arraySize];
// Khởi tạo mảng với giá trị ban đầu
dataType[] arrayName = {value1, value2, value3, ...};
// Khởi tạo mảng nulled
dataType[] arrayName = null;
// Khởi tạo mảng rỗng
dataType[] arrayName = new dataType[0];
```
Trong đó:
- `dataType`: Kiểu dữ liệu của các phần tử trong mảng (ví dụ: `int`, `String`, `double`, v.v.)
- `arrayName`: Tên của mảng
- `arraySize`: Kích thước (số lượng phần tử) của mảng

Truy cập phần tử mảng:
- Sử dụng chỉ số (index) để truy cập phần tử trong mảng.
- Chỉ số bắt đầu từ 0.
```java
arrayName[index]
```

[Loop Through an Array:](https://www.w3schools.com/java/java_arrays_loop.asp)
- Sử dụng vòng lặp để duyệt qua các phần tử trong mảng.
- Ví dụ với For Loop:
```java
for (int i = 0; i < arrayName.length; i++) {
  System.out.println(arrayName[i]);
}
```
- Ví dụ với For-Each Loop:
```java
for (dataType element : arrayName) {
  System.out.println(element);
}
```
Trong đó:
- `arrayName.length`: Trả về kích thước của mảng
- `element`: Biến tạm thời để lưu trữ giá trị của phần tử hiện tại trong vòng lặp

### [2.2 Multidimensional Arrays](https://www.w3schools.com/java/java_arrays_multi.asp)
- Mảng đa chiều là mảng chứa các mảng khác bên trong nó.
Khai báo mảng đa chiều:
```java
// Cú pháp khai báo mảng 2 chiều
dataType[][] arrayName = new dataType[rows][columns];
// Khởi tạo mảng 2 chiều với giá trị ban đầu
dataType[][] arrayName = {
  {value1, value2, value3},
  {value4, value5, value6}
};
```
Trong đó:
- `rows`: Số hàng của mảng
- `columns`: Số cột của mảng

Truy cập phần tử mảng đa chiều:
- Sử dụng hai chỉ số (index) để truy cập phần tử trong mảng đa chiều.
```java
arrayName[rowIndex][columnIndex]
```
Trong đó:
- `rowIndex`: Chỉ số hàng
- `columnIndex`: Chỉ số cột

Duyệt mảng đa chiều:
- Sử dụng vòng lặp lồng nhau để duyệt qua các phần tử trong mảng đa chiều.
Ví dụ:
```java
for (int i = 0; i < arrayName.length; i++) {
  for (int j = 0; j < arrayName[i].length; j++) {
    System.out.println(arrayName[i][j]);
  }
}
```
- Sử dụng For-Each Loop:
```java
for (dataType[] row : arrayName) {
  for (dataType element : row) {
    System.out.println(element);
  }
}
```

### 2.3 Các phương thức hữu ích cho mảng
| Phương thức | Mô tả | Giá trị trả về |
|-------------|-------|----------------|
| `Arrays.length` | Trả về kích thước của mảng | Số nguyên đại diện cho số lượng phần tử trong mảng |
| `Arrays.copyOf(array, newLength)` | Tạo một bản sao của mảng với độ dài mới | Mảng mới với kích thước `newLength` |
| `Arrays.equals(array1, array2)` | So sánh hai mảng có bằng nhau không | `true` nếu hai mảng bằng nhau, ngược lại `false` |
| `Arrays.toString(array)` | Chuyển mảng thành chuỗi để dễ dàng in ra | Chuỗi biểu diễn mảng: `[element1, element2, element3, ...]` |
| `Arrays.sort(array)` | Sắp xếp mảng theo thứ tự tăng dần | Mảng đã được sắp xếp |
| `Arrays.fill(array, value)` | Điền tất cả các phần tử của mảng với một giá trị cụ thể | Mảng đã được điền giá trị |
| `Arrays.binarySearch(array, key)` | Tìm kiếm một phần tử trong mảng đã được sắp xếp | Chỉ số của phần tử nếu tìm thấy, ngược lại trả về số âm |

## 3. Luyện tập Array và Loop
Sắp xếp mảng:
```java
int[] numbers = {5, 2, 8, 1, 3};
for (int i = 0; i < numbers.length - 1; i++) {
  for (int j = i + 1; j < numbers.length; j++) {
    if (numbers[i] > numbers[j]) {
      // Hoán đổi
      int temp = numbers[i];
      numbers[i] = numbers[j];
      numbers[j] = temp;
    }
  }
}
```

## 4. Bài tập Lab 03
Mục tiêu: 
- Sử dụng vòng lặp và câu lệnh `break`/`continue`.
- Sử dụng mảng để lưu trữ và xử lý dữ liệu.

Bài tập:
- [Bài 1](./Lab03_code/src/Lab03_code/Lab03_code.java): Viết chương trình kiểm tra số vừa nhập vào có phải số nguyên tố không.
- [Bài 2](./Lab03_code/src/Lab03_code/Lab03_code.java): Viết bảng cửu chương của một số nguyên dương nhập từ bàn phím.
- [Bài 3](./Lab03_code/src/Lab03_code/Lab03_code.java): Nhập vào một mảng số nguyên.
    - Sắp xếp mảng theo thứ tự tăng dần và in ra màn hình.
    - Xuất phần tử lớn nhất và nhỏ nhất trong mảng.