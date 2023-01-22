//takes space seperated integers and performs bubble sort
import java.util.Arrays;
import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] nums = sc.nextLine().split(" ");
        int [] int_num = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            int_num[i] = Integer.parseInt(nums[i]);
        }

        //bubble sort
        for(int i = 1; i<int_num.length;i++){
            for(int j = 0;j<int_num.length-i;j++){
                if(int_num[j+1]<int_num[j]){
                    int temp = int_num[j];
                    int_num[j] = int_num[j+1];
                    int_num[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(int_num));
        sc.close();
    }
}
