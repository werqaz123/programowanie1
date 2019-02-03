import java.util.Scanner;

public class Choinka4 {public static void main(String[] args) {
    char znakGwiazdki = '*';
    Scanner sc = new Scanner(System.in);

    System.out.print("Podaj ilosc poziomow choinki: ");
    int poziomy = sc.nextInt();

    for (int i = 0; i < poziomy; i++) {
        for (int j = 0; j < poziomy * 2; j++) {
            if (j < (poziomy ) || j > (poziomy+i )) {
                System.out.print(znakGwiazdki);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
}
