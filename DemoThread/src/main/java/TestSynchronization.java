public  class TestSynchronization implements Runnable {
    private int money = 100;

    public synchronized void useMoney() throws InterruptedException {
        if (money <= 0) {
            Thread.sleep(1000);
            System.out.println("no money" + money);

        } else {
            money -= 1000;
            Thread.sleep(1000);
            System.out.println(money);
        }

    }

    @Override
    public void run() {
        try {
            useMoney();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public int money() {
        return money;
    }

    public TestSynchronization setMoney(int money) {
        this.money = money;
        return this;
    }

    public TestSynchronization(int money) {
        this.money = money;
    }

    public TestSynchronization() {
    }
}
