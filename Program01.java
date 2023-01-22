//Euclid's algorithmthe 
//It takes two numbers and gives GCD/HCF
import java.util.Scanner;
class Program01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a<b) ? gcd(a,b): gcd(b,a));
        sc.close();
    }
    static int gcd( int x, int y){
        if(y%x==0) return x;
        else return gcd(y%x,x);
    }
}