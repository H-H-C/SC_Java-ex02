
import java.util.Scanner;
public class Ex02_02 {
	public static void main (String[]args){
	
	int suryo,tanka;
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("数量を入力してください>");
	tanka = scanner.nextInt();
	
	System.out.print("単価を入力してください>");
	suryo = scanner.nextInt();
	
	System.out.print("金額は" + suryo * tanka + "です");
	
	
	}
	}
	