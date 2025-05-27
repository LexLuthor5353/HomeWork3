import java.util.Scanner;

public class Main {


    public static int leapYear (int year)

    {
        if (year % 400 == 0) {
            return 366;
        } else if (year % 100 == 0) {
            return 365;
        } else if (year % 4 == 0) {
            return 366;
        } else {
            return 365;
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("Введите год в формате yyyy ");
            int year = scanner.nextInt();
            System.out.print("Введите количество дней в форате ddd ");
            int day = scanner.nextInt();

            int corectDays = leapYear(year);

            if (day == corectDays) {
                sum++;
                System.out.println("Верно! Очки " + sum);
            }
            else {
                System.out.println("Вы ошиблись=( Количество очков " + sum);
                break;
            }
            System.out.println(year);
        }

    }


}


