package thread.syn;

//生产者消费者模型--》利用缓冲区：管程法
public class ThreadCommunication1 {
    public static void main(String[] args) {
        //同一个缓存区
        Warehouse warehouse= new Warehouse();
        new Producers(warehouse).start();
        new Consumers(warehouse).start();
    }
}

//产品：鸡
class Chicken{
    int id;

    public Chicken(int id) {
        this.id = id;
    }
}

//生产者 往仓库塞鸡
class Producers extends Thread{
    Warehouse warehouse=new Warehouse();

    public Producers(Warehouse warehouse) {
        this.warehouse =warehouse;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Chicken chicken = new Chicken(i);
            warehouse.push(chicken);
        }
    }
}
//消费者 从仓库拿鸡
class Consumers extends Thread{
    Warehouse warehouse=new Warehouse();
    public Consumers(Warehouse warehouse) {
        this.warehouse =warehouse;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Chicken chicken=warehouse.pop();
            System.out.println("消费到了"+chicken.id);
        }
    }
}
//产品库
class Warehouse {
    //产品库10只鸡就满了
    Chicken[] chicken = new Chicken[10];

    //记数
    int count = 0;

    //生产
    public synchronized void push(Chicken chicke){
        if(count==chicken.length){
            System.out.println("仓库满了库存："+count+"  想加入的鸡的编号是"+(chicke.id));
            try {
                //生产等待
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        chicken[count]=chicke;
        count++;
        System.out.println(count+"号仓库   加入的鸡的编号是"+chicke.id);
        //通知消费
        this.notifyAll();
    }

    //消费
    public synchronized Chicken pop(){
        if(count==0){
            System.out.println("仓库空了");
            try {
                //消费等待
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("我取走了"+count+"号仓库的鸡"+chicken[count-1].id);
        count--;
        System.out.println("   还剩库存："+count);
        //通知生产
        this.notifyAll();
        return chicken[count];
    }

}

