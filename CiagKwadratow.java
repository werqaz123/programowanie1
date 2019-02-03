import java.util.Scanner;

public class CiagKwadratow {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);
        int x = dane.nextInt();
        for (int i = 1; i <=  x; i ++)
            System.out.println(i * i);
    }
}
