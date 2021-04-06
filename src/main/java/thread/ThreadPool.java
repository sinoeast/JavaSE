package thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPool {

    public static void main(String[] args) {
        //1.创建线程池 参数为线程池大小
        ExecutorService service = Executors.newFixedThreadPool(4);

        //2.执行
        service.execute(new NyThread());
        service.execute(new NyThread());
        service.execute(new NyThread());
        service.execute(new NyThread());
        //3.关闭链接
        service.shutdown();
    }
}


class NyThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}