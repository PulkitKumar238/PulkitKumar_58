package pulkit_58;
import java.util.Scanner;
public class prog3{
	public static void main(String[] args) {
		int[][] arr= new int[3][];
		Scanner scan= new Scanner(System.in);
		arr[0]= new int[4];
		arr[1]= new int[2];
		arr[2] = new int[3];
		for(int i=0;i<arr.length; i++)

		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j] = scan.nextInt();
				
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
			
		}
		scan.close();
}
}
