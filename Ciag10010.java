import java.util.Scanner;

public class Ciag10010 {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int x=dane.nextInt();
                for (int i=1; i<=x; i++)
               System.out.print(i*100+","+ i*10+",");


    }
}
