import java.util.Scanner;

//Implementing stack using array


public class Program11 {
    static Stack s = new Stack();
    public static void display(){
        System.out.print("Result: [ ");
        for(int i = 0;i<=s.head;i++){
            System.out.print(s.st[i]+" ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Simulating a stack select an operation: ");
        int choice=33333;
        while(choice!=0){
            System.out.println("1. Push");
            System.out.println("2. Peek");
            System.out.println("3. Pop");
            System.out.println("4. Show result");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            
            switch (choice){
                case 1:
                System.out.println("Enter Data");
                s.push(sc.nextInt());
                display();
                break;
                case 2:
                System.out.println("Peek result: "+s.peek());
                break;

                case 3:
                System.out.println("Pop result: "+s.pop());
                System.out.println("Updating stack...");
                display();
                break;

                case 4,0:
                display();
                break;

                default:
                System.out.println("Invalid choice.");
                break;
            }
        }

        sc.close();
    }
}

class Stack{
    int [] st = new int[200];
    int head;
    public Stack(){
        this.head = -1;
        for(int i = 0; i<200; i++)
        st[i]=0;
    }
    public void push(int data){
        head++;
        if(head<200)
        st[head]= data;
        else
        System.out.println("Stack overflow occured");
    }
    public int pop(){
        if(head>=0){
            head--;
            return st[head+1];
        }
        else{
            System.out.println("Empty stack");
            return 0;
        }
    }
    public int peek(){
        if(head>=0){
            return st[head];
        }
        else{
            System.out.println("Empty stack");
            return 0;
        }
    }
}

