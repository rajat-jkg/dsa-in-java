//performing linear search
//This program takes takes space seprated integers and a number and searches fot it in the array.
import java.util.Arrays;
import java.util.Scanner;

public class Program06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter space seperated integers");
        String [] nums = sc.nextLine().split(" ");
        int n = nums.length;
        int [] int_num = new int[n];
        for(int i = 0; i<n; i++){
            int_num[i] = Integer.parseInt(nums[i]);
        }
        System.out.println("Enter the value you are looking");
        int x = sc.nextInt();

        sc.close();

        System.out.println("You entered"+Arrays.toString(int_num));

        int f=0;
        for(int i = 0;i<int_num.length;i++){
            if(int_num[i]==x){
                System.out.println(x+" is at number "+ (i+1) );
                f=1;
                break;
            }
            
        }
        if(f==0){
            System.out.println("Not found");
        }
    }
}