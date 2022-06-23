package projava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckFloat2 {
    enum FloatState{
        START,MINUS, INT, FRAC_START, FRAC, ZERO, MINUS_ZERO, FRAC_END_ZERO
    }

    static Pattern pat = Pattern.compile("(0|-?[1-9][0-9]*)(\\.[0-9]*[1-9])?|-0\\.[0-9]*[1-9]");

    public static void main(String[] args) {
        System.out.println("" + ":" + check(""));
        System.out.println("-1-2" + ":" + check("-1-2"));
        System.out.println(".12" + ":" + check(".12"));
        System.out.println("1.2.3" + ":" + check("1.2.3"));
        System.out.println("1..3" + ":" + check("1..3"));
        System.out.println("0" + ":" + check("0"));
        System.out.println("-0" + ":" + check("-0"));
        System.out.println("-12" + ":" + check("-12"));
        System.out.println("12.3" + ":" + check("12.3"));
        System.out.println("0.3" + ":" + check("0.3"));
        System.out.println("-0.3" + ":" + check("-0.3"));
        System.out.println("12.30" + ":" + check("12.30"));
    }

    static boolean check(String data){
        Matcher mat = pat.matcher(data);
        return mat.matches();
    }
}
