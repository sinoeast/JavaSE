package AnnotationsAndReflection.Annotations;


import java.lang.annotation.*;

//测试元注解
@MyAnnotation
public class Test2 {

    //如果没有默认值，必须赋值
    @MyAnnotation(name = "lant")
    public void test(){}

    @MyAnnotation2("lant")
    public void test2(){}

}
@Inherited
@Documented
@Target(value = {ElementType.METHOD,ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation{

    //注解的参数:参数类型+参数名()
    String name() default "";
}

@interface MyAnnotation2{
    //value可以默认
    String value();
}