
import java.util.Scanner;

public class Ex02_04 {
  public static void main(String[] args) {
    double a, b;
    Scanner scanner = new Scanner(System.in);

    System.out.println("1つ目の実数を入力してください>");
    a = scanner.nextDouble();
    System.out.println("2つ目の実数を入力してください>");
    b = scanner.nextDouble();

    System.out.println(a + " + " + b + " = " + (a + b));
    System.out.println(a + " - " + b + " = " + (a - b));
    System.out.println(a + " * " + b + " = " + (a * b));
    System.out.println(a + " / " + b + " = " + (a / b));
    System.out.println(a + " % " + b + " = " + (a % b));
  }
}