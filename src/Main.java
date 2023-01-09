import java.util.Locale;

public class Main {
    public static void main(String[] args) {

System.out.println("Задачи 1-2");
    int apples = 45000;
    System.out.println("Значение переменной apples с типом int равно " + apples +".");
    byte pears = 102;
    System.out.println("Значение переменной pears с типом byte равно " + pears + ".");
    short peaches = 2000;
    System.out.println("Значение переменной peaches с типом short равно " + peaches + ".");
    long nuts = 89500L;
    System.out.println("Значение переменной nuts с типом long равно " + nuts + ".");
    float sugar = 2.5f;
    System.out.println("Значение переменной sugar с типом float равно " + sugar + ".");
    double salt = 25.125;
    System.out.println("Значение переменной salt с типом double равно " + salt + ".");

    int A = 27897;
    System.out.println(A);
    byte B = 67;
    System.out.println(B);
    short C = 569;
    System.out.println(C);
    long D = 987678965549L;
    System.out.println(D);
    float E = 27.12F;
    System.out.println(E);
    double F = 2.786;
    System.out.println(F);
    short G = -159;
    System.out.println(G);

System.out.println("Задача 3");
    byte StudentsLP = 23;
    byte StudentsAS = 27;
    byte StudentsEA = 30;
    short totalPaper = 480;
    int ForEachStudent = totalPaper/(StudentsLP+StudentsAS+StudentsEA);
    System.out.println("На каждого ученика рассчитано " + ForEachStudent + " листов бумаги.");

System.out.println("Задача 4");
    byte MachineProductivityIn2Minutes = 16;
    int MachineProductivityIn1Minutes = MachineProductivityIn2Minutes/2;
    int MachineProductivityIn20Minutes = MachineProductivityIn1Minutes * 20;
    System.out.println("За 20 минут машина произвела " + MachineProductivityIn20Minutes + " штук бутылок.");
    int NumberOfMinutesInADay = 24 * 60;
    int MachineProductivityPerDay = MachineProductivityIn1Minutes * NumberOfMinutesInADay;
    System.out.println("За сутки машина произвела " + MachineProductivityPerDay + " штук бутылок.");
    int MachineProductivityIn3Days = MachineProductivityPerDay * 3;
    System.out.println("За 3 дня машина произвела " + MachineProductivityIn3Days + " штук бутылок.");
    int MachineProductivityIn1Month = MachineProductivityPerDay * 30;
    System.out.println("За месяц машина произвела " + MachineProductivityIn1Month + " штук бутылок.");

System.out.println("Задача 5");
    byte totalOfPaintCans = 120;
    byte forOneClassroomOfBrownPaint = 4;
    byte forOneClassroomOfWhitePaint = 2;
    int forOneClassroomOfTotalOfPaintCans = forOneClassroomOfBrownPaint + forOneClassroomOfWhitePaint;
    int totalClassrooms = totalOfPaintCans/forOneClassroomOfTotalOfPaintCans;
    int forAllClassroomsOfBrownPaint = totalClassrooms * forOneClassroomOfBrownPaint;
    int forAllClassroomsOfWhitePaint = totalClassrooms * forOneClassroomOfWhitePaint;
    System.out.println("В школе где " + totalClassrooms + " классов, нужно " + forAllClassroomsOfWhitePaint +
            " банок белой краски и " + forAllClassroomsOfBrownPaint + " банок коричней краски.");

System.out.println("Задача 6");
    byte bananas = 5;
    byte bananaWeight = 80;
    short weight100MlMilk = 105;
    byte iceCream = 2;
    byte iceCreamWeight = 100;
    byte eggs = 4;
    byte weightEgg = 70;
    int totalWeightBananas = bananas * bananaWeight;
    int milk200Ml = weight100MlMilk * 2;
    int totalWeightIceCream = iceCream * iceCreamWeight;
    int totalWeightEggs = eggs * weightEgg;
    int totalBreakfastWeight = totalWeightEggs + totalWeightBananas + milk200Ml + totalWeightIceCream;
    System.out.println("Вес спортивного завтрака в граммах равен " + totalBreakfastWeight +".");
    float totalBreakfastWeightKg = totalBreakfastWeight/1000f;
    System.out.println("Вес спортивного завтрака в килограммах равен " + totalBreakfastWeightKg + ".");

System.out.println("Задача 7");
    short needToLoseWeight = 7;
    int needToLoseWeightGramm = needToLoseWeight * 1000;
    System.out.println("7 кг = " + needToLoseWeightGramm + " г");
    short weightLossPerDayFirstOption = 250;
    short weightLossPerDaySecondOption = 500;
    int weightLossDays250G = needToLoseWeightGramm/weightLossPerDayFirstOption;
    System.out.println("При потере в весе 250г в день на похудение потребуется " + weightLossDays250G + " дней.");
    int weightLossDays500G = needToLoseWeightGramm/weightLossPerDaySecondOption;
    System.out.println("При потере в весе 500г в день на похудение потребуется " + weightLossDays500G + " дней.");
    double lossWeightPerDayAverage = (weightLossPerDayFirstOption + weightLossPerDaySecondOption)/2D;
    double theAverageAmountOfTimeSpent = (double) needToLoseWeightGramm/lossWeightPerDayAverage;
    System.out.printf(Locale.US,"В среднем, чтобы похудеть на 7 кг потребуется %.2f" + " дней.%n", theAverageAmountOfTimeSpent);

System.out.println("Задача 8");
    int MashaSalary = 67760;
    int MashaSalaryAfterPromotion = (MashaSalary/100*10) + MashaSalary;
    System.out.println("После повышения на 10%, зарплата Маши составила " + MashaSalaryAfterPromotion + " рублей в месяц.");
    int MashaAnnualIncomeBeforeSalaryIncrease = MashaSalary * 12;
    System.out.println("Годовой доход Маши до повышения зарплаты составлял " + MashaAnnualIncomeBeforeSalaryIncrease + " рублей.");
    int MashaAnnualIncomeAfterSalaryIncrease = MashaSalaryAfterPromotion * 12;
    System.out.println("Годовой доход Маши после повышения зарплаты составил " + MashaAnnualIncomeAfterSalaryIncrease + " рублей.");
    int TheDifferenceBetweenTheAnnualIncomeOfMasha = MashaAnnualIncomeAfterSalaryIncrease - MashaAnnualIncomeBeforeSalaryIncrease;
    System.out.println("Разница годовых доходов Маши до и после повышения зарплаты составила " + TheDifferenceBetweenTheAnnualIncomeOfMasha + ".");
    int DenisSalary = 83690;
    int DenisSalaryAfterPromotion = (DenisSalary/100*10) + DenisSalary;
    System.out.println("После повышения на 10%, зарплата Дениса составила " + DenisSalaryAfterPromotion + " рублей в месяц.");
    int DenisAnnualIncomeBeforeSalaryIncrease = DenisSalary * 12;
    System.out.println("Годовой доход Дениса до повышения зарплаты составлял " + DenisAnnualIncomeBeforeSalaryIncrease + " рублей.");
    int DenisAnnualIncomeAfterSalaryIncrease = DenisSalaryAfterPromotion * 12;
    System.out.println("Годовой доход Дениса после повышения зарплаты составил " + DenisAnnualIncomeAfterSalaryIncrease + " рублей.");
    int TheDifferenceBetweenTheAnnualIncomeOfDenis = DenisAnnualIncomeAfterSalaryIncrease - DenisAnnualIncomeBeforeSalaryIncrease;
    System.out.println("Разница годовых доходов Дениса до и после повышения зарплаты составила " + TheDifferenceBetweenTheAnnualIncomeOfDenis + ".");
    int ChristinaSalary = 76230;
    int ChristinaSalaryAfterPromotion = (ChristinaSalary/100*10) + ChristinaSalary;
    System.out.println("После повышения на 10%, зарплата Кристины составила " + ChristinaSalaryAfterPromotion + " рублей в месяц.");
    int ChristinaAnnualIncomeBeforeSalaryIncrease = ChristinaSalary * 12;
    System.out.println("Годовой доход Кристины до повышения зарплаты составлял " + ChristinaAnnualIncomeBeforeSalaryIncrease + " рублей.");
    int ChristinaAnnualIncomeAfterSalaryIncrease = ChristinaSalaryAfterPromotion * 12;
    System.out.println("Годовой доход Кристины после повышения зарплаты составил " + ChristinaAnnualIncomeAfterSalaryIncrease + " рублей.");
    int TheDifferenceBetweenTheAnnualIncomeOfChristina = ChristinaAnnualIncomeAfterSalaryIncrease - ChristinaAnnualIncomeBeforeSalaryIncrease;
    System.out.println("Разница годовых доходов Кристины до и после повышения зарплаты составила " + TheDifferenceBetweenTheAnnualIncomeOfChristina + ".");}
}