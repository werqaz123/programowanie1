import java.util.Scanner;

public class Choinka3 {
    public static void main(String[] args) {
        char znakGwiazdki = '*';
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj ilosc poziomow choinki: ");
        int poziomy = sc.nextInt();


        for (int i = 0; i <= poziomy; i++) {
            for (int j = 0; j <= poziomy; j++) {
                if (j > (poziomy - i)) {
                    System.out.print(" ");
                } else {
                    System.out.print(znakGwiazdki);
                }
            }
            System.out.println();
        }
    }
}
