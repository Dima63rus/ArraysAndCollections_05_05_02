public class Main {
    public static void main(String[] args) {
/*
        1.	�������� ������ ���� float � ������������� 30 ��������� (�� 32 �� 40 ��������).
        2.	�������� ���, ������� ������� ������� ����������� �� �������� � ���������� �������� ��������� (� ������������ �� 36,2 �� 36,9), � ����� ����������� ���� ���������.
        �������� � ��������� ������� �������:
        �	���������� ���������,
        �	����������� � ������������ ����������� ���������,
        �	����������� � ������������ ����������� ��������� �������� ���������.

        ������
        ����������� ���������: 36.7 38.9 34.7
        ������� �����������: 36.76
        ���������� ��������: 1
*/
        final int LC_PATIENTS_CNT = 30;
        final float LC_TEMP_MIN = 32.0f;
        final float LC_TEMP_MAX = 40.0f;

        float[] ltTemp = new float[LC_PATIENTS_CNT];
        int lvHealthyPatient = 0;

        for (int i = 0; i <= LC_PATIENTS_CNT - 1; i++) {
            float lvCurr;
            do {
                lvCurr = (float) Math.random() * 100;
            }
            while (lvCurr < LC_TEMP_MIN || lvCurr > LC_TEMP_MAX);

            //����������� �������
            String lvCurrStr = String.format("%.1f", lvCurr);
            //������ ������� � String
            lvCurrStr = lvCurrStr.replace(',', '.');
            //conv String->float
            lvCurr = Float.parseFloat(lvCurrStr);
            //��������� ������� ��������� �����������
            ltTemp[i] = lvCurr;
            //���-�� �������� ���������
            if (lvCurr > 36.5f && lvCurr < 37.5f) {
                lvHealthyPatient += 1;
            }
        }

        //����� ������� ����������� �� ��������
        //����� ���� �����, �������� �� �� ���-��
        float lvAverageSum = 0.0f; 
            System.out.print("����������� ���������: ");

            for (int j = 0; j < ltTemp.length; j++) {
                lvAverageSum += ltTemp[j];
                System.out.print(ltTemp[j] + " ");
            }

            //��������� float �� 2�� ������
            lvAverageSum = Math.round((lvAverageSum / ltTemp.length) * 100.0);
            lvAverageSum = lvAverageSum / 100;

        System.out.println("\n������� ����������� �� ��������: " + lvAverageSum);
        System.out.println("���-�� �������� ���������: " + lvHealthyPatient);
    }
}