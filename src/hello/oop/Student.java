package hello.oop;

public class Student extends u {//alt+insert 生成构造器

    //this()/super()默认调用两种构造器其一，在第一行，有参构造需要显示定义
    //静态代码块>代码块>方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;
    public void study(){
        System.out.println(this.name + " is op");
    }

    public String getName() {
        return super.name;
    }
}
