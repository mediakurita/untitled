package projava;

public class ToggleString {
    public static void main(String[] args) {
        var data = "aa0bcd1efg1gg0abc";

        var mode = '1';
        var builder = new StringBuilder();
        for (var ch :
                data.toCharArray()) {
            if(ch == '0' || ch=='1'){
                mode = ch;
                continue;
            }
            if(mode=='0') builder.append((char)('A'+ch-'a'));
            else if(mode=='1') builder.append(ch);
            else return;
        }

        var result = builder.toString();
        System.out.println(data);
        System.out.println(result);
    }
}
