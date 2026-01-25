# Các method quan trọng của lớp String
String là lớp được dùng cực kỳ nhiều trong Java, nên nắm được các method này rất hữu ích:

| Method | Kiểu trả về | Ý nghĩa | Ví dụ |
|---------------------------|--------------|---------------------------------|----------------------------------|
| concat(String s)          | String       | Nối chuỗi                       | `"Hello, ".concat("World!") → "Hello, World!"` |
| startsWith(String prefix) | boolean      | Kiểm tra chuỗi bắt đầu bằng prefix | `"java".startsWith("ja") → true` |
| endsWith(String suffix)   | boolean      | Kiểm tra chuỗi kết thúc bằng suffix | `"java".endsWith("va") → true` |
| equals(Object obj)        | boolean      | So sánh nội dung chuỗi          | `"abc".equals("abc") → true` |
| equalsIgnoreCase(String s)| boolean      | So sánh nội dung, bỏ qua hoa/thường | `"abc".equalsIgnoreCase("ABC") → true` |
| length()                  | int          | Lấy độ dài chuỗi                | `"hello".length() → 5` |
| charAt(int index)         | char         | Lấy ký tự tại vị trí            | `"java".charAt(2) → 'v'` |
| substring(int begin, int end) | String   | Lấy chuỗi con                   | `"hello".substring(1,4) → "ell"` |
| contains(CharSequence s)  | boolean      | Kiểm tra chuỗi con              | `"hello".contains("he") → true` |
| toUpperCase()             | String       | Chuyển thành chữ hoa            | `"hi".toUpperCase() → "HI"` |
| toLowerCase()             | String       | Chuyển thành chữ thường         | `"HI".toLowerCase() → "hi"` |
| trim()                    | String       | Xóa khoảng trắng đầu/cuối       | `" hi ".trim() → "hi"` |
| replace(char old, char new)| String      | Thay thế ký tự                  | `"java".replace('a','o') → "jovo"` |
| split(String regex)       | String[]     | Tách chuỗi theo regex           | `"a,b,c".split(",") → ["a","b","c"]` |

# Các method quan trọng của lớp Object
Vì mọi lớp trong Java đều kế thừa từ Object, nên các method này rất cơ bản:

| Method              | Kiểu trả về | Ý nghĩa                                      | Ví dụ |
|---------------------|-------------|----------------------------------------------|-------|
| equals(Object obj)  | boolean     | So sánh nội dung đối tượng (nhiều lớp override lại, như String) | `"abc".equals("abc") → true` |
| toString()          | String      | Trả về chuỗi mô tả đối tượng                 | `System.out.println(obj.toString())` |
| hashCode()          | int         | Mã băm của đối tượng (dùng trong HashMap, HashSet) | `obj.hashCode()` |
| getClass()          | Class<?>    | Lấy thông tin lớp của đối tượng              | `obj.getClass()` |
| clone()             | Object      | Tạo bản sao đối tượng (nếu lớp hỗ trợ Cloneable) | `obj.clone()` |
| finalize()          | void        | Được gọi bởi GC trước khi hủy đối tượng (ít dùng) | — |
| notify()            | void        | Đánh thức một thread đang chờ trên đối tượng | — |
| notifyAll()         | void        | Đánh thức tất cả thread đang chờ trên đối tượng | — |
| wait()              | void        | Tạm dừng thread cho đến khi được notify      | — |

# Các method quan trọng của ArrayList
Khi làm việc với danh sách, bạn sẽ thường dùng:

