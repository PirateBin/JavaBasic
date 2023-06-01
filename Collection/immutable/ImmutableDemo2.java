package Collection.immutable;


import java.util.Set;
import java.util.function.Consumer;

public class ImmutableDemo2 {
    public static void main(String[] args) {
        /*
            创建不可变Set集合
         */

        Set<String> set=Set.of("zhangsan","wangwu","lisi","zhaoliu");

        for(String s:set){
            System.out.println(s);
        }

        set.forEach(s->System.out.println(s));

        /*
        set.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

         */

    }
}
