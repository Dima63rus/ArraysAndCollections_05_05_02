public class Main {
    public static void main(String[] args) {
/*
        1.	Создайте массив типа float с температурами 30 пациентов (от 32 до 40 градусов).
        2.	Напишите код, который выводит среднюю температуру по больнице и количество здоровых пациентов (с температурой от 36,2 до 36,9), а также температуры всех пациентов.
        Вынесите в константы условия задания:
        •	количество пациентов,
        •	минимальная и максимальная температура пациентов,
        •	минимальная и максимальная температура диапазона здоровых пациентов.

        Пример
        Температуры пациентов: 36.7 38.9 34.7
        Средняя температура: 36.76
        Количество здоровых: 1
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

            //Температура найдена
            String lvCurrStr = String.format("%.1f", lvCurr);
            //Замена символа в String
            lvCurrStr = lvCurrStr.replace(',', '.');
            //conv String->float
            lvCurr = Float.parseFloat(lvCurrStr);
            //Присвоить массиву хаотичную температуру
            ltTemp[i] = lvCurr;
            //Кол-во здоровых пациентов
            if (lvCurr > 36.5f && lvCurr < 37.5f) {
                lvHealthyPatient += 1;
            }
        }

        //Найти среднюю температуру по больнице
        //Сумма всех чисел, деленная на их кол-во
        float lvAverageSum = 0.0f;
            System.out.print("Температуры пациентов: ");

            for (int j = 0; j < ltTemp.length; j++) {
                lvAverageSum += ltTemp[j];
                System.out.print(ltTemp[j] + " ");
            }

            //Округлить float до 2ух знаков
            lvAverageSum = Math.round((lvAverageSum / ltTemp.length) * 100.0);
            lvAverageSum = lvAverageSum / 100;

        System.out.println("\nСредняя температура по больнице: " + lvAverageSum);
        System.out.println("Кол-во здоровых пациентов: " + lvHealthyPatient);
    }
}