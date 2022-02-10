
import java.util.Scanner;

public class Ex02_07 {
  public static void main(String[] args) {
    float a, b;
    Scanner scanner = new Scanner(System.in);

    System.out.println("1つ目の実数を入力してください>");
    a = scanner.nextFloat();
    System.out.println("2つ目の実数を入力してください>");
    b = scanner.nextFloat();

    System.out.println(a + " + " + b + " = " + (a + b));
    System.out.println(a + " - " + b + " = " + (a - b));
    System.out.println(a + " * " + b + " = " + (a * b));
    System.out.println(a + " / " + b + " = " + (a / b));
    System.out.println(a + " % " + b + " = " + (a % b));
  }
}