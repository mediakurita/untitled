package projava;

public class Orinpic {
    /**
     * ����œ��͂��ꂽ�N���ċG�ߑ�I�����s�b�N�J�ÔN�����肷��
     * @param year ����N
     * @return �ċG�I�����s�b�N�J�ÔN�Ȃ�true
     * @throws IllegalArgumentException �܂��I�����s�b�N�J�Â��m�肵�Ă��Ȃ�����N�����͂��ꂽ�ꍇ
     */
    public boolean isSummerOlympic(int year) throws IllegalArgumentException {
        if (2032<year) {
            throw new IllegalArgumentException("2032�N�܂ł��T�|�[�g���Ă��܂��B����:" + year);
        }
        return year % 4 == 0;
    }
}
