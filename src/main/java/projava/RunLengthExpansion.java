package projava;

import java.util.stream.IntStream;

public class RunLengthExpansion {
    public static void main(String[] args) {
        var data = "ab0c1ba2bc9cd1";

        char prev = 0;
        var builder = new StringBuilder();
        for (var ch :
                data.toCharArray()) {
            if (prev!=0 && (ch>='0'&&ch<='9')){
                for (int i = 0; i < (int) (ch-'0'); i++) {
                    builder.append(prev);
                }
                builder.append(prev);
            }else{
                builder.append(ch);
                prev = ch;
            }
        }

        var result = builder.toString();
        System.out.println(data);
        System.out.println(result);
    }
}
