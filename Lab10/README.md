# Chương 10:
## 1. Tổng quan về Java I/O Stream
- Máy tính chỉ hiểu được ký tự 0 và 1.
- Làm sao để máy tính và con người có thể giao tiếp với nhau?
- Ví dụ:
    human: cung cấp 1 file video (Data Source).
    computer: chạy và hiển thị video đó (Data Destination).
    - Bước 1: Input ban đầu (raw) cần được chuyển đổi thành một định dạng mà máy tính có thể hiểu được (byte stream) 0 và 1.
    - Bước 2: dạng byte stream này sẽ được chuyển đổi thành một định dạng con người có thể hiểu được (images, video, audio, files).
    -> quá trình này được gọi là I/O Stream (Input/Output Stream).
- Stream là một luồng dữ liệu, nó cho phép chúng ta đọc hoặc ghi dữ liệu một cách tuần tự, từng phần một, thay vì phải đọc hoặc ghi toàn bộ dữ liệu cùng một lúc.
- Java cung cấp một hệ thống I/O mạnh mẽ thông qua các lớp trong gói `java.io` và `java.nio`. Các lớp này cho phép chúng ta làm việc với các luồng dữ liệu, bao gồm cả luồng byte và luồng ký tự.
- Ưu điểm của I/O Stream:
    - Hiệu quả: Stream cho phép chúng ta xử lý dữ liệu một cách hiệu quả, đặc biệt khi làm việc với các tệp lớn hoặc dữ liệu mạng.
    - Linh hoạt: Java cung cấp nhiều loại Stream khác nhau để phù hợp với các nhu cầu khác nhau, từ đọc và ghi tệp đến xử lý dữ liệu mạng.
    - Dễ sử dụng: Các lớp Stream trong Java được thiết kế để dễ sử dụng, với nhiều phương thức tiện ích để đọc và ghi dữ liệu một cách dễ dàng.
- Nhược điểm của I/O Stream:
    - Phức tạp: Đôi khi việc sử dụng các lớp Stream có thể trở nên phức tạp, đặc biệt đối với những người mới bắt đầu.
    - Hiệu suất: Trong một số trường hợp, việc sử dụng Stream có thể dẫn đến hiệu suất thấp hơn so với các phương pháp khác, đặc biệt khi làm việc với dữ liệu nhỏ hoặc khi cần truy cập ngẫu nhiên vào dữ liệu.

## 2. Phân loại Stream trong Java IO
- Stream được phân loại thành hai loại chính: Byte Stream và Character Stream.
- Byte Stream: Là loại Stream xử lý dữ liệu ở dạng byte (8 bit). Các lớp trong Byte Stream thường được sử dụng để làm việc với các tệp nhị phân, như hình ảnh, video, hoặc âm thanh. Ví dụ: `FileInputStream`, `FileOutputStream`, `BufferedInputStream`, `BufferedOutputStream`.
- Character Stream: Là loại Stream xử lý dữ liệu ở dạng ký tự (16 bit). Các lớp trong Character Stream thường được sử dụng để làm việc với các tệp văn bản. Ví dụ: `FileReader`, `FileWriter`, `BufferedReader`, `BufferedWriter`.
- Ngoài ra, còn có các lớp Stream khác như `DataInputStream`, `DataOutputStream`, `ObjectInputStream`, `ObjectOutputStream` để làm việc với dữ liệu có cấu trúc phức tạp hơn, như các đối tượng Java hoặc dữ liệu nhị phân có định dạng cụ thể.

## 3. Ví dụ về Read và Write File
- Read (Đọc): quá trình lấy dữ liệu từ nguồn (file, bàn phím, mạng) vào chương trình.
- Write (Ghi/Xuất): quá trình đưa dữ liệu từ chương trình ra đích (file, màn hình, mạng)
- Java cung cấp các lớp trong gói java.io và java.nio để thực hiện đọc/ghi dữ liệu.
- Cú pháp cơ bản: 
Đọc file văn bản (Character Stream)
```java
try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line); // xuất ra màn hình
    }
} catch (IOException e) {
    e.printStackTrace();
}
```
Ghi file văn bản (Character Stream)
```java
try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
    bw.write("Xin chào Java!");
    bw.newLine();
    bw.write("Đây là ví dụ ghi file.");
} catch (IOException e) {
    e.printStackTrace();
}
```
Đọc/Ghi file nhị phân (Byte Stream)
```java
try (FileInputStream fis = new FileInputStream("source.jpg");
     FileOutputStream fos = new FileOutputStream("copy.jpg")) {

    byte[] buffer = new byte[1024];
    int length;
    while ((length = fis.read(buffer)) != -1) {
        fos.write(buffer, 0, length);
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

## 4. Path Class
- Path Class là một phần của gói `java.nio.file` và được sử dụng để đại diện cho đường dẫn đến một tệp hoặc thư mục trong hệ thống tệp.
- Path Class cung cấp nhiều phương thức để làm việc với đường dẫn, bao gồm:
    - `getFileName()`: Trả về tên tệp hoặc thư mục cuối cùng trong đường dẫn.
    - `getParent()`: Trả về đường dẫn của thư mục cha.
    - `getRoot()`: Trả về đường dẫn gốc của hệ thống tệp.
    - `toAbsolutePath()`: Trả về đường dẫn tuyệt đối của tệp hoặc thư mục.
    - `toString()`: Trả về chuỗi đại diện cho đường dẫn.
- Path Class cũng hỗ trợ các phương thức để kiểm tra sự tồn tại của tệp hoặc thư mục, tạo tệp hoặc thư mục mới, và thực hiện các thao tác khác trên hệ thống tệp.
- Relative Path và Absolute Path:
    - Relative Path: Là đường dẫn tương đối, nó chỉ định vị trí của tệp hoặc thư mục so với một vị trí khác (thường là thư mục hiện tại). Ví dụ: `./data/file.txt` hoặc `../data/file.txt`.
    - Absolute Path: Là đường dẫn tuyệt đối, nó chỉ định vị trí chính xác của tệp hoặc thư mục trong hệ thống tệp, bắt đầu từ gốc. Ví dụ: `C:\Users\Username\data\file.txt` hoặc `/home/username/data/file.txt`.