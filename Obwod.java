import java.util.Scanner;

public class Obwod {
    public static void main(String[] args) {


        char znakGwiazdki = '*';
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj ilosc poziomow : ");
        int poziomy = sc.nextInt();


        for (int i = 0; i <= poziomy; i++) {
            for (int j = 0; j <= poziomy; j++) {
                if (j == 0||j==poziomy ) {
                    System.out.print(znakGwiazdki);
                }else if(i == 0||i==poziomy ) {
                    System.out.print(znakGwiazdki);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
