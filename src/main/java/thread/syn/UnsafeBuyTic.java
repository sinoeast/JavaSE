package thread.syn;
//多个线程同时操作一个对象
//买显卡的例子

//发现问题：多个线程操作同一个资源的情况下，线程不安全，数据紊乱
public class UnsafeBuyTic implements Runnable {

    //显卡数量
    private int ticketNum ;
    boolean flag = true;

    public UnsafeBuyTic(int ticketNum) {
        this.ticketNum = ticketNum;
    }

    @Override
    public  void run() {
        while(flag){
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("卖完了");
    }
    public synchronized void buy() throws InterruptedException {

        if(ticketNum<=0){
            flag =false;
            return;
        }
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName()+"买到了"+ticketNum--);
    }


    public static void main(String[] args) {
        UnsafeBuyTic testThread4 = new UnsafeBuyTic(10);
        new Thread(testThread4,"黄牛").start();
        new Thread(testThread4,"穷学生").start();
        new Thread(testThread4,"矿老板").start();
        new Thread(testThread4,"臭打游戏").start();
    }
}
