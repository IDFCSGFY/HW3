public class Main {
    public static void main(String[] args) {
        //1
        System.out.println("#1");
        byte varByte = 120;
        System.out.println("Значение переменной varByte с типом byte равно " + varByte);
        short varShort = 32000;
        System.out.println("Значение переменной varShort с типом short равно " + varShort);
        int varInt = 2147000000;
        System.out.println("Значение переменной varInt с типом int равно " + varInt);
        long varLong = 9000999000999000999L;
        System.out.println("Значение переменной varLong с типом long равно " + varLong);
        float varFloat = 0.1234f;
        System.out.println("Значение переменной varFloat с типом float равно " + varFloat);
        double varDouble = 0.0123456789;
        System.out.println("Значение переменной varDouble с типом double равно " + varDouble);

        //2
        System.out.println("#2");
        varFloat = 27.12f;
        System.out.println(varFloat);
        varLong = 987678965549L;
        System.out.println(varLong);
        varDouble = 2.786;
        System.out.println(varDouble);
        varShort = 569;
        System.out.println(varShort);
        short varShort1 = -159; //типов шесть, а значений в задании дано семь, поэтому еще одна переменная
        System.out.println(varShort1);
        varInt = 27897;
        System.out.println(varInt);
        varByte = 67;
        System.out.println(varByte);

        //3
        System.out.println("#3");
        byte sumOfStudents = 23 + 27 + 30;
        int papersPerStudent = 480 / sumOfStudents;
        System.out.println("На каждого ученика рассчитано " + papersPerStudent + " листов бумаги");

        //4
        System.out.println("#4");
        int bottlesIn20Min = 16 * (20 / 2);
        System.out.println("За 20 минут машина произвела " + bottlesIn20Min + " штук бутылок");
        int bottlesIn1Day = 16 * (24 * 60 / 2);
        System.out.println("За 1 сутки машина произвела " + bottlesIn1Day + " штук бутылок");
        int bottlesIn3Days = 16 * (3 * 24 * 60 / 2);
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок");
        int bottlesIn1Month = 16 * (30 * 24 * 60 / 2);
        System.out.println("За 1 месяц машина произвела " + bottlesIn1Month + " штук бутылок");

        //5
        System.out.println("#5");
        byte classes = (byte) 120 / 6;
        byte whitePaint = (byte) (classes * 2);
        byte brownPaint = (byte) (classes * 4);
        System.out.println("В школе, где " + classes + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

        //6
        System.out.println("#6");
        int breakfastInGrams = 5 * 80 + 2 * 105 + 2 * 100 + 4 * 70;
        System.out.println("Завтрак составляет " + breakfastInGrams + " грамм, в килограммах это " + (float) breakfastInGrams / 1000);

        //7
        System.out.println("#7");
        short weightToLose = 7 * 1000;
        short daysIf250 = (short) (weightToLose / 250);
        short daysIf500 = (short) (weightToLose / 500);
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то на похудение уйдет " + daysIf250 + " дней, а если 500 грамм, то " + daysIf500);
        System.out.println("В среднем потребуется " + ((daysIf250 + daysIf500) / 2) + " день");

        //8
        System.out.println("#8");
        int salaryMasha = (int) (67760 * 1.10);
        int salaryDenis = (int) (83690 * 1.10);
        int salaryKris = (int) (76230 * 1.10);
        int difMasha = (int) (salaryMasha - 67760) * 12;
        int difDenis = (int) (salaryDenis - 83690) * 12;
        int difKris = (int) (salaryKris - 76230) * 12;
        System.out.println("Маша теперь получает " + salaryMasha + " рублей. Годовой доход вырос на " + difMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryDenis + " рублей. Годовой доход вырос на " + difDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryKris + " рублей. Годовой доход вырос на " + difKris + " рублей");
    }
}