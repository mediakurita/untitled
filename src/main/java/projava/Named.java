package projava;

public interface Named {
    String name();
    default String greeting(){
        return "����ɂ���%s����".formatted(name());
    }
}
