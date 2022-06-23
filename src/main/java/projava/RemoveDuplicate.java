package projava;

public class RemoveDuplicate {
    public static void main(String[] args) {
        var data = "abcccbaabcc";

        var builder = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            if (i%2==0) builder.append(ch);
            else builder.insert(i-1,ch);
        }
        var result = builder.toString();
        System.out.println(data);
        System.out.println(result);
    }
}
