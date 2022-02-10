
import java.util.Scanner;

public class Ex02_06 {
  public static void main(String[] args) {
    int kingaku;
    Scanner scanner = new Scanner(System.in);

    System.out.println("金額をを入力してください>");
    kingaku = scanner.nextInt();

    System.out.println("一万円札が" + (kingaku / 10000) + "枚");
    System.out.println("五千円札が" + (kingaku % 10000 / 5000) + "枚");
    System.out.println("二千円札が" + (kingaku % 5000 / 2000) + "枚");
    System.out.println("千円札が" + (kingaku % 5000 % 2000 / 1000) + "枚");
    System.out.println("五百円玉が" + (kingaku % 1000 / 500) + "枚");
    System.out.println("百円玉が" + (kingaku % 500 / 100) + "枚");
    System.out.println("五十円玉が" + (kingaku % 100 / 50) + "枚");
    System.out.println("十円玉が" + (kingaku % 50 / 10) + "枚");
    System.out.println("五円玉が" + (kingaku % 10 / 5) + "枚");
    System.out.println("一円玉が" + (kingaku % 5 / 1) + "枚");

  }
}