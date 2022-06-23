package projava;

import java.util.List;

public class Orinpic {
    /**
     * 西暦で入力された年が夏季近代オリンピック開催年か判定する
     * @param year 西暦年
     * @return 夏季オリンピック開催年ならtrue
     * @throws IllegalArgumentException まだオリンピック開催か確定していない西暦年が入力された場合
     */
    public boolean isSummerOlympic(int year) throws IllegalArgumentException {
        List<Integer> canselled = List.of(1916,1940,1944,2020);
        if (year<1896) {
            return false;
        }
        if (canselled.contains((Integer) year)) {
            return false;
        }
        if (year==2021) {
            return true;
        }
        if (2032<year) {
            throw new IllegalArgumentException("2032年までをサポートしています。入力:" + year);
        }
        return year % 4 == 0;
    }
}
