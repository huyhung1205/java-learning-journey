# Chương 8:
## 1. Interface
- Interface là một dạng lớp trừu tượng hoàn toàn (`abstract class`) dùng để nhóm các phương thức (`methods`) liên quan nhưng không có phần thân (không có body).
- Interface giúp đạt được tính trừu tượng trong Java.
- Mặc định, tất cả phương thức trong `interface` là `abstract` + `public`.
```java
void animalSound();
// abstract public void animalSound();
```
- Khai báo `interface` sử dụng từ khóa `interface` thay vì `class`.
```java
interface Animal {
    void eat();
    void sleep();
}
```
- Interface không thể có constructor → không thể tạo object trực tiếp từ interface (ví dụ: không thể `new Animal()`).
- Một class có thể triển khai nhiều interface cùng lúc (trong khi abstract class chỉ kế thừa 1:1).
- Cách sử dụng `interface`:
    - Để dùng các phương thức trong `interface`, ta cần một class triển khai (`implements`) `interface` đó.
    - Khi triển khai, class phải viết lại (`override`) toàn bộ các phương thức trong `interface`.
```java
// Interface
interface Animal {
  public void animalSound();
  public void sleep();
}

interface Vehicle {
  public void run();
}

// Class Pig triển khai interface Animal
class Pig implements Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Triển khai nhiều interface cùng lúc
class Car implements Vehicle, Animal {
    public void run() {
        System.out.println("The car is running");
    }
    public void animalSound() {
        System.out.println("The car says: vroom vroom");
    }
    public void sleep() {
        System.out.println("Zzz");
    }
}


class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig();
    myPig.animalSound();
    myPig.sleep();
  }
}
```

## 2. Java Packages
- Package là một thư mục chứa các class và interface có liên quan đến nhau.
- Package giúp tổ chức mã nguồn tốt hơn, tránh xung đột tên class và dễ dàng quản lý dự án.
- Truy cập package:
    - Các class mà dự định sẽ được sử dụng ngoài package => định danh public (private/default/protected/public).
    - Các package khác nhau có thể khai báo các class "trùng tên".
- Sử dụng packages:
```java
// Khai báo package
import package_name.class_name;
// Import package
import java.util.Scanner;
// Hoặc import tất cả class trong package
import java.util.*;
// Sử dụng class từ package
Scanner scanner = new Scanner(System.in);
```

## 3. Bài tập Lab 08
- Mục tiêu: làm quen & sử dụng `interface`.
- Bài tập: 
  - Tạo interface IPerson với method:
      + void input( )
      + void display( )
  - Tạo class Person kế thừa interface ở trên, và có thêm:
    + protected String id;
    + protected String name;
    + protected int age;
    + viết constructor, setter, getter
  - Tạo class Student kế thừa class Person, và có thêm:
    + private int mark;
    + private String grade;
    + viết getter cho mark, grade
    + viết setter cho mark
    + viết setter cho grade theo công thức:
      + nếu mark >=8 thì grade = "A"
      + nếu mark >=7 thì grade = "B"
      + nếu mark >=6 thì grade = "C"
      + nếu mark >=5 thì grade = "D"
      + nếu mark <5 thì grade = "Tạch cmnr"
