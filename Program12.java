//implementing circular queue with arrays


import java.util.Scanner;

class queue{
    int maxSize = 5;
    int [] q = new int[maxSize];
    int head,tail;
    public queue(){
        head = -1;
        tail = -1;
    }
    public void enQ(int data){
        if(head==-1&&tail==-1){
            head=0;
            tail=0;
            q[head] = data;

        }
        else if(head!=(tail+1)%maxSize){
            tail=(tail+1)%maxSize;
            q[tail] = data;
        }
        else{
            System.out.println("Queue full.");
        }
    }
    public void peek(){
        if(head==-1&&tail==-1){
            System.out.println("Peek failed. Queue empty.");
        }
        else{
            System.out.println("Peek result "+q[head]);
        }
    }
    public void deQ(){
        if(head==-1&&tail==-1){
            System.out.println("Dequeue failed. Queue empty.");
        }
        else if(head==tail){
            System.out.println("Dequeue result "+q[head]);
            tail=-1;
            head=-1;
        }
        else{
            System.out.println("Dequeue result "+q[head]);
            head = (head+1)%maxSize;
        }
    }
}

public class Program12 {
    static queue Q = new queue();
    public static void display(){
        int i =Q.head;
        System.out.print("[ ");
        while(Q.head!=-1&&Q.tail!=-4){
            System.out.print(Q.q[i]+" ");
            if(i==Q.tail)
            break;
            i = (i+1)%Q.maxSize;
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 99999;
        System.out.println("Demonstrating Queue. Enter your choice");
        while(choice!=0){
            System.out.println("1. Enqueue.");
            System.out.println("2. Dequeue.");
            System.out.println("3. Peek.");
            System.out.println("4. Display result");
            System.out.println("0. Exit");
            choice = sc.nextInt();

            switch(choice){

                case 1:
                System.out.println("Enter data");
                Q.enQ(sc.nextInt());
                display();
                break;

                case 2:
                Q.deQ();
                display();;
                break;

                case 3:
                Q.peek();
                break;
                
                case 4,0:
                display();
                break;

                default:
                System.out.println("Invalid Choice: ");
                break;
            }
            
        }
        sc.close();
    }
}
