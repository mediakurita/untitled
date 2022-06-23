package projava;

public class SampleFunctionalInterface {
    public static void main(String[] args) {
        message(()->"no name");
    }

    static void message(Named named){
        System.out.println("hello " + named.name());
    }
}
