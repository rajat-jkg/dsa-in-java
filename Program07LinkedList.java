import java.util.Scanner;

// this program impliments LinkedList
// It has a command line menu driven interface

public class Program07LinkedList {
    private static node Head;
    
    public static void findElement(int data){
        int index = 0,flag=0;
        node current = Head;
        while(current!=null){
            if(current.getData()==data && flag==0){
                System.out.println(data+" is found at index "+index);
                flag = 1;
                
            }
            index++;
            current = current.getNextNode();
        }
        if(flag==0){
            System.out.println(data+" not found in the list");
        }
    }
    public static void deleteHead(){
        if(Head!=null){
            Head = Head.getNextNode();
            System.out.print("Updated list  ");
            display();
        }
        else{
            System.out.println("Nothing to delete");
        }
    }
    public static int checkLength(){
        int l =0;
        node curent = Head;
        while(curent!=null){
            l++;
            // System.out.println("Checking length....\n now at "+l);
            curent = curent.getNextNode();
        }
        return l;
    }
    //for inserting an element at head
    public static void insertAtHead( int data){
        node newNode = new node(data);
        newNode.setNextNode(Head);
        Head = newNode;
    }
    public static void display(){
        node current = Head;
        System.out.print("{");
        while(current !=null){
            System.out.print(current.getData()+", ");
            current = current.getNextNode();
        }
        System.out.println("\b\b}");
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 9999;
        while(choice!=0){
            // menu
            System.out.println("Chose any of the following options");
            System.out.println("1. Insert an element at head");
            System.out.println("2. Display Result");
            System.out.println("3. Check Length");
            System.out.println("4. Delete Head");
            System.out.println("5. Find data");

            System.out.println("0. Exit");
            
            //Input choice
            choice = sc.nextInt();

            switch(choice){
                case 0:
                display();
                System.out.println("Program terminating");
                break;

                case 1:
                // input entry
                System.out.println("Enter a number");
                int data = sc.nextInt();
                insertAtHead(data);
                System.out.print("Updated list  ");
                display();
                break;

                case 2: 
                display();
                break;

                case 3:
                System.out.println("Length is: "+checkLength());
                break;

                case 4:
                deleteHead();
                break;

                case 5:
                System.out.println("Enter a number to find");
                findElement(sc.nextInt());
                break;


                default:
                System.out.println("Invalid Choice");
                break;
            }
            }
            sc.close();
    }
}



class node{
    private int data;
    private node NextNode;

    public node(int data){
        this.data= data;
    }
    public void setData(int data){
        this.data = data; 
    }
    public void setNextNode(node nextNode){
        this.NextNode = nextNode;
    }
    public int getData(){
        return this.data;
    }
    public node getNextNode(){
        return this.NextNode;
    }
}