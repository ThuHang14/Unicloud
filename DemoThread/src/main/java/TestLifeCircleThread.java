public class TestLifeCircleThread extends Thread {
    private String ThreadName;

    public String ThreadName() {
        return ThreadName;
    }

    public TestLifeCircleThread setThreadName(String threadName) {
        ThreadName = threadName;
        return this;
    }

    public TestLifeCircleThread(String threadName) {
        ThreadName = threadName;
    }


    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(this.ThreadName() + " - " + i);
        }
    }
}
