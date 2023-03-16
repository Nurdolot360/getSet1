import java.lang.reflect.Type;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triugolnik triugolnik = new Triugolnik();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        triugolnik.setA(a);
        triugolnik.setB(b);
        triugolnik.setC(c);
        triugolnik.setD(d);
        triugolnik.square();
    }
}