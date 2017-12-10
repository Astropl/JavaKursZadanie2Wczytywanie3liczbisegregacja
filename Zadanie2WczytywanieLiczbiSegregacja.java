import java.util.Scanner;

public class Zadanie2WczytywanieLiczbiSegregacja {
    /*Zadanie 2. Wczytać od użytkownika 3 liczby całkowite
    i wypisać na ekran największą oraz najmniejszą z nich.
     */
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj 3 liczby całkowite");
        System.out.println("Podaj pierwszą liczbę ");
        a = sc.nextInt();
        System.out.println("Podaj drugą liczbę ");
        b = sc.nextInt();
        System.out.println("Podaj trzecia liczbę ");
        c = sc.nextInt();
        System.out.println(" Podałes a:" + a + ", b:" + b + ", c:" + c);/* sprawdzenie czy a jest najwieksza*/
        if ((a > b) && (a > c)) {
            System.out.println(a + " Liczba a jest najwieksza");
            if (b > c) {
                System.out.println(b + " Liczba b jest srodkowa");
                System.out.println((c + " Liczba c jest najmnijesza"));
            } else {
                System.out.println(c + " Liczba c jest środkowa");
                System.out.println(b + " Liczba b jest najmniejsza");
            }
        }
        if ((b > a) && (b > c)) {
            System.out.println(b + " Liczba b jest najwieksza");
            if (c > a) {
                System.out.println(c + " Liczba c jest srodkowa");
                System.out.println(a + " Liczba a jest najmnijesza");
            } else {

                System.out.println(a + " Liczba a jest środkowa");
                System.out.println(c + " Liczba c jest najmnijesza");
            }
        }
        if ((c > a) && (c > b)) {
            System.out.println(c + " Liczba c jest najwieksza");
            if (b > a) {
                System.out.println(b + " Liczba b jest srodkowa");
                System.out.println(a + " Liczba a jest najmniejsza");
            } else {
                System.out.println(a + " Liczba a jest środkowa");
                System.out.println(b + " Liczba b jest najmniejsza");
            }
        }


    }
}
