
import java.util.Scanner;
	
	public class Ex02_03 {
		public static void main (String[]args){
		
		String name;
		double hight,weight;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("–¼‘O‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢>");
		name = scanner.nextLine();
		
		System.out.print("g’·(cm)>");
		hight = scanner.nextDouble();
		
		System.out.print("‘Ìd(kg)>");
		weight = scanner.nextDouble();
		
		System.out.print(name + "‚³‚ñ‚ÌBMI‚Í" +  (weight / (hight * hight ) * 10000) + "‚Å‚·");
		
		
		
		
		}
		}