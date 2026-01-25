# Chương 5:
## 1. Non-primitive(reference) Data Types
Non-primitive data types (còn được gọi là reference data types - kiểu dữ liệu tham chiếu) trong Java bao gồm các loại dữ liệu như Class, Interface, và Array. Không giống như primitive data types (như int, char, boolean), non-primitive data types không lưu trữ giá trị trực tiếp mà lưu trữ tham chiếu đến vị trí bộ nhớ nơi giá trị thực được lưu trữ.

## [2. Java AutoBoxing và Unboxing (Object wrapper class)](https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html)
Java cung cấp các lớp wrapper (bao bọc) để chuyển đổi giữa primitive data types và non-primitive data types. Quá trình này được gọi là AutoBoxing và Unboxing.
- AutoBoxing: Tự động chuyển đổi từ primitive type sang corresponding wrapper class. Ví dụ, chuyển đổi từ int sang Integer.
- Unboxing: Tự động chuyển đổi từ wrapper class trở lại primitive type. Ví dụ, chuyển đổi từ Integer sang int.

## [3. ArrayList là gì?](https://www.w3schools.com/java/java_arraylist.asp)
ArrayList là một lớp trong Java Collections Framework, cung cấp một cách linh hoạt để lưu trữ và quản lý các phần tử. Khác với mảng thông thường (array), ArrayList có thể thay đổi kích thước động, cho phép thêm, xóa và truy cập các phần tử một cách dễ dàng.
Một số đặc điểm chính của ArrayList:
- Kích thước động: Có thể tự động mở rộng khi cần thiết.
- Chấp nhận các phần tử trùng lặp.
- Cho phép lưu trữ null.
- Cung cấp nhiều phương thức hữu ích để thao tác với danh sách.

Tạo một ArrayList trong Java:
`ArrayList<DataType> listName = new ArrayList<>();`

Trong đó:
- `DataType`: Kiểu dữ liệu tham chiếu của các phần tử trong ArrayList (ví dụ: Integer, String, Double, v.v.).
- `listName`: Tên của ArrayList.

```java
import java.util.ArrayList;

// Tạo một ArrayList để lưu trữ các chuỗi - ưu tiên sử dụng generics để định kiểu
ArrayList<String> list = new ArrayList<>();

// Cách viết truyền thống trước Java 7 - dài dòng
ArrayList<String> list = new ArrayList<String>();

// Sử dụng List interface để khai báo biến - khuyến khích sử dụng
List<String> list = new ArrayList<>(); 

var list = new ArrayList<String>(); // Sử dụng từ khóa var (Java 10 trở lên)

// Tạo một ArrayList chưa định kiểu (raw type) - không khuyến khích sử dụng
ArrayList rawList = new ArrayList();
```

Các methods phổ biến của ArrayList:
- `add(E element)`: Thêm phần tử vào cuối danh sách.
- `add(int index, E element)`: Thêm phần tử tại vị trí index. Các phần tử sau sẽ được dịch chuyển sang phải.
- `get(int index)`: Lấy phần tử tại vị trí index.
- `set(int index, E element)`: Cập nhật phần tử tại vị trí index.
- `remove(int index)`: Xóa phần tử tại vị trí index.
- `size()`: Trả về số lượng phần tử trong danh sách.
- `clear()`: Xóa tất cả các phần tử trong danh sách.

Một lớp hữu ích: Collections bao gồm các phương thức tĩnh để thao tác với các collection, bao gồm cả ArrayList. Ví dụ: sắp xếp, tìm kiếm, đảo ngược, v.v.
- `Collections.sort(list)`: Sắp xếp các phần tử trong danh sách theo thứ tự tăng.
- `Collections.reverse(list)`: Đảo ngược thứ tự các phần tử trong danh sách.
- `Collections.shuffle(list)`: Xáo trộn ngẫu nhiên các phần tử trong danh sách.
- `Collections.max(list)`: Trả về phần tử lớn nhất trong danh sách.
- `Collections.min(list)`: Trả về phần tử nhỏ nhất trong danh sách.
- `Collections.frequency(list, element)`: Đếm số lần xuất hiện của một phần tử trong danh sách.
- `Collections.copy(destList, srcList)`: Sao chép các phần tử từ srcList sang destList.
- `Collections.fill(list, element)`: Điền tất cả các phần tử trong danh sách bằng một giá trị cụ thể.
- `Collections.rotate(list, distance)`: Xoay vòng các phần tử trong danh sách theo khoảng cách xác định.
- `Collections.swap(list, i, j)`: Hoán đổi hai phần tử tại vị trí i và j trong danh sách.
- `Collections.replaceAll(list, oldVal, newVal)`: Thay thế tất cả các lần xuất hiện của oldVal bằng newVal trong danh sách.
- `Collections.disjoint(list1, list2)`: Kiểm tra xem hai danh sách có phần tử chung hay không.
- `Collections.unmodifiableList(list)`: Trả về một danh sách không thể thay đổi từ danh sách gốc.

## 4. Java Generics (Basic)
Generics trong Java cho phép bạn định nghĩa các lớp, giao diện và phương thức với các kiểu dữ liệu tổng quát (generic types). Điều này giúp tăng tính tái sử dụng mã nguồn và đảm bảo an toàn về kiểu dữ liệu tại thời điểm biên dịch.
Ví dụ về khai báo một lớp generic:
```java
public class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
```
Trong đó, `T` là một kiểu dữ liệu tổng quát (type parameter) mà bạn có thể thay thế bằng bất kỳ kiểu dữ liệu cụ thể nào khi tạo đối tượng của lớp Box.

## 5. Bài tập Lab 05
Mục tiêu:
- Sử dụng ArrayList để quản lý danh sách.
- Áp dụng Generics để đảm bảo an toàn về kiểu dữ liệu.

Yêu cầu:
- [Bài 1](./Lab05_code/src/Lab05_code/Bai1.java): Nhập danh sách các số thực với số lượng tùy ý từ bàn phím. Xuất danh sách  ra màn hình và tính tổng, trung bình, giá trị lớn nhất, nhỏ nhất.
- [Bài 2](./Lab05_code/src/Lab05_code/Bai2.java): Nhập danh sách tên sinh viên (String) từ bàn phím. Sắp xếp danh sách theo thứ tự bảng chữ cái và xuất ra màn hình.