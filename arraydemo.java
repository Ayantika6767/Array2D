package Array2D;
import java.util.Scanner;
public class arraydemo {
	
				public static void main(String[] args) {
					// TODO Auto-generated method stub

						
					Scanner sc= new Scanner(System.in);
					System.out.println("Enter array size then List of array");
							int n= sc.nextInt();
							int m= sc.nextInt();

							int arr[][]=new int[n][m];
							System.out.println(arr);//	[[I@42d3bd8b 2D ADDRESS
							System.out.println(arr[1]);// [I@26ba2a48 1D ADDRESS
							/*
							 * [[I@42d3bd8b  [[=2D...I=INTEGER VALUE...HASH VALUE
							 * [I@26ba2a48	 [ =1D...I=INTEGER VALUE...HASH VALUE
							 * arr[1][2] means we are going to 1D address of arr[1] and then access 2nd index
							 * Whole array is not contiguous
							 * Only 1d arrays are contiguous left to right
							 * In heap when arrays will be stored...1d arrays can be stored anywhere
							 * 
							 */
							
							int arr2[][]=new int [3][];// 3 null 1d arrays are created
							System.out.println(arr2[0]); // null deafult int value 0
							/*
							 * This means we are creating 3 arrays of size null
							 * int arr2[][]=new int [][];
							 * int arr2[][]=new int [][4];
							 * These two arrays are not allowed
							 * Since both [][] cant be empty and
							 * Without creating 1d array how are we giving size of that array
							 * int arr2[][]=new int [0][];//out of bound
							 */
							
							//int arr3[][]=new int[n][m];
							/*
							 * Question: How many 1d arrays are created?
							 * Ans: n+1
							 * How? : new int [n] means = 1 1d array of n size created (+1) stores address;
							 * 			  int [m] means = n arrays created of size m (+n);
							 */
							
							//int arr[][]=new int[n][m];
							System.out.println(arr.length); //  row length
							System.out.println(arr[0].length); // col length
				}
}
				
	