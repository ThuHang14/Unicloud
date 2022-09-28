public class DemoLocal {

    public static void main(String[] args) {
        testLocal testLocal = new testLocal();
//        testLocal.print();


//        Lớp Vô Danh Được Tạo Ra Thông Qua Kế Thừa Từ Lớp Khác
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("Lớp Vô Danh Được Tạo Ra Thông Qua Kế Thừa Từ Lớp Khác");
            }
        };
//        t.start();


//        Lớp Vô Danh Được Tạo Ra Thông Qua Triển Khai Từ Interface Khác
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(" Lớp Vô Danh Được Tạo Ra Thông Qua Triển Khai Từ Interface Khác");
            }
        };
        Thread t2 = new Thread(r);
//        t2.start();

//Lớp Vô Danh Được Dùng Như Một Tham Số Truyền Vào
        Thread t3 = new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Lớp Vô Danh Được Dùng Như Một Tham Số Truyền Vào");
            }
        });

//        t3.start();

    }

    static class testLocal {
        public void print() {
            System.out.println("hello word");
        }


    }
}
