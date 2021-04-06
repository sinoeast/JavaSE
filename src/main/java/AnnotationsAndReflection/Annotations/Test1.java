package AnnotationsAndReflection.Annotations;

import java.util.ArrayList;
import java.util.List;

public class Test1 implements Runnable{
    //重写注解
    @Override
    public void run() {
    }
    //已经过时的注解
    @Deprecated
    public void test(){}

    //镇压警告
    @SuppressWarnings("all")
    public void test02(){
        List list = new ArrayList();
    }

}
