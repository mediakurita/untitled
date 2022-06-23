public class Hello {
    public static void main(String[] args) {
        int a = 10;
        int b = 9;

        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println(String.format("a:%2d", a));
        System.out.println(String.format("a:%2d", b));
        System.out.println(String.format("a:%s", b));
        System.out.println(String.format("a:%2d b:%2d", a, b));
    }
}
