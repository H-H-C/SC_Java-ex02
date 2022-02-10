
import java.util.Scanner;

public class Ex02_05 {
  public static void main(String[] args) {
    char a, b, c;
    Scanner scanner = new Scanner(System.in);

    System.out.println("3文字の英単語を思い浮かべてください");

    System.out.println("1文字目を入力してください>");
    a = scanner.next().charAt(0);
    System.out.println("2文字目を入力してください>");
    b = scanner.next().charAt(0);
    System.out.println("3文字目を入力してください>");
    c = scanner.next().charAt(0);

    System.out.println("" + a + b + c + "を入力しました");
  }
}