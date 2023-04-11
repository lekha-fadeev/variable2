public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte A = 67;
        short B = 569;
        int C = 27897;
        long D = 987678965549L;
        float E = 27.12F;
        double F = 2.786;
        System.out.println("Значение переменной A с типом byte равно " + A);
        System.out.println("Значение переменной B с типом short равно " + B);
        System.out.println("Значение переменной C с типом int равно " + C);
        System.out.println("Значение переменной D с типом long равно " + D);
        System.out.println("Значение переменной E с типом float равно " + E);
        System.out.println("Значение переменной F с типом double равно " + F);
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte A = 67;
        short B = 569;
        short B1 = 27897;
        short B2 = -159;
        long D = 987678965549L;
        float E = 27.12F;
        float E1 = 2.786F;
        System.out.println("Значение переменной A с типом byte равно " + A);
        System.out.println("Значение переменной B с типом short равно " + B);
        System.out.println("Значение переменной B1 с типом short равно " + B1);
        System.out.println("Значение переменной B2 с типом short равно " + B2);
        System.out.println("Значение переменной D с типом long равно " + D);
        System.out.println("Значение переменной E с типом float равно " + E);
        System.out.println("Значение переменной E1 с типом float равно " + E1);
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte studentsLyudmila = 23;
        byte studentsAnna = 27;
        byte studentsCatherine = 30;
        int totalStudents = studentsLyudmila + studentsAnna + studentsCatherine;
        short paperSheet = 480;
        System.out.println("На каждого ученика рассчитано " + paperSheet/totalStudents + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte machinePerformance = 16;
        byte productivityInTwoMinutes = 2;
        int productivityInTwentyMinutes = machinePerformance / productivityInTwoMinutes * 20;
        int productivityPerDay = machinePerformance / productivityInTwoMinutes * 1440;
        int productivityInThreeDays = machinePerformance / productivityInTwoMinutes * 4320;
        int monthlyPerformance = machinePerformance / productivityInTwoMinutes * 43200;
        System.out.println("За 20 минут, машина произвела " + productivityInTwentyMinutes + " штук бутылок");
        System.out.println("За сутки, машина произвела " + productivityPerDay + " штук бутылок");
        System.out.println("За 3 дня, машина произвела " + productivityInThreeDays + " штук бутылок");
        System.out.println("За 1 месяц, машина произвела " + monthlyPerformance + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte whitePaint = 2;
        byte brownPaint = 4;
        byte totalPaint = 120;
        int totalClasses = totalPaint/(whitePaint + brownPaint);
        int totalWhitePaint = totalClasses * whitePaint;
        int totalBrownPaint = totalClasses * brownPaint;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte massIceCream = 100;
        byte eggWeight = 70;
        int weightOfBananas = bananaWeight * 5;
        int totalMilkWeight = milkWeight * 2;
        int massOfIceCream = massIceCream * 2;
        int weightOfAllEggs = eggWeight * 4;
        int breakfastWeight = weightOfBananas + totalMilkWeight + massOfIceCream + weightOfAllEggs;
        System.out.println("Вес такого спортзавтрака " + breakfastWeight  + " граммов");
        float kilogramOfBreakfast = breakfastWeight / 1000F;
        System.out.println("Вес такого спортзавтрака " + kilogramOfBreakfast  + " килограмм");
    }

    public static void task7() {
        System.out.println("Задача 7");
        float rationFirst = 0.25F;
        float secondRation = 0.5F;
        float averageDiet = (secondRation - rationFirst) / 2F + rationFirst;
        System.out.println( 7 / rationFirst +  " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println( 7 / secondRation +  " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
        System.out.println( 7 / averageDiet +  " дней уйдет на похудение, если спортсмен будет терять каждый день по 375 грамм");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int Masha = 67760;
        int Denis = 83690;
        int Christina = 76230;
        int annuallyMasha = Masha * 12;
        int annuallyDenis = Denis * 12;
        int annuallyChristina = Christina * 12;
        int newAnnuallyMasha = annuallyMasha + 81312;
        int newAnnuallyDenis = annuallyDenis + 100428;
        int newAnnuallyChristina = annuallyChristina + 91476;
        System.out.println("Маша теперь получает " + newAnnuallyMasha +  " рублей в год. Годовой доход вырос на " + 81312 + " рублей");
        System.out.println("Денис теперь получает " + newAnnuallyDenis +  " рублей в год. Годовой доход вырос на " + 100428 + " рублей");
        System.out.println("Кристина теперь получает " + newAnnuallyChristina +  " рублей в год. Годовой доход вырос на " + 91476 + " рублей");
    }
}
