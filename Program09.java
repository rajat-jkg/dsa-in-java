import java.util.Scanner;

//sorted linked list

class node{
    private int data;
    private node nextNode;

    public node(int data){
        this.data = data;
    }
    //getter functions
    public int getData(){
        return this.data;
    }
    public node getNextNode(){
        return this.nextNode;
    }

    //setter functions
    public void setNextNode(node nextNode){
        this.nextNode = nextNode;
    }
}
public class Program09 {

    static node headNode;
    public static void addElement(int data){
        node newNode = new node(data);
        if(headNode==null){
            headNode = newNode;
        }
        else if(headNode.getNextNode()==null && headNode.getData()>data){
            newNode.setNextNode(headNode);
            headNode= newNode;
        }
        else if(headNode.getNextNode()==null && headNode.getData()<=data){
            headNode.setNextNode(newNode);
        }
        else if(data<=headNode.getData()){
            newNode.setNextNode(headNode);
            headNode = newNode;
        }
        else{
            node current = headNode;
            while(current.getNextNode()!=null){
                if(current.getData()<=data && current.getNextNode().getData()>=data){
                    break;
                }
                current = current.getNextNode();
            }
            newNode.setNextNode(current.getNextNode());
            current.setNextNode(newNode);
        }
    }

    public static int lengthValue(){
        node current = headNode;
        int l = 0;
        while(current !=null){
            l++;
            current = current.getNextNode();
        }
        return l;        
    }

    public static void display(){
        node current = headNode;
        System.out.print("List: {");
        while(current !=null){
            System.out.print(current.getData()+", ");
            current = current.getNextNode();
        }
        System.out.println("\b\b}");
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 99999;
        while(choice!=0){
            System.out.println("Chose any of the following options");
            System.out.println("1. Insert data");
            System.out.println("2. Check Length");
            System.out.println("3. Display Result");
            System.out.println("0. Exit");
            choice = sc.nextInt();

            switch(choice){
                case 1: 
                System.out.println("Enter a number");
                addElement(sc.nextInt());
                display();
                break;

                case 2:
                System.out.println("The length is: "+lengthValue());
                break;

                case 3:
                display();
                break;

                case 0:
                display();
                break;

                default:
                System.out.println("Invalid choice");

            }
        }
        sc.close();
    }
}
