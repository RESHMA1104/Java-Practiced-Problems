import java.util.*;
public class ArrayPositionzoho {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int sum = 0;
		boolean isfound = false;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				sum = arr[i] + arr[j];
				if(sum < k) {
					System.out.print("("+i+","+j+")"+",");
					isfound = true;
				}
			}
		}
		if(!isfound){
			System.out.println("No valid pair");
		}
		else{
			System.out.println();
		}
	}
}