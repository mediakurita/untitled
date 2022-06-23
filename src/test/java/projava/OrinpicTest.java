package projava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrinpicTest {
    /**
     * �ߑ�I�����s�b�N�J�ÈȑO�̊m�F
     */
    @Test
    void isBeforeStartYear() {
        assertFalse(new Orinpic().isSummerOlympic(1888),"1888");
        assertFalse(new Orinpic().isSummerOlympic(1892),"1892");
        assertFalse(new Orinpic().isSummerOlympic(1895), "1895");
        //����ߑ�I�����s�b�N�J�ÔN
        assertTrue(new Orinpic().isSummerOlympic(1896), "1896");
    }

    /**
     * 4�N�����̈�ʓI�ȊJ�ÔN
     */
    @Test
    void isCommonHeldYear() {
        int[] years = {1900,1920,1964,1936,2000};
        for (int year :
                years) {
            assertTrue(new Orinpic().isSummerOlympic(year), year + "�N");
        }
    }

    /**
     * �S�N��������O����J�ÔN
     */
    @Test
    void isCommonNotHeldYear(){
        int[] years = {1905,1907,1925,1967,2001};
        for (int year :
                years) {
            assertFalse(new Orinpic().isSummerOlympic(year), year + "�N");
        }
    }

    /**
     * �푈�܂��̓p���f�~�b�N�ɂ�蒆�~�ɂȂ����N
     */
    @Test
    void isCancelledYear() {
        int[] years = {1916,1940,1944,2020};
        for (int year :
                years) {
            assertFalse(new Orinpic().isSummerOlympic(year), year + "�N");
        }
    }

    /**
     * ��O�I�ȊJ�ÔN
     */
    void isExtraHeldYear(){
        int[] years = {2021};
        for (int year :
                years) {
            assertTrue(new Orinpic().isSummerOlympic(year), year + "�N");
        }
    }

    /**
     * ���E�l���
     */
    @Test
    void isTooFarFuture() {
        assertDoesNotThrow(() -> new Orinpic().isSummerOlympic(2031));
        assertDoesNotThrow(() -> new Orinpic().isSummerOlympic(2032));
        //�J�Â����肵�Ă���2032�N����͗�O
        assertThrows(IllegalArgumentException.class,
                () -> new Orinpic().isSummerOlympic(2033));
        assertThrows(IllegalArgumentException.class,
                () -> new Orinpic().isSummerOlympic(2052));
    }
}