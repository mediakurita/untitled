package projava;

public interface Named {
    String name();
    default String greeting(){
        return "こんにちは%sさん".formatted(name());
    }
}
