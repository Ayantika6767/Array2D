package Array2D;

import java.util.Scanner;

public class Jagged_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size ");
				int n= sc.nextInt();
				int arr[][]=new int[n][];
				
				
				for(int i=0;i<arr.length;i++)
				{	
					System.out.println("No of Elements:");
					int m= sc.nextInt();
					 arr[i]=new int[m];
					
					for(int j=0;j<arr[i].length;j++)
					{
						arr[i][j]=sc.nextInt();
					}
				}
				System.out.println("..............................");
				output(arr);
	}
	
	public static void output(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	

}


