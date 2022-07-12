public class Main {
    public static void main(String[] args) {
        // Задание 1
        int dog = 7; // возраст собаки
        byte cat = 1;
        short cow = 10;
        long day = 365L;
        double sugarWeight = 1.48;
        float saltWeight = 1.6f;
        boolean dogIsAdult = dog > 10;
        char a = 42;

        // Задание 2
        double firstBoxerWeight = 78.2;
        double secondBoxerWeight = 82.7;
        double totalWeight = firstBoxerWeight + secondBoxerWeight;
        double weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Общий вес двух бойцов = " + totalWeight);
        System.out.println("Разница между весами бойцов = " + weightDifference);

        // Задание 3
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int icecream = 2 * 100;
        int eggs = 4 * 70;
        int weightGrams = bananas + milk + icecream + eggs;
        System.out.println("Количество спорт-завтрака в граммах = " + weightGrams);
        double weightInKg = weightGrams * 0.001;
        System.out.println("Количество спорт-завтрака в кг = " + weightInKg);

        //Задание 4
        // 1 Вариант - без остатка
        int weightToLoseKg = 7;
        int firstOptionGr = 250;
        int secondOptionGr = 500;
        int weightToLoseGr = weightToLoseKg * 1000;
        int daysFirstOption = weightToLoseGr / firstOptionGr;
        int daysSecondOption = weightToLoseGr / secondOptionGr;
        int averageDays = (daysFirstOption + daysSecondOption) / 2;
        System.out.println(daysFirstOption + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм.");
        System.out.println(daysSecondOption + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм.");
        System.out.println(averageDays + " день потребуется в среднем, чтобы добиться результата похдения.");

        // 2 вариант - с остатком
        int averageLoseGr = (250 + 500) / 2; // возьмем среднее знчение грамм
        int daysToLoseWeight = weightToLoseGr / averageLoseGr; // количество дней на потерю веса
        int lostWeight = averageLoseGr * daysToLoseWeight;
        int lastGr = weightToLoseGr % averageLoseGr; // остаток до достижения цели
        int NewDaysToLoseWeight = daysToLoseWeight + 1; // новое количество дней с учетом остатка
        System.out.println(lostWeight + " кг сбросит спортсмен за " + daysToLoseWeight + " дней.");
        System.out.println(lastGr + " грамм останется сбросить спортсмену для достижения цели.");
        System.out.println(NewDaysToLoseWeight + " дней потребуется спортсмену, чтобы сбросить 7 кг.");




        //Задание 5
        // значения до повышения на 10 %
        int mashaSalaryPerMonth = 67_760;
        int denisSalaryPerMonth = 83_690;
        int kristinaSalaryPerMonth = 76_230;
        int mashaSalaryPerYear = mashaSalaryPerMonth * 12;
        int denisSalaryPerYear = denisSalaryPerMonth * 12;
        int kristinaSalaryPerYear = kristinaSalaryPerMonth * 12;

        // значения с учетом увеличения на 10 %
        double mashaSalaryGrowth = mashaSalaryPerMonth * 0.1;
        double denisSalaryGrowth = denisSalaryPerMonth * 0.1;
        double kristinaSalaryGrowth = kristinaSalaryPerMonth * 0.1;
        double newMashaSalaryPerMonth = mashaSalaryPerMonth + mashaSalaryGrowth;
        double newDenisSalaryPerMonth = denisSalaryPerMonth + denisSalaryGrowth;
        double newKristinaSalaryPerMonth = kristinaSalaryPerMonth + kristinaSalaryGrowth;
        double newMashaSalaryPerYear = newMashaSalaryPerMonth * 12;
        double newDenisSalaryPerYear = newDenisSalaryPerMonth * 12;
        double newKristinaSalaryPerYear = newKristinaSalaryPerMonth * 12;
        double annualDifferenceInMashaSalary = newMashaSalaryPerYear - mashaSalaryPerYear;
        double annualDifferenceInDenisSalary = newDenisSalaryPerYear - denisSalaryPerYear;
        double annualDifferenceInKristinaSalary = newKristinaSalaryPerYear - kristinaSalaryPerYear;
        System.out.println("Маша теперь получает в месяц " + newMashaSalaryPerMonth + " рублей. Годовой доход вырос на " + annualDifferenceInMashaSalary + " рублей.");
        System.out.println("Денис теперь получает в месяц " + newDenisSalaryPerMonth + " рублей. Годовой доход вырос на " + annualDifferenceInDenisSalary + " рублей.");
        System.out.println("Кристина теперь получает в месяц " + newKristinaSalaryPerMonth + " рублей. Годовой доход вырос на " + annualDifferenceInKristinaSalary + " рублей.");





    }
}