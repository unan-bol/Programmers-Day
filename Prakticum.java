import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (year < 10)
            if (isLeapYear(year)) {
                System.out.println("13.09.000" + year);
            }else {
                System.out.println("12.09.000" + year);
        }
        if (year < 100)
            if (isLeapYear(year)) {
                System.out.println("13.09.00" + year);
            }else {
                System.out.println("12.09.00" + year);
            }
        if (year < 1000)
            if (isLeapYear(year)) {
                System.out.println("13.09.0" + year);
            }else {
                System.out.println("12.09.0" + year);
            }
        else
            if (isLeapYear(year)) {
                System.out.println("13.09." + year);
            }else {
                System.out.println("12.09." + year);
            }
    }

    public static boolean isLeapYear(int year) {
        boolean leapYear;// здесь нужно определить, является ли переданный год високосным
        if (year%400 == 0) {
            leapYear = true;
        }else if(year%100 == 0){
            leapYear = false;
        }
        else if (year%4 == 0){
            leapYear = true;
        }
        else{
            leapYear = false;
        }
    return leapYear;
    }
}
