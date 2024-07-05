package lib;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class base_lib{
    //集合类Collection
    //Hashable,Vector,Stack,Enumration<E>被淘汰，不应该继续使用
    public void func(){
        List<String> list = List.of("hello","world");
//        list.add("HELLO");
//        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
//            String s = it.next();
//            System.out.println(s);
//        }
        for(String s:list){
            System.out.println(s);
        }
    }
}


