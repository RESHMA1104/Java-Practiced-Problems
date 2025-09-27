import java.util.*;
class AddTwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of n : ");
        int n = sc.nextInt();
        System.out.println("Enter the "+n+" number of elements : ");
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum : ");
        int target = sc.nextInt();
        int sum = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                sum = nums[i] + nums[j];
                if(sum == target){
                    System.out.print("["+i+","+j+"]");
                }
            }
        }
    }
}