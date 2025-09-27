import java.util.*;
public class MissingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n-1; i++){        // To find 2 numbers missing
            if(arr[i+1] - arr[i] == 2 ){ // if(arr[i+1] - arr[i] == 2 )
                continue;
            }
            else{
                System.out.println(arr[i]+ 2); // System.out.println(arr[i]+ 2);
            }
        }
    }
}