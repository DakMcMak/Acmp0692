import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberBinar = new Scanner(System.in).nextInt();
        int test = 1;
        while (numberBinar >= test) {
            if (numberBinar == test) {
                System.out.println("YES");
                return;
            }
            test *= 2;
        }
        System.out.println("NO");
    }
}







