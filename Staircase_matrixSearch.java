package Array2D;

import java.util.Scanner;

public class Staircase_matrixSearch {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

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
					
					System.out.println("Enter search element");
					int x= sc.nextInt();
					System.out.println(Search(arr,x));
		}
					
					public static int Search(int arr[][],int x)
					{
						int i = 0;//row
						int j = arr[0].length-1;//col
						
						while(i<arr.length && j>=0)
						{
							if(arr[i][j]==x)
							{
								return 1;
							}
							else if(x>arr[i][j])
							{
								i++;
							}
							else
								j--;
						}
						return 0;
						
					}
	}


