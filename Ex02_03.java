
import java.util.Scanner;
	
	public class Ex02_03 {
		public static void main (String[]args){
		
		String name;
		double hight,weight;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("名前を入力してください>");
		name = scanner.nextLine();
		
		System.out.print("身長(cm)>");
		hight = scanner.nextDouble();
		
		System.out.print("体重(kg)>");
		weight = scanner.nextDouble();
		
		System.out.print(name + "さんのBMIは" +  (weight / (hight * hight ) * 10000) + "です");
		
		
		
		
		}
		}