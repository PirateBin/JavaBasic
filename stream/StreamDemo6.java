package stream;

import java.util.stream.Stream;

public class StreamDemo6 {
    public static void main(String[] args) {

        //一堆零散数据 , 只能是同一种数据类型

        Stream.of(1,2,3,4,5).forEach(s->System.out.println(s));

        Stream.of("a","b","c","d","123").forEach(s->System.out.println(s));

    }
}
