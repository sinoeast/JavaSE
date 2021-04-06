package thread;

public class StaticProxy {

    public static void main(String[] args) {

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("多线程结婚");
//            }
//        }).start();
        new Thread(()-> System.out.println("静态代理多线程（lamda表达式）")).start();
        new WeddingCompany(new Me()).happyMarry();
    }
}
interface  Marry{
    void happyMarry();
}

class Me implements  Marry{
    @Override
    public void happyMarry() {
        System.out.println("我来结婚");
    }
}

class WeddingCompany implements Marry{
    private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void happyMarry() {
        before();
        this.target.happyMarry();
    }

    private void before() {
        System.out.println("婚庆公司来了");
    }
}
