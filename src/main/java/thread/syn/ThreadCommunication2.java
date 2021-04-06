package thread.syn;

//生产者消费者模型2--》利用标志位：信号灯法
public class ThreadCommunication2 {
    public static void main(String[] args) {
        Tv tv=new Tv();
        Player player=new Player(tv);
        Watcher watcher=new Watcher(tv);
        new Thread(player).start();
        new Thread(watcher).start();
    }
}



//观众
class Watcher implements Runnable{
    Tv tv;
    public Watcher(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
                tv.watch();
        }
    }
}

//演员
class Player implements Runnable{
    Tv tv;
    public Player(Tv tv) {
        this.tv = tv;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(i%2==0){
                tv.action("猫和老鼠");
            }else {
                tv.action("米老鼠");
            }
        }
    }
}

class Tv{
    //标识位
    boolean flag = true;
    String name;

    public synchronized void action(String name){
        //标志位为真 节目等待
        if(!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("播放了"+name);
        //标志位为假 通知观众来看
        this.notifyAll();
        this.name=name;
        //标志位转化
        this.flag =!this.flag;

    }
    public synchronized void watch(){
        //标志位为真 观众等一下
        if(flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("观看了"+this.name);
        //标志位为假 通知节目播放
        this.notifyAll();
        //标志位转化
        this.flag =!this.flag;

    }
}
