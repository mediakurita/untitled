package projava;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Listing {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("");

        List list = arr1;
        list.add(1);
        list.add("1");

        System.out.println(list.getClass());

        System.out.println(arr1);
//        System.out.println(arr1.get(0));
    }
}
