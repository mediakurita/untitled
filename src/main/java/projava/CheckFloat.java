package projava;

public class CheckFloat {
    enum FloatState{
        START,MINUS, INT, FRAC_START, FRAC, ZERO, MINUS_ZERO, FRAC_END_ZERO
    }

    public static void main(String[] args) {
        System.out.println(check(""));
        System.out.println(check("-1-2"));
        System.out.println(check(".12"));
        System.out.println(check("1.2.3"));
        System.out.println(check("1..3"));
        System.out.println(check("0"));
        System.out.println(check("-0"));
        System.out.println(check("-12"));
        System.out.println(check("12.3"));
        System.out.println(check("0.3"));
        System.out.println(check("-0.3"));
        System.out.println(check("12.30"));
    }

    static boolean check(String data){
        var state = FloatState.START;
        for (char ch: data.toCharArray()){
            switch (state){
                case START -> {
                    if (ch == '-'){
                        state = FloatState.MINUS;
                    }else if (ch == '0'){
                        state = FloatState.ZERO;
                    } else if (ch >= '1' && ch <= '9') {
                        state = FloatState.INT;
                    }else {
                        return false;
                    }
                }
                case MINUS -> {
                    if (ch == '0'){
                        state = FloatState.MINUS_ZERO;
                    } else if (ch >= '1' && ch <= '9') {
                        state = FloatState.INT;
                    }else {
                        return false;
                    }
                }
                case ZERO,MINUS_ZERO -> {
                    if (ch == '.'){
                        state = FloatState.FRAC_START;
                    }else {
                        return false;
                    }
                }
                case INT -> {
                    if (ch >= '0' && ch <= '9') {
                        state = FloatState.INT;
                    }else if (ch == '.'){
                        state = FloatState.FRAC_START;
                    }else {
                        return false;
                    }
                }
                case FRAC,FRAC_START,FRAC_END_ZERO ->{
                    if (ch == '0') {
                        state = FloatState.FRAC_END_ZERO;
                    }else if (ch >= '1' && ch <= '9'){
                        state = FloatState.FRAC;
                    }else {
                        return false;
                    }
                }
            }
        }
        return switch (state){
            case INT,ZERO,FRAC -> true;
            default -> false;
        };
    }
}
