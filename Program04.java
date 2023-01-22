//takes space seperated integers and performs insertion sort
import java.util.Arrays;
import java.util.Scanner;

public class Program04 {
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
            int j;
            for(j = i; j>0; j--){
                if(int_num[j-1]>temp){
                    int_num[j]=int_num[j-1];
                }
                else break;
            }
            int_num[j] = temp;
        }
        System.out.println(Arrays.toString(int_num));
        sc.close();
    }
}