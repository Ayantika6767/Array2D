package Array2D;

import java.util.Scanner;

public class input_output1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size then List of array");
				int n= sc.nextInt();
				int m= sc.nextInt();

				int arr[][]=new int[n][m];
				
				for(int i=0;i<arr.length;i++)
				{
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
