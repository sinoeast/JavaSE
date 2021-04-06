package thread.syn;

public class Deadlock {

    public static void main(String[] args) {
        Makeup makeup = new Makeup(0,"小红");
        Makeup makeup1 = new Makeup(1,"小名");
        new Thread(makeup).start();
        new Thread(makeup1).start();

    }
}


class Lipstick{}

class Mirror{}

class Makeup implements Runnable{

    //需要资源只有一份，用static来保证只有一份
    static Lipstick lipstick= new Lipstick();
    static Mirror mirror= new Mirror();

    int chioce;
    String name;

    public Makeup(int chioce, String name) {
        this.chioce = chioce;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            makeUp();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //化妆互相持有对方的锁，就是需要拿到对方的资源
    public void makeUp() throws InterruptedException {
        if(chioce==0){
            synchronized (lipstick){
                System.out.println(this.name+"拿了口红");
                Thread.sleep(1000);
                synchronized (mirror){
                    System.out.println(this.name+"拿了镜子");
                }
            }
        }else {
            synchronized (mirror){
                System.out.println(this.name+"拿了镜子");
                Thread.sleep(2000);
                synchronized (lipstick){
                    System.out.println(this.name+"拿了口红");
                }
            }
        }
    }
}