package projava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrinpicTest {
    /**
     * 近代オリンピック開催以前の確認
     */
    @Test
    void isBeforeStartYear() {
        assertFalse(new Orinpic().isSummerOlympic(1888),"1888");
        assertFalse(new Orinpic().isSummerOlympic(1892),"1892");
        assertFalse(new Orinpic().isSummerOlympic(1895), "1895");
        //初回近代オリンピック開催年
        assertTrue(new Orinpic().isSummerOlympic(1896), "1896");
    }

    /**
     * 4年周期の一般的な開催年
     */
    @Test
    void isCommonHeldYear() {
        int[] years = {1900,1920,1964,1936,2000};
        for (int year :
                years) {
            assertTrue(new Orinpic().isSummerOlympic(year), year + "年");
        }
    }

    /**
     * ４年周期から外れる非開催年
     */
    @Test
    void isCommonNotHeldYear(){
        int[] years = {1905,1907,1925,1967,2001};
        for (int year :
                years) {
            assertFalse(new Orinpic().isSummerOlympic(year), year + "年");
        }
    }

    /**
     * 戦争またはパンデミックにより中止になった年
     */
    @Test
    void isCancelledYear() {
        int[] years = {1916,1940,1944,2020};
        for (int year :
                years) {
            assertFalse(new Orinpic().isSummerOlympic(year), year + "年");
        }
    }

    /**
     * 例外的な開催年
     */
    void isExtraHeldYear(){
        int[] years = {2021};
        for (int year :
                years) {
            assertTrue(new Orinpic().isSummerOlympic(year), year + "年");
        }
    }

    /**
     * 境界値上限
     */
    @Test
    void isTooFarFuture() {
        assertDoesNotThrow(() -> new Orinpic().isSummerOlympic(2031));
        assertDoesNotThrow(() -> new Orinpic().isSummerOlympic(2032));
        //開催が決定している2032年より後は例外
        assertThrows(IllegalArgumentException.class,
                () -> new Orinpic().isSummerOlympic(2033));
        assertThrows(IllegalArgumentException.class,
                () -> new Orinpic().isSummerOlympic(2052));
    }
}