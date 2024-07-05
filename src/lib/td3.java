package lib;

import java.util.concurrent.Callable;

public class td3 implements Callable<Boolean> {
    @Override
    public Boolean call() throws Exception {
        System.out.println("t d 3");
        return true;
    }
}
