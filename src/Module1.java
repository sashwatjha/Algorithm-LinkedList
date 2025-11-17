import java.util.*;

public class Module1 {

    static class Node{

        int data;

        Node next;

        Node(int d, Node n){
            this.data = d;
            this.next = n;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();

        Node prev = null;

        Node head = null;

        boolean headCheck = true;

        while(n-->0){

            int d = sc.nextInt();

            Node newNode = new Node(d, null);

            if(prev != null){

                prev.setNext(newNode);
            }

            if(headCheck){

                head = newNode;
                headCheck = false;
            }

            prev = newNode;
        }

        do{

            System.out.println(head.getData());

            head = head.getNext();

        }while(head != null);
    }
}
