
import java.util.Scanner;
	
	public class Ex02_03 {
		public static void main (String[]args){
		
		String name;
		double hight,weight;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���O����͂��Ă�������>");
		name = scanner.nextLine();
		
		System.out.print("�g��(cm)>");
		hight = scanner.nextDouble();
		
		System.out.print("�̏d(kg)>");
		weight = scanner.nextDouble();
		
		System.out.print(name + "�����BMI��" +  (weight / (hight * hight ) * 10000) + "�ł�");
		
		
		
		
		}
		}