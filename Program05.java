//insertion sort with while loop
import java.util.Arrays;
import java.util.Scanner;

public class Program05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] nums = sc.nextLine().split(" ");
        int n = nums.length;
        int [] int_num = new int[n];
        for(int i = 0; i<n; i++){
            int_num[i] = Integer.parseInt(nums[i]);
        }

        // performing insertion sort
        int temp;
        for(int i =1 ; i<n;i++){
            temp = int_num[i];
            int j = i-1;
            while(j>=0&&int_num[j]>temp){
                int_num[j+1] = int_num[j];
                j--;
            }
            int_num[j+1]=temp;
        }
        System.out.println(Arrays.toString(int_num));
        sc.close();
    }
}