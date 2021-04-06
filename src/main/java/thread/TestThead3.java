package thread;
//创建线程方式2：实现Runnable类，重写run方法，执行线程需要丢入Thread（Runnable接口实现类），调用start方法
public class TestThead3 implements Runnable{

    @Override
    public void run() {
        //run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("run方法线程体"+i);
        }
    }

    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        TestThead3 testThead3 = new TestThead3();
        //创建线程对象，通过线程对象来开启我们的线程。～代理
        new Thread(testThead3).start();
        //testThread1.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main线程，主线程"+i);
        }
    }
}
