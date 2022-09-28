public class Main {
    public static void main(String[] args) {
        MyThread runableThread = new MyThread();
        Thread myRunnable = new Thread(runableThread);
        MyThread2 myThread = new MyThread2();

//        CHAY DA LUONG
//        myRunnable.start();
//        myThread.start();

        TestLifeCircleThread t1 = new TestLifeCircleThread("a");
        TestLifeCircleThread t2 = new TestLifeCircleThread("b");

// t1 t2 new -> t1 t2 start -> sleep 1s -> t1 t2 start ..... -> t1 t2
//        t1.start();
//        t2.start();

//        Synchronization
        TestSynchronization s1 = new TestSynchronization();

        Thread s2 = new Thread(s1);
        Thread s3 = new Thread(s1);

//        s2.start();
//        s3.start();

//        SET NAME
        TestThreadJoin j1 = new TestThreadJoin();
        j1.setName("join 1");
        TestThreadJoin j2 = new TestThreadJoin();
        j2.setName("join 2");
        TestThreadJoin j3 = new TestThreadJoin();
        j3.setName("join 3");

//       j2.start();
//        try {
//            j2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        j1.start();
//        j3.start();


        //    Thread priority 1->10
        j3.setPriority(10);
        j2.setPriority(1);
        j1.setPriority(2);

//        j1.start();
//        j2.start();
//        j3.start();

//        Deamon thread
        j2.setDaemon(true);
        System.out.println(j2.isDaemon()+ " - " + j1.isDaemon());

    }


}
