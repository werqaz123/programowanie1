import java.util.Scanner;

public class CiągCoDwa {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);
        int x=dane.nextInt();
        for(int i=1;i<=2*x; i+=2)
            System.out.println(i);
    }
}
