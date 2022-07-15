package Array2D;

import java.util.Scanner;

public class Vertical_wave {

	public static void main(String[] args) {
	
/* !   !
 * 1 2 3 1 - arr[0]
 * 4 5 6 1 - arr[1]
 * 7 8 9 1 - arr[2]
 *   ^   ^
 * 1 4 7...8 5 2...3 6 9...1 1 1 
 * 1 4 7= arr[0][0] arr[1][0] arr[2][0] .....> 0 1 2 (m[0] const.) //0th row even
 * 8 5 2= arr[2][1] arr[1][1] arr[0][1] .....> 2 1 0 (m[1] const.) //1th row odd
 */
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter array size and then elements");
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
					
					vertical(arr);
					
					
	}
	
	public static void vertical(int arr[][])
	{
		for(int i=0;i<arr[0].length;i++)
		{
			
			
				if(i%2==0)
				{
					for(int j=0;j<arr.length;j++)
					{
						System.out.print(arr[j][i]+" ");
				
					}
					System.out.println();
				}
				else
				{
					for(int j=arr.length-1;j>=0;j--)
					{
						System.out.print(arr[j][i]+" ");	
					}
					System.out.println();			}
				
					
			}
	}
}

			
	
