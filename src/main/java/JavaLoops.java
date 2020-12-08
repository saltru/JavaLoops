import java.util.Scanner;

public class JavaLoops {

    public static void printSeq(int a, int b, int n) {
        int currentValue; //Текущий член последовательности для вывода
        int currentPowerOf2; //Текущая степень двойки для вычисления след. члена

        currentValue = a;
        currentPowerOf2 = 1;
        for (int i = 0; i < n; i++) {
            //Вычисляем след. член
            //currentValue = currentValue + currentPowerOf2 * b;
            //currentPowerOf2 = currentPowerOf2 * 2;
            currentValue += currentPowerOf2 * b;
            currentPowerOf2 *= 2;

            //Выводим его
            System.out.print(currentValue + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int q = scan.nextInt();

        if (q >= 1)
        {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();

            int currentValue; //Текущий член последовательности для вывода
            int currentPowerOf2; //Текущая степень двойки для вычисления след. члена

            currentValue = a;
            currentPowerOf2 = 1;
            for (int i = 0; i < n; i++) {
                //Вычисляем след. член
                //currentValue = currentValue + currentPowerOf2 * b;
                //currentPowerOf2 = currentPowerOf2 * 2;
                currentValue += currentPowerOf2 * b;
                currentPowerOf2 *= 2;

                //Выводим его
                System.out.print(currentValue + " ");
            }
            System.out.println();
        }

        if (q >= 2) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();

            int currentValue; //Текущий член последовательности для вывода
            int currentPowerOf2; //Текущая степень двойки для вычисления след. члена

            currentValue = a;
            currentPowerOf2 = 1;
            for (int i = 0; i < n; i++) {
                //Вычисляем след. член
                //currentValue = currentValue + currentPowerOf2 * b;
                //currentPowerOf2 = currentPowerOf2 * 2;
                currentValue += currentPowerOf2 * b;
                currentPowerOf2 *= 2;

                //Выводим его
                System.out.print(currentValue + " ");
            }
            System.out.println();
        }

        if (q >= 3) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();

            int currentValue; //Текущий член последовательности для вывода
            int currentPowerOf2; //Текущая степень двойки для вычисления след. члена

            currentValue = a;
            currentPowerOf2 = 1;
            for (int i = 0; i < n; i++) {
                //Вычисляем след. член
                //currentValue = currentValue + currentPowerOf2 * b;
                //currentPowerOf2 = currentPowerOf2 * 2;
                currentValue += currentPowerOf2 * b;
                currentPowerOf2 *= 2;

                //Выводим его
                System.out.print(currentValue + " ");
            }
            System.out.println();
        }

        if (q >= 4) {
            System.out.println("Программа не может работать с q>3");
        }

        /*
        if (q > 0) {
            for (int i = 0; i < q; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                int n = scan.nextInt();
                //TBD: validation

                printSeq(a, b, n);
            }
        }*/
    }
}
