import java.util.Scanner;
public class Trix {

	public static void main(String[] args) {
		int left=1,center=0,right=0,temp,i;
		String swap;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please Enter (A and B and C) : ");
		swap = scan.next();
		scan.close();
		
		
		for(i=0;i<swap.length();i++){
		if(swap.charAt(i) == 'A' || swap.charAt(i) == 'a')
		{
		temp=left;
		left=center;
		center=temp;
		}
		else if(swap.charAt(i) == 'B' || swap.charAt(i) == 'b')
		{
		temp=center;
		center=right;
		right=temp;
		}
		else
		{
		temp=left;
		left=right;
		right=temp;
		}
		}
		if(left == 1) 
			System.out.println("Ball have in Left glass");
		else if(center == 1) 
			System.out.println("Ball have in Center glass");
		else 
			System.out.println("Ball have in Right glass");

	}

}
