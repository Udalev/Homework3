public class Main {
    public static void main(String[] args)
    {
        System.out.println("Задача 1");
        int a = 10;
        byte b = 90;
        short c = -8;
        long d = 7567890;
        float i = 6.55f;
        double f = -5.1;

        System.out.println("Значение переменной с типом int равно " +a);
        System.out.println("Значение переменной с типом dyte равно " +b);
        System.out.println("Значение переменной с типом short равно " +c);
        System.out.println("Значение переменной с типом long равно " +d);
        System.out.println("Значение переменной с типом float равно " +i);
        System.out.println("Значение переменной с типом double равно " +f);

        System.out.println ();
        System.out.println("Задача 2");
        float one = 27.12f;
        long two = 987678965549L;
        double three = 27.86d;
        int  four = 569;
        int  five = 569;
        short six = -159;
        int seven = 27897;
        byte eight = 67;

        System.out.println ();
        System.out.println("Задача 3");

        int LP = 23, AS = 27, EA = 30, totalPaper = 480;
        int totalStudent = LP + AS + EA;
        int paperStudent = totalPaper / totalStudent;
        System.out.println ("На каждого ученика рассчитано "+paperStudent+ " листов бумаги");

        System.out.println ();
        System.out.println("Задача 4");

        int time1 = 20;
        int time2 = 1440;
        int time3 = 4320;
        int time4 = 43200;
        short productionOneMinutes = 16/2;
        int productionTwentyMinutes = productionOneMinutes * time1;
        int productionOneDays = productionOneMinutes * time2;
        int productionThreeDays =productionOneMinutes * time3 ;
        long productionOneMonth = productionOneMinutes * time4;

        System.out.println ("За "+time1+ " машина произвела " +productionTwentyMinutes+ " штук бутылок" );
        System.out.println ("За "+time2+ " машина произвела " +productionOneDays+ " штук бутылок" );
        System.out.println ("За "+time3+ " машина произвела " +productionThreeDays+ " штук бутылок" );
        System.out.println ("За "+time4+ " машина произвела " +productionOneMonth+ " штук бутылок" );

        System.out.println ();
        System.out.println("Задача 5");

        byte totalBottles = 120, whiteBottle = 2, brownBottle = 4;
        int totalClass = totalBottles / (whiteBottle+brownBottle);
        int totalWhite = whiteBottle * totalClass;
        int totalBrow = brownBottle * totalClass;
        System.out.println("В школе,где "+totalClass+ " классов, нужно "+totalWhite+ " банок белой краски и "+totalBrow+" банок коричневой краски ");

        System.out.println ();
        System.out.println("Задача 6");

        int grPerKg = 1000;
        byte totalBanan = 5;
        int totalMilk = 200;
        byte totalIcecream = 2;
        byte totalEgg = 4;
        byte gramBanana = 80, mlMilk = 105, graIicecream = 100, gramEgg = 70;
        int weightFiveBanana = totalBanan * gramBanana;
        int weightMilk = totalMilk * mlMilk;
        int weightIcecream = totalIcecream * graIicecream;
        int weightEgg = totalEgg * gramEgg;
        int totalWeight = weightFiveBanana + weightMilk + weightIcecream + weightEgg;
        System.out.println(totalWeight+" общий вес в граммах");
        float weightKg = totalWeight/(float)grPerKg;
        System.out.println(weightKg + "кг");

        System.out.println ();
        System.out.println("Задача 7");

        int weight = 7;
        float lossInDayMin = (float) 250 / 1000;
        float daysUntilGoalsMin = (int) (weight / lossInDayMin);
        System.out.println("Что бы добиться результата при 250гр потребуется" + daysUntilGoalsMin + " дней" );

        float lossInDayMax = (float) 500 / 1000;
        float daysUntilGoalsMax = (int) (weight / lossInDayMax);
        System.out.println("Что бы добиться результата при 500гр потребуется" + daysUntilGoalsMax + " дней" );

        float average = (int) (daysUntilGoalsMin+daysUntilGoalsMax) / 2;
        System.out.println("Среднее количество " + average + " дней");

        System.out.println ();
        System.out.println("Задача 8");

        int percent = 10;
        int salaryMaria = 67760, salaryDenys = 83690, salaryKristina = 76230;
        int newsalaryMaria = (salaryMaria +(salaryMaria * percent / 100));
        int newsalaryDenys = (salaryDenys +(salaryDenys * percent / 100));
        int newsalaryKristina = (salaryKristina +(salaryKristina * percent / 100));
        System.out.println("Маша теперь получает " + newsalaryMaria + "рублей." + " Годовой доход вырос на " + (newsalaryMaria * 12) + " рублей");
        System.out.println("Денис теперь получает " + newsalaryDenys + "рублей." + " Годовой доход вырос на " + (newsalaryDenys * 12) + " рублей");
        System.out.println("Кристина теперь получает " + newsalaryKristina + "рублей." + " Годовой доход вырос на " + (newsalaryKristina * 12) + " рублей");
















    }
}