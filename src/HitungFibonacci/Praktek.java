package HitungFibonacci;
import java.util.*;
public class Praktek 
{
		private static void tampilJudul(String identitas)
		{
			System.out.println("Identitas : " + identitas);
			
			System.out.println("\nHitung Fibonacci");
			System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
		}
		
		public static void main(String[] args) 
		{
			String identitas = "Arya Putra Adyartama / X RPL 3 / 07";
			
			tampilJudul(identitas);
			
			int n = tampilInput();
		}
		
		private static int tampilInput()
		{
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Bilangan ke-: ");
			int n = scanner.nextInt();
			
			return n;
		}
}
