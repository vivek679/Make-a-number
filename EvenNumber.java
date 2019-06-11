import java.util.Scanner;
public class EvenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n = sc.nextInt();
		if(n<=0) {
			System.out.println("Invalid array size");
			return ;
		}
		System.out.println("Enter the array elements:");
		int[] number = new int[n];
		for(int i=0;i<number.length;i++) {
			number[i]=sc.nextInt();
		}
		int num=0;
		boolean found = false;
		for(int m:number) {
			if(m>=0 && m<=9 && m%2==0)
			{
				num=num*10+m;
				found = true;
			}
		}
		if(!found) {
			System.out.println("Single digit even number is not found in the array");
		}
		else
			System.out.println(num);
	}
}
