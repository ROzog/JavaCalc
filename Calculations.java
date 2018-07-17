package Calculator;

import java.util.Scanner;

public class Calculations {
    Scanner scanner = new Scanner(System.in);

    public void multiply() {
        System.out.println("Wybrano mnożenie, podaj pierwszą liczbę:");
        int a = scanner.nextInt();

        System.out.println("Podaj drugą liczbę");
        int b = scanner.nextInt();

        System.out.println("Wynik to: " + a*b);
    }

    public void divide() {
        System.out.println("Wybrano dzielenie, podaj pierwszą liczbę:");
        double a = scanner.nextInt();

        double b;
        do{
            System.out.println("Podaj drugą liczbę - nie zero ;) ");
            b = scanner.nextInt();
        }while(b==0);

        System.out.println("Wynik to: " + a/b);
    }

    public void involution() {
        int involutionResult = 1;
        int a;
            do{
                System.out.println("Wybrano potegowanie, podaj liczbę różną od zera: ");
                a = scanner.nextInt();
            }while(a==0);

        System.out.println("Podaj liczbę potegi");
        int b = scanner.nextInt();

            for (int i = 1; i <= b; i++) {
                involutionResult *= a; }

        System.out.println("Wynik to: " + involutionResult);
    }

    public void nth (){
        System.out.println("Wybrano pierwiastkowanie kwadratowe, podaj liczbę: ");
        double nthNumber = scanner.nextInt();

        System.out.println(Math.sqrt(nthNumber));
    }

    public void decToBinary (){
        StringBuilder binaryRepresentation = new StringBuilder("");
        System.out.println("Wybrano zamiana liczby całkowitej na postać binarną, podaj liczbe: ");

        int decimalNumber = scanner.nextInt();

            while (decimalNumber != 0) {
                binaryRepresentation.append(decimalNumber % 2);
                decimalNumber /= 2; }

        binaryRepresentation.reverse();
        System.out.println("Wynik: " + binaryRepresentation);
    }

    public void binaryToDecimal (){
        System.out.println("Wybrano zamiana binarnej na całkowitą, podaj liczbę binarna: ");
        String binaryNumber = scanner.nextLine();

        int decNumber = Integer.parseInt(binaryNumber, 2);
        System.out.println(decNumber);
    }
    public void gcd (){
        System.out.println("Wybrano największy wspólny dzielnik, podaj pierwszą liczbę: ");
        int gcdFirst = scanner.nextInt();

        System.out.println("Podaj drugą liczbę: ");
        int gcdSecond = scanner.nextInt();

            while (gcdFirst != gcdSecond) {
                if (gcdFirst > gcdSecond) {
                    gcdFirst = gcdFirst - gcdSecond;
                } else {
                    gcdSecond = gcdSecond - gcdFirst;
                }
            }
        System.out.println("Wynik: " + gcdFirst);
    }
    public void average(){
        double sum =0;
        int counter=0;
        System.out.println("Wybrano średnią podanego zbioru, podaj liczby oddzielajac je przecinkiem: ");
        String numbers = scanner.nextLine();

        String[] splited = numbers.split(",");

            int[] integers = new int[splited.length];
                for (int i = 0; i<integers.length; i++){
                    integers[i] = Integer.parseInt(splited[i]);
                    sum += integers[i];
                    counter++;
                }
        System.out.println("Wynik to: " + sum / counter);
    }
    public void setOfNumbersWithoutNumber(){
        String setOfNmbers ="";
        double sum =0;
        String result = "";
            do {
                System.out.println("Wybrano czy w zbiorze znajduje się liczba - która przekracza sumę całego zbioru bez niej samej");
                System.out.println("Poadj minimum dwie liczby oddzielając je przecinkiem:");
                setOfNmbers = scanner.nextLine();
            }
            while (setOfNmbers.length() <3);


            String[] splited = setOfNmbers.split(",");
            int[] integers = new int[splited.length];

                for (int i = 0; i < integers.length; i++) {
                    integers[i] = Integer.parseInt(splited[i]);
                    sum += integers[i];
                }

                for (int i = 0; i<integers.length; i++) {
                    if (integers[i] > sum - integers[i]) {
                        result = "Tak jest taka liczba, jest to: " + integers[i];
                        break;
                    } else {
                        result = " Nie nie ma takiej liczby";
                    }
                }
            System.out.println(result);
    }
}
