import java.util.Arrays;
import java.util.Scanner;

//performing merge sort

public class Program13 {

    static void merge(int [] ar , int si, int mid, int ei){
        int merged [] = new int[ei -si +1];
        int indx1 = si;
        int indx2 = mid+1;
        int x= 0;

        while(indx1<=mid && indx2 <=ei){
            if(ar[indx1]<ar[indx2]) merged[x++] = ar[indx1++];
            else merged[x++] = ar[indx2++];
        }
        while(indx2 <=ei){
            merged[x++] = ar[indx2++];
        }
        while(indx1<=mid){
            merged[x++] = ar[indx1++];
        }
        for(int i = 0,j=si; i<=ei -si;i++,j++){
            ar[j]=merged[i];
        }
    }

    static void divide(int [] ar , int si, int ei){
        if(si<ei){
            int middle = si+ (ei-si)/2;
            divide(ar, si, middle);
            divide(ar, middle+1, ei);
            merge(ar, si, middle, ei);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers to be sorted: ");
        String [] strData = sc.nextLine().split(" ");
        int n = strData.length;
        int [] data = new int[n];
        for(int i =0;i<n;i++){
            data[i]=Integer.parseInt(strData[i]);
        }

        sc.close();
        divide(data, 0, n-1);

        System.out.println("Sorted data");
        System.out.println(Arrays.toString(data));
    }
}
