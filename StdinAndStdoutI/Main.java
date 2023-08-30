import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int getInteger = scanner.nextInt();
        double getDouble = scanner.nextDouble();
        scanner.nextLine();
        String getString = scanner.nextLine();
        scanner.close();

        /* calling the solution method*/
        solution(getInteger, getDouble, getString);

    }

    private static void solution(int a, double b, String c) {
        System.out.println("String: " + c);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
    }

}
