package hello.oop;

import lib.base_lib;
import lib.td;
import lib.td2;
import lib.td3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class app {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Student xiaoming = new Student("xiaoming", 18);
        xiaoming.study();
        System.out.println(xiaoming.getName());;
        xiaoming.fuck();
        pet dog = new pet();
        dog.shout();

        /*
        抽象类,不可以实例化,有未实现方法的类依然是抽象类
        abstract class Person{
            public abstract void run();
        }
        全部是抽象函数则是接口,接口也可以继承接口
        inerface Person {
            void run();
            String getName();
            (public static final)int MALE = 1;
            default void run(){
                ...
            }
        }
        class S implements Person, Hello {
            ...
        }
         */
        Outer outer = new Outer("cj");
        Outer.Inner inner = outer.new Inner();
        inner.hello();
        base_lib hello = new base_lib();
        hello.func();

        td td = new td();//继承thread
        //td.run();线程执行完了再执行
        td.start();//并行运行

        new Thread(new td2()).start();//继承runnable
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t d 2");
            }
        });//匿名内部类
        new Thread(()-> System.out.println("t d 2")).start();//lambda代替匿名内部类

        td3 t1 = new td3();//继承callable，线程池
        td3 t2 = new td3();
        td3 t3 = new td3();
        ExecutorService ser = Executors.newFixedThreadPool(3);
        Future<Boolean>r1 = ser.submit(t1);
        Future<Boolean>r2 = ser.submit(t2);
        Future<Boolean>r3 = ser.submit(t3);
        Boolean re1 = r1.get();
        Boolean re2 = r2.get();
        Boolean re3 = r3.get();
        ser.shutdownNow();
        System.out.println("h w");



    }
}

class Outer {//嵌套类
    private String name;
    Outer(String name){
        this.name = name;
    }

    class Inner {
        void hello() {
            System.out.println("hello,"+Outer.this.name);
        }
    }

//    void asyncHello() {//匿名类
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello, " + Outer.this.name);
//            }
//        };
//        new Thread(r).start();
}
//泛型没有静态方法，但是有静态泛型方法
//public static ob<T> func(T a, T b);
//Pair<String, Integar>p = new Pair<>("test", 123);
//T不能是基础类型，所有类型T都是基于类的
//使用Pair<? entends Number>，Pair<? super Integar>可以临时使用类型的继承

