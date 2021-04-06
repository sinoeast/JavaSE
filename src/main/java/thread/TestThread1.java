package thread;

/**创建线程方式一:继承Thread类,重写run()方法,调用 start开启线程
 * 线程开启不一定立即执行，由CPU调度
 */

public class TestThread1 extends Thread{
    @Override
    public void run() {
        //run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("run方法线程体"+i);
        }
    }

    public static void main(String[] args) {
        TestThread1 testThread1 = new TestThread1();
        testThread1.start();
        //main线程，主线程
        for (int i = 0; i < 20; i++) {
            System.out.println("main线程，主线程"+i);
        }
    }
}
