
import java.util.Scanner;
public class CzyPierwsza
{
    public static void main(String[] args)
    {
        Scanner dane = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int x=dane.nextInt();

        boolean pierwsza = true;
        for(int i=2;i*i<=x;i++)
            if(x%i==0)
                pierwsza = false;

        if(pierwsza)
            System.out.println( x + " JEST LICZBĄ PIERWSZĄ");
        else
            System.out.println( x + " NIE JEST LICZBĄ PIERWSZĄ");
    }
}

