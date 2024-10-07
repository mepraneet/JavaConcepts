package stream_api;

import java.util.stream.Stream;

public class StreamObj {

    public static void main(String[] args) {

        String name[]={"Pranit","Mukta","Aai","Baba","Pinkytai"};

        Stream<String> name1 = Stream.of(name);

        name1.forEach(str->{
            System.out.println(str);
        });

    }
}
