//program to find second largest number form a given set of numbers

import java.util.Scanner;
public class Program08{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] nums = sc.nextLine().split(" ");
        int n = nums.length;
        int [] data = new int[n];
        for(int i = 0; i<n; i++){
            data[i] = Integer.parseInt(nums[i]);
        }
        sc.close();
        int l, secL;
        if(data[0]>data[1])
        {
            l = data[0];
            secL=data[1];
        }
        else if(data[0]==data[1]){
            l = data[0];
            secL = -1;
        }
        else{
            l = data[1];
            secL=data[0];
        }        
        for(int i = 2;i<n;i++){
            if(data[i]>l){
                secL=l;
                l=data[i];
            }
            if(data[i]>secL&&data[i]<l){
                secL = data[i];
            }
        }
        System.out.println("Second largest number:"+secL);
    }
    
}