import java.util.Scanner;

public class Ciag0n {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int x = dane.nextInt();
        if (x % 2 != 0) {
            System.out.println("Podaj liczbe parzysta");
        } else {
            for (int i = 0; i < x; i += 2)
                System.out.println(i);
            for (int j = x; j >= 0; j -= 2)
                System.out.println(j);
        }
    }
}
