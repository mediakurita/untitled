package projava;

public interface Named {
    String name();
    default String greeting(){
        return "‚±‚ñ‚É‚¿‚Í%s‚³‚ñ".formatted(name());
    }
}
