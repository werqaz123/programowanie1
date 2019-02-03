import java.util.Scanner;

public class Przekatna2 {
    public static void main(String[] args) {
        char znakGwiazdki = '*';
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj ilosc poziomow : ");
        int poziomy = sc.nextInt();


        for (int i = 0; i <= poziomy; i++) {
            for (int j = 0; j <= poziomy; j++) {
                if (j != i&&j!=(poziomy-i)) {
                    System.out.print(" ");
                } else {
                    System.out.print(znakGwiazdki);
                }
            }
            System.out.println();
        }
    }
}
