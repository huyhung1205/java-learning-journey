# Chương 11:
## 1. [Process and Threads](https://docs.oracle.com/javase/tutorial/essential/concurrency/procthread.html)
- Application: chương trình chạy trên máy tính
- Task: các nhiệm vụ cần thực hiện
- Multi-tasking: thực hiện nhiều nhiệm vụ cùng lúc
- Process: một instance của một chương trình đang chạy
- Thread: một luồng thực thi trong một process
- Multi-threading: thực hiện nhiều luồng cùng lúc trong một process
## 2. [Thread Object](https://docs.oracle.com/javase/tutorial/essential/concurrency/threads.html)
- Java cung cấp lớp Thread để tạo và quản lý luồng.
- Có 2 cách tạo thread:
1. Kế thừa lớp Thread và override phương thức run()
```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Luồng đang chạy...");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); // bắt đầu luồng
    }
}
```

2. Implement giao diện Runnable và override phương thức run():
```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Luồng đang chạy...");
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}
```
Phương thức quan trọng của Thread:
- start(): bắt đầu luồng và gọi phương thức run()
- run(): chứa mã lệnh mà luồng sẽ thực thi
- sleep(long millis): tạm dừng luồng trong một khoảng thời gian
- join(): chờ cho luồng kết thúc trước khi tiếp tục thực thi
- interrupt(): ngắt luồng đang chạy
- isAlive(): kiểm tra xem luồng có đang chạy hay không
- getName() và setName(String name): lấy và đặt tên cho luồng
## 3. What is next?