| Method                        | Kiểu trả về | Ý nghĩa                                | Ví dụ |
|-------------------------------|-------------|----------------------------------------|-------|
| add(E e)                      | boolean     | Thêm phần tử vào cuối danh sách        | `list.add("car")` |
| add(int index, E element)     | void        | Thêm phần tử vào vị trí chỉ định       | `list.add(1,"bike")` |
| get(int index)                | E           | Lấy phần tử tại vị trí                 | `list.get(0)` |
| set(int index, E e)           | E           | Gán giá trị mới cho vị trí             | `list.set(1,"bike")` |
| remove(int index)             | E           | Xóa phần tử tại vị trí                 | `list.remove(0)` |
| remove(Object o)              | boolean     | Xóa phần tử theo giá trị               | `list.remove("car")` |
| size()                        | int         | Số phần tử trong danh sách             | `list.size()` |
| contains(Object o)            | boolean     | Kiểm tra có phần tử trong danh sách    | `list.contains("car")` |
| isEmpty()                     | boolean     | Kiểm tra danh sách rỗng                | `list.isEmpty()` |
| clear()                       | void        | Xóa toàn bộ phần tử                    | `list.clear()` |
| indexOf(Object o)             | int         | Vị trí đầu tiên của phần tử            | `list.indexOf("car")` |
| lastIndexOf(Object o)         | int         | Vị trí cuối cùng của phần tử           | `list.lastIndexOf("car")` |
| subList(int from, int to)     | List<E>     | Lấy danh sách con                      | `list.subList(0,2)` |
| ensureCapacity(int minCap)    | void        | Đảm bảo dung lượng tối thiểu           | `list.ensureCapacity(100)` |
| trimToSize()                  | void        | Giảm dung lượng về đúng số phần tử     | `list.trimToSize()` |

# Các method quan trọng của lớp Collections
Lớp `Collections` (trong `java.util`) chứa các method tiện ích để thao tác với collection (List, Set, Map).

| Method | Kiểu trả về | Ý nghĩa | Ví dụ |
|--------|-------------|---------|-------|
| Collections.sort(list) | void | Sắp xếp các phần tử trong danh sách theo thứ tự tăng dần | `Collections.sort(list)` |
| Collections.sort(list, comparator) | void | Sắp xếp theo comparator tùy chỉnh | `Collections.sort(list, Comparator.reverseOrder())` |
| Collections.reverse(list) | void | Đảo ngược thứ tự các phần tử trong danh sách | `Collections.reverse(list)` |
| Collections.shuffle(list) | void | Xáo trộn ngẫu nhiên các phần tử trong danh sách | `Collections.shuffle(list)` |
| Collections.max(list) | E | Trả về phần tử lớn nhất trong danh sách | `Collections.max(list)` |
| Collections.min(list) | E | Trả về phần tử nhỏ nhất trong danh sách | `Collections.min(list)` |
| Collections.frequency(list, element) | int | Đếm số lần xuất hiện của một phần tử trong danh sách | `Collections.frequency(list,"car")` |
| Collections.copy(destList, srcList) | void | Sao chép các phần tử từ srcList sang destList | `Collections.copy(dest, src)` |
| Collections.fill(list, element) | void | Điền tất cả các phần tử trong danh sách bằng một giá trị cụ thể | `Collections.fill(list,"X")` |
| Collections.rotate(list, distance) | void | Xoay vòng các phần tử trong danh sách theo khoảng cách xác định | `Collections.rotate(list,2)` |
| Collections.swap(list, i, j) | void | Hoán đổi hai phần tử tại vị trí i và j | `Collections.swap(list,0,1)` |
| Collections.replaceAll(list, oldVal, newVal) | boolean | Thay thế tất cả các lần xuất hiện của oldVal bằng newVal | `Collections.replaceAll(list,"car","bike")` |
| Collections.disjoint(list1, list2) | boolean | Kiểm tra xem hai danh sách có phần tử chung hay không | `Collections.disjoint(list1,list2)` |
| Collections.unmodifiableList(list) | List<E> | Trả về một danh sách không thể thay đổi từ danh sách gốc | `Collections.unmodifiableList(list)` |
| Collections.synchronizedList(list) | List<E> | Trả về danh sách thread-safe (dùng trong đa luồng) | `Collections.synchronizedList(list)` |