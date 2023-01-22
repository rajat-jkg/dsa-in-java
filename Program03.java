//takes space seperated integers and performs selection sort
import java.util.Arrays;
import java.util.Scanner;

public class Program03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] nums = sc.nextLine().split(" ");
        int n = nums.length;
        int [] int_num = new int[n];
        for(int i = 0; i<n; i++){
            int_num[i] = Integer.parseInt(nums[i]);
        }

        // performing selection sort
        int sm , smi;
        for(int i =0 ; i<n-1;i++){
            sm = int_num[i];
            smi = i;
            for(int j = i; j<n; j++){
                if(int_num[j]<sm){
                    sm = int_num[j];
                    smi =j;
                }
            }
            int_num[smi] = int_num[i];
            int_num[i]=sm;
        }
        System.out.println(Arrays.toString(int_num));
        sc.close();
    }
}