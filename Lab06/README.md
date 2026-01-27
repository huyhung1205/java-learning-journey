# Chương 6:
## 1. String trong Java
[Java Strings](https://www.w3schools.com/java/java_strings.asp)
- Chuỗi ký tự được sử dụng để lưu trữ văn bản.
- Một Stringbiến chứa một tập hợp các ký tự được bao quanh bởi dấu ngoặc kép ( ""):

[Strings - Special Characters: Chuỗi ký tự - Ký tự đặc biệt](https://www.w3schools.com/java/java_strings_specchars.asp)
- Một số ký tự đặc biệt có thể được sử dụng trong một chuỗi ký tự, bao gồm:
  - `\'` : Single quote
  - `\"` : Double quote
  - `\\` : Backslash
  - `\n` : New line
  - `\r` : Carriage return
  - `\t` : Tab
  - `\b` : Backspace
  - `\f` : Form feed

String là Object (Class), nên có các method được xây dựng sẵn:
- `length()` : Trả về độ dài của chuỗi ký tự
- `toUpperCase()` : Chuyển chuỗi ký tự thành chữ in hoa
- `toLowerCase()` : Chuyển chuỗi ký tự thành chữ in thường
- `trim()` : Loại bỏ khoảng trắng thừa ở đầu và cuối chuỗi ký tự
- `substring(int beginIndex, int endIndex)` : Trích xuất một phần của chuỗi ký tự
- `replace(char oldChar, char newChar)` : Thay thế ký tự cũ bằng ký tự mới trong chuỗi ký tự
- `split(String regex)` : Chia chuỗi ký tự thành mảng con dựa trên ký tự phân tách
- `charAt(int index)` : Trả về ký tự tại vị trí chỉ định trong chuỗi ký tự
- `indexOf(String str)` : Trả về vị trí đầu tiên của chuỗi con được tìm thấy trong chuỗi ký tự
- `contains(CharSequence s)` : Kiểm tra xem chuỗi ký tự có chứa chuỗi con hay không

## 2. Bài tập sử dụng String
- [Bài 1](./Lab06_code/src/Lab06_code/Bai1.java): Nhập username và password từ bàn phím. Nếu username là "admin" và password là "12345", in ra "Đăng nhập thành công", ngược lại in ra "Đăng nhập thất bại".
- [Bài 2](./Lab06_code/src/Lab06_code/Student.java): Ứng dụng quản lý sinh viên
    - Tạo class Student với các thuộc tính: id (int), name (String).
    - Tại hàm main, tạo 5 student với tên khác nhau sử dụng constructor.
    - Tìm và in ra các student có tên bắt đầu bằng là "Nguyễn".

## [3. Regular Expressions](https://www.w3schools.com/java/java_regex.asp)
- Regular Expressions là một chuỗi ký tự tạo thành mẫu tìm kiếm.
- Regular Expressions có thể là một ký tự đơn hoặc một mẫu phức tạp hơn.
- Regular Expressions có thể được sử dụng để thực hiện tất cả các loại thao tác tìm kiếm và thay thế văn bản .
- Java không có lớp Regular Expressions tích hợp sẵn, nhưng chúng ta có thể nhập java.util.regex gói để làm việc với Regular Expressions. Gói này bao gồm các lớp sau:
    - PatternLớp - Định nghĩa một mẫu (được sử dụng trong tìm kiếm)
    - MatcherLớp - Được sử dụng để tìm kiếm mẫu
    - PatternSyntaxExceptionClass - Cho biết lỗi cú pháp trong mẫu biểu thức chính quy.

### **Regex Cheat Sheet**

#### 1. Character Classes
| Biểu thức | Ý nghĩa |
|-----------|---------|
| `[abc]`   | Khớp với một ký tự bất kỳ trong tập hợp `a`, `b`, `c`. |
| `[^abc]`  | Khớp với một ký tự **không nằm** trong tập hợp `a`, `b`, `c`. |
| `[a-z]`   | Khớp với một ký tự từ `a` đến `z`. |
| `[A-Z]`   | Khớp với một ký tự từ `A` đến `Z`. |
| `[0-9]`   | Khớp với một chữ số từ `0` đến `9`. |
| `\d`      | Khớp với một chữ số (`0-9`). |
| `\D`      | Khớp với một ký tự không phải chữ số. |
| `\w`      | Khớp với một ký tự từ (chữ cái, chữ số, hoặc `_`). |
| `\W`      | Khớp với một ký tự không phải từ. |
| `\s`      | Khớp với một ký tự khoảng trắng (space, tab, newline). |
| `\S`      | Khớp với một ký tự không phải khoảng trắng. |


#### 2. Metacharacters
| Metacharacter | Ý nghĩa |
|---------------|---------|
| `.`           | Khớp với bất kỳ ký tự nào (trừ xuống dòng). |
| `\.`          | Khớp với dấu chấm thực sự `"."`. |
| `^`           | Khớp ở **đầu chuỗi**. |
| `$`           | Khớp ở **cuối chuỗi**. |
| `^…$`         | Khớp toàn bộ chuỗi từ đầu đến cuối. |
| `\|`          | Toán tử OR, ví dụ: `abc\|def`. |
| `\b`          | Khớp ở ranh giới từ. |
| `\uxxxx`      | Khớp với ký tự Unicode theo mã hexa. |


#### 3. Quantifiers
| Quantifier | Ý nghĩa |
|------------|---------|
| `n+`       | Ít nhất một ký tự `n`. |
| `n*`       | Không hoặc nhiều ký tự `n`. |
| `n?`       | Không hoặc một ký tự `n`. |
| `n{x}`     | Đúng **x lần** ký tự `n`. |
| `n{x,y}`   | Từ **x đến y lần** ký tự `n`. |
| `n{x,}`    | Ít nhất **x lần** ký tự `n`. |


#### 4. Groups & Alternation
| Biểu thức | Ý nghĩa |
|-----------|---------|
| `(abc)`   | Nhóm khớp chính xác chuỗi `"abc"`. |
| `(a(bc))` | Nhóm con (sub-group). |
| `(.*)`    | Khớp toàn bộ chuỗi bất kỳ. |
| `(abc\|def)` | Khớp `"abc"` hoặc `"def"`. |


#### 5. Assertions (Lookaround)
| Biểu thức | Ý nghĩa |
|-----------|---------|
| `(?=abc)` | Positive lookahead: khớp nếu phía sau là `"abc"`. |
| `(?!abc)` | Negative lookahead: khớp nếu phía sau **không phải** `"abc"`. |
| `(?<=abc)` | Positive lookbehind: khớp nếu phía trước là `"abc"`. |
| `(?<!abc)` | Negative lookbehind: khớp nếu phía trước **không phải** `"abc"`. |

### Using Regular Expressions in Java
#### 1. Giới thiệu
Java hỗ trợ biểu thức chính quy thông qua các lớp trong gói java.util.regex. Regex trong Java có cú pháp tương tự PCRE, nhưng có một số khác biệt nhỏ về tính năng nâng cao.

Để sử dụng, cần nhập gói:
```java
import java.util.regex.*;
```
#### 2. Chuỗi và ký tự đặc biệt
Trong Java, chuỗi có thể chứa ký tự thoát (escape sequence) như \n (xuống dòng), \t (tab). Khi viết Regex trong Java, cần thoát dấu gạch chéo ngược \.

Ví dụ:
Regex: `There are \d dogs`
Trong Java: `"There are \\\d dogs"`
#### 3. So khớp chuỗi
Cách đơn giản:
```java
boolean isMatch = Pattern.matches(String regex, String inputStr);
```

Cách đầy đủ:
```java
Pattern ptrn = Pattern.compile(String regex);
Matcher matcher = ptrn.matcher(String inputStr);
```

Ví dụ:
```java
Pattern ptrn = Pattern.compile("([a-zA-Z]+) (\\d+)");
Matcher matcher = ptrn.matcher("June 24");
if (matcher.matches()) {
    System.out.println("Match at index [" + matcher.start() + ", " + matcher.end() + ")");
    System.out.println("Match: " + matcher.group());
}
```

#### 4. Nhóm bắt giữ (Capture Groups)
```java
String pattern = "([a-zA-Z]+) (\\d+)";
Pattern ptrn = Pattern.compile(pattern);
Matcher matcher = ptrn.matcher("June 24, August 9, Dec 12");

while (matcher.find()) {
    System.out.println(String.format("Match: %s at index [%d, %d]", matcher.group(), matcher.start(), matcher.end()));
}

matcher.reset();
while (matcher.find()) {
    System.out.println(matcher.groupCount() + " groups captured");
    System.out.println("Month: " + matcher.group(1) + ", Day: " + matcher.group(2));
}
```

#### 5. Tìm kiếm và thay thế
Sử dụng:
```java
String replacedString = matcher.replaceAll(String replacement);
String replacedString = matcher.replaceFirst(String replacement);
```

Ví dụ:
```java
Pattern ptrn = Pattern.compile("([a-zA-Z]+) (\\d+)");
Matcher matcher = ptrn.matcher("June 24, August 9, Dec 12");
String replacedString = matcher.replaceAll("$2 of $1");
System.out.println(replacedString);
// Kết quả: 24 of June, 9 of August, 12 of Dec
```

#### 6. Các cờ (Flags)

`Pattern.CASE_INSENSITIVE`: Không phân biệt hoa/thường.

`Pattern.MULTILINE`: Cho phép `^` và `$` khớp ở đầu/cuối mỗi dòng.

`Pattern.DOTALL`: Cho phép `.` khớp cả ký tự xuống dòng.
`Pattern.LITERAL`: Khớp mẫu theo nghĩa đen, không coi ký tự đặc biệt là Regex.

### Regex trong Java – Method thường dùng

#### Lớp Pattern
| Method | Loại | Ý nghĩa | Ví dụ |
|--------|------|---------|-------|
| `compile(String regex)` | **static** | Biên dịch chuỗi Regex thành đối tượng `Pattern` | `Pattern p = Pattern.compile("\\d+");` |
| `matches(String regex, CharSequence input)` | **static** | Kiểm tra toàn bộ chuỗi có khớp với Regex không (không cần đối tượng `Pattern`) | `Pattern.matches("\\d+", "123"); // true` |
| `split(CharSequence input)` | instance | Tách chuỗi theo Regex | `Pattern.compile(",").split("a,b,c"); // [a, b, c]` |
| `pattern()` | instance | Trả về chuỗi Regex gốc | `p.pattern(); // "\\d+"` |

#### Lớp Matcher
| Method | Ý nghĩa | Ví dụ |
|--------|---------|-------|
| `matcher(CharSequence input)` | Tạo đối tượng `Matcher` từ `Pattern` | `Matcher m = p.matcher("abc123");` |
| `matches()` | Kiểm tra toàn bộ chuỗi có khớp không | `m.matches(); // false (vì "abc123" không chỉ toàn số)` |
| `find()` | Tìm lần khớp tiếp theo trong chuỗi | `while(m.find()) System.out.println(m.group());` |
| `group()` | Lấy chuỗi khớp hiện tại | Regex: `\\d+`, input `"abc123"` → `m.group()` = `"123"` |
| `group(int i)` | Lấy nhóm bắt giữ thứ i | Regex: `(\\w+) (\\d+)`, input `"June 24"` → `group(1)="June"`, `group(2)="24"` |
| `start()` / `end()` | Vị trí bắt đầu/kết thúc của lần khớp | `"June 24"` với Regex `(\\w+) (\\d+)` → `start(1)=0`, `end(1)=4` |
| `replaceAll(String replacement)` | Thay thế tất cả lần khớp | `"June 24, Aug 9"`.replaceAll(`"(\\w+) (\\d+)"`, `"$2 of $1"`) → `"24 of June, 9 of Aug"` |
| `replaceFirst(String replacement)` | Thay thế lần khớp đầu tiên | `"June 24, Aug 9"`.replaceFirst(`"(\\w+) (\\d+)"`, `"$2 of $1"`) → `"24 of June, Aug 9"` |
| `reset()` | Đưa `Matcher` về trạng thái ban đầu để tìm lại | Sau khi `find()` hết, gọi `m.reset()` để tìm lại từ đầu |

#### Ví dụ tổng hợp
```java
import java.util.regex.*;

public class RegexDemo {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(\\w+) (\\d+)");
        Matcher m = p.matcher("June 24, August 9, Dec 12");

        while (m.find()) {
            System.out.println("Match: " + m.group() +
                " at [" + m.start() + ", " + m.end() + "]");
            System.out.println("Month: " + m.group(1) +
                ", Day: " + m.group(2));
        }

        // Thay thế
        String replaced = m.replaceAll("$2 of $1");
        System.out.println("Replaced: " + replaced);
    }
}
```


## 4. Bài tập Regular Expressions
- [Bài 3](./Lab06_code/src/Lab06_code/Bai3.java): Viết Regex kiểm tra email hợp lệ (ví dụ: abc@gmail.com).
- [Bài 4](./Lab06_code/src/Lab06_code/Bai4.java): Viết Regex kiểm tra số điện thoại Việt Nam (bắt đầu bằng 0, có 10 chữ số).
- [Bài 5](./Lab06_code/src/Lab06_code/Bai5.java): Viết Regex tìm tất cả từ bắt đầu bằng chữ N trong một đoạn văn bản.
- [Bài 6](./Lab06_code/src/Lab06_code/Bai6.java): Viết Regex thay thế tất cả khoảng trắng bằng dấu -.


