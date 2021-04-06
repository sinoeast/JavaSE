package oop.tree;

/**
 * @author lantian
 */
public class Father {
    protected double weight = 100;

    //control +回车
    public Father() {
        System.out.println("father构造");
    }

    public Father(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight>200||weight<1){
            System.out.println("不是人太重了");
        }else {
            this.weight = weight;
        }
    }

}
