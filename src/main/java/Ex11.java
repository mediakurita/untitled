public class Ex11 {
    public static void main(String[] args) {
        Ex11 ex = new Ex11();

        int n1 = 2;
        int n2 = 4;
        int n3 = 5;

        System.out.println(ex.bdl(n1));
        System.out.println(ex.triple(n1));
        ex.call2(""+n1);
        System.out.println(ex.max2(n1,n2));
        System.out.println(ex.max3(n1,n2,n3));
    }

    int bdl(int n){
        return n*2;
    }

    int triple(int n){
        return n*3;
    }

    void call2(String str){
        for (int i = 0; i < 2; i++) {
            System.out.print(str);
        }
        System.out.println();
    }

    int max2(int n1,int n2){
        int max = n1;
        if(n1<n2) max = n2;
        return max;
    }

    int max3(int n1, int n2, int n3){
        return max2(max2(n1,n2),n3);
    }
}
