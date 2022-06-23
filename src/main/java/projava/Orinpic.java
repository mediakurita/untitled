package projava;

import java.util.List;

public class Orinpic {
    /**
     * ����œ��͂��ꂽ�N���ċG�ߑ�I�����s�b�N�J�ÔN�����肷��
     * @param year ����N
     * @return �ċG�I�����s�b�N�J�ÔN�Ȃ�true
     * @throws IllegalArgumentException �܂��I�����s�b�N�J�Â��m�肵�Ă��Ȃ�����N�����͂��ꂽ�ꍇ
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
            throw new IllegalArgumentException("2032�N�܂ł��T�|�[�g���Ă��܂��B����:" + year);
        }
        return year % 4 == 0;
    }
}
