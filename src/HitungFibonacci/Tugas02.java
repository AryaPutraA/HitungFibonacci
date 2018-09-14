package HitungFibonacci;
import java.util.Scanner;
public class Tugas02 
{
	
    
	private static int Awok()
	{
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Berat Barang : ");
        int berat = scan.nextInt();
        
        return berat;
	}
    
	private static void Proces(int berat, int[] ap, int[] pa)
	{
		int hasil = 0;
		for (int i = 0; i < ap.length; i++) 
		{
			int n = 0;
			while(berat>=ap[i])
			{
				berat = berat- ap[i];
				n++;
			}
		int total = n*pa[i];
		System.out.println(ap[i] + " Sebanyak " + n + " dengan harga Rp" + total);
		hasil = hasil + total;
		}
        
        System.out.println("\nTotal Bayaran : Rp." + hasil);
	}

}
