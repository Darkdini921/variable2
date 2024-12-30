public class Main {
    public static void main(String[] args) {


// Задача 1

int i = 200;
byte b = 100;
short s = 1000;
long l = 10000;
float f = 1.1f;
double d = 2.2;

System.out.println("Значение переменной i с типом int равно " + i);
System.out.println("Значение переменной b с типом byte равно " + b);
System.out.println("Значение переменной s с типом short равно " + s);
System.out.println("Значение переменной l с типом long равно " + l);
System.out.println("Значение переменной f с типом float равно " + f);
System.out.println("Значение переменной d с типом double равно " + d);


// Задача 2

float f1 = 27.12f;
long l1 = 987678965549L;
float f2 = 2.76f;
short s1 = 569;
short s2 = -159;
short s3 = 27897;
byte b1 = 67;

// Задача 3

byte teacher1 = 23;
byte teacher2 = 27;
byte teacher3 = 30;
short totalSheets = 480;
short paperSupplies = (short) (totalSheets/(teacher1+teacher2+teacher3));
System.out.println("На каждого ученика рассчитано " + paperSupplies + " листов бумаги");


// Задача 4

byte perMinute = 16 / 2;
short twentyMinutes = (short) (perMinute * 20);
System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок");
short perDay = (short) (perMinute * (60 * 24));
System.out.println("За 1 день машина произвела " + perDay + " штук бутылок");
int threeDays = perDay * 3;
System.out.println("За 3 дня машина произвела " + threeDays + " штук бутылок");
int forDecember = perDay * 31;
System.out.println("За декабрь машина произвела " + forDecember + " штук бутылок");


// Задача 5

int totalPaint = 120;
int whitePaint = 2;
int brownPaint = 4;
int perClass = whitePaint + brownPaint;
int numberOfClasses = totalPaint / perClass;
int whitePaintCans = numberOfClasses * whitePaint;
int brownPaintCans = numberOfClasses * brownPaint;
System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + whitePaintCans + " банок белой краски и " + brownPaintCans + " банок коричневой краски.");


// Задача 6

int bananas = 5 * 80;
int milk = 105 * 2;
int iceCream = 100 * 2;
int eggs = 70 * 4;
float totalWeight = (float) (bananas+milk+iceCream+eggs) /1000;
System.out.println("Итоговая масса напитка будет " + totalWeight + " кг");


// Задача 7

int if250 = 1000/250;
int if500 = 1000/500;
System.out.println("Если спортсвен будет терять по 250 грамм, то это займёт " + if250 + " дня, а если по 500, то " + if500 + " дня");


// Задача 8

int payDayM = 67760;
int payDayD = 83690;
int payDayK = 76230;
int newPayDayM = (int) (payDayM + (payDayM * 0.1));
int newPayDayD = (int) (payDayD + (payDayD * 0.1));
int newPayDayK = (int) (payDayK + (payDayK * 0.1));
int incomeM = (newPayDayM * 12) - (payDayM * 12);    // я слишком поздно понял что можно сделать просто (payDayM * 0.1)*12, по этому решил уже продолжать так.
int incomeD = (newPayDayD * 12) - (payDayD * 12);
int incomeK = (newPayDayK * 12) - (payDayK * 12);

System.out.println("Маша теперь получает "+ newPayDayM +" рублей. Годовой доход вырос на " + incomeM + " рублей.");
System.out.println("Денис теперь получает "+ newPayDayD +" рублей. Годовой доход вырос на " + incomeD + " рублей.");
System.out.println("Кристина теперь получает "+ newPayDayK +" рублей. Годовой доход вырос на " + incomeK + " рублей.");





    }
}