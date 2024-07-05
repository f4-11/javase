package lib;

//静态代理设计模式 very important
interface Hello{
    void Helloworld();
}

class u implements Hello{
    @Override
    public void Helloworld() {
        System.out.println("hw1");
    }
}

class proxy implements Hello{
    private Hello target;

    proxy(Hello target) {
        this.target = target;
    }

    @Override
    public void Helloworld() {
        before();
        this.target.Helloworld();
        after();
    }
    private void before(){
        System.out.println("before");
    }
    private void after(){
        System.out.println("after");
    }
}
