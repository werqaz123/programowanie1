import java.util.Scanner;

public class CiagFibonacci {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int x=dane.nextInt();

            double tab[] = new double[x];
            tab[1]=1;
            tab[0]=1;
            for (int i=2; i<x; i++)
                tab[i]=tab[i-2]+tab[i-1];

            for (int i=0; i<x; i++)
                System.out.println(i+1 + " liczba = " + tab[i]);
        }
}
