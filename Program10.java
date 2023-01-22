//doubly linkedlist pregram


import java.util.Scanner;

//doubly linked list class
public class Program10 {

    static node head,tail;

    
    public static void insertAtHead(int data){
        node newNode = new node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.setNextNode(head);
            head.setPNode(newNode);
            head = newNode;
        }
    }
    public static void insertAtTail(int data){
        node newNode = new node(data);
        if(tail==null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.setNextNode(newNode);
            newNode.setPNode(tail);
            tail = newNode;
        }
    }

    public static void displayForward(){
        node current = head;
        System.out.print("List: {");
        while(current!=null){
            System.out.print(current.getData()+", ");
            current = current.getNextNode();
        }
        System.out.println("}");

    }

    public static void displayBackward(){
        node current = tail;
        System.out.print("List (backwards): {");
        while(current!=null){
            System.out.print(current.getData()+", ");
            current = current.getPreviousNode();
        }
        System.out.println("}");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 9999;
        while(choice!=0){
            System.out.println("Enter your choice");
            System.out.println("1. Insert at head");
            System.out.println("2. Insert at tail");
            System.out.println("3. Display list");
            System.out.println("4. Display reverse");
            System.out.println("0. Exit");

            choice = sc.nextInt();

            switch(choice){
                case 1:
                System.out.println("Enter data");
                insertAtHead(sc.nextInt());
                displayForward();
                break;

                case 2:
                System.out.println("Enter data");
                insertAtTail(sc.nextInt());
                displayForward();
                break;

                case 3:
                displayForward();
                break;

                case 4:
                displayBackward();
                break;

                case 0: 
                System.out.println("Closing the program");
                System.out.println("Result....");
                displayForward();
                break;

                default:
                System.out.println("Invalid chaoice");
                break;
            }

        }
        sc.close();
    }
}


class node{
    private int data;
    private node nextNode;
    private node previousNode;


    public node(int data){
        this.data = data;
    }
    //getters
    public int getData(){
        return this.data;
    }
    public node getNextNode(){
        return this.nextNode;
    }
    public node getPreviousNode(){
        return this.previousNode;
    }

    public void setPNode(node previousNode){
        this.previousNode = previousNode;
    }
    public void setNextNode(node nextNode){
        this.nextNode = nextNode;
    }
}