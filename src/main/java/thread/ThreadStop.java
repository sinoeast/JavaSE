package thread;



//1.建议线程正常停止--->利用次数,不建议死循环
//2.建议使用标志位-->设置一个标志位
//3.不要使用stop或者 destroy等过时或者JDK不建议使用的方法
public class ThreadStop implements Runnable {


    //1.设置一个标识位
    private boolean flag = true;
    @Override
    public void run() {
        int i = 0;
        while(flag){
            System.out.println("run"+i++);
        }
    }
    //2。设置一个公开的方法停止线程，转换标识位
    public void stop(){
        this.flag = false;
    }

    public static void main(String[] args) {
        ThreadStop threadStop = new ThreadStop();
        new Thread(threadStop).start();
        for (int i = 0; i < 100000; i++) {
            if(i==90000){
                //调用stop方法切换标识位，让线程停止
                threadStop.stop();
            }else if (i%1000==0){
                System.out.println("main"+i);
            }
        }

    }
}
