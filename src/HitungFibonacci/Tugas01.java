package HitungFibonacci;
import java.util.Scanner;

public class Tugas01 
{
		
		
		public static int input()
		{
			Scanner o = new Scanner(System.in);
			
			System.out.print("Masukan Jumlah Uang : Rp.");
			int b = o.nextInt();
			
			return b;
		}
		
		public static void A(int b, int [] d)
		{
			for(int i = 0; i < d.length; i++)
			{
				int f = 0;
				while(b >= d[i])
				{
					b = b - d[i];
					f++;
				}
					System.out.println(d[i] + " Sebanyak " + f);
			}
		}
		
		public static void main(String args[])
		{
			int b = input();
			int d [] = new int [] {5000, 2000, 1000, 500, 100};
			A(b,d);
		}

}
