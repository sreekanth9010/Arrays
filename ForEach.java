package arrays;

import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("netre");
		int noOfElements=sc.nextInt();
		
		int []arr = new int[noOfElements];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the element of index" +i);
			arr[i]=sc.nextInt();
			
		}

		for(int ele:arr)
		{
			System.out.print(ele+" " );
		}
		

	}

}
