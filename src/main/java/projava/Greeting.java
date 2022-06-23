package projava;

import java.util.stream.IntStream;

public class Greeting {
    public static void main(String[] args) {
        hi();
        salution("a");
        hellohello(3);
    }
    static void hi(){
        System.out.println("Hi!");
    }

    static void salution(String person){
        System.out.println("Hello " + person);
    }

    static void hellohello(int count){
        IntStream.rangeClosed(1,count).forEach(i-> System.out.print("hello"));
    }
}
