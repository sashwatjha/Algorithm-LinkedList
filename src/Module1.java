import java.util.*;

public class Module1 {

    static class Node{

        int data;

        Node next;

        Node(int d, Node n){
            this.data = d;
            this.next = n;
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();

        Node prev = null;

        Node head = null;

        if(n == 0){

            int[] arr = {1, 2, 3, 4, 5, 6, 7};

            for(int i : arr){

                Node newNode = new Node(i, null);

                if(head == null){

                    head = newNode;
                }

                if(prev != null){

                    prev.next = newNode;
                }

                prev = newNode;
            }
        }

        else {
            while(n-->0){

                int d = sc.nextInt();

                Node newNode = new Node(d, null);

                if(prev != null){

                    prev.next = newNode;
                }

                if(head == null){

                    head = newNode;
                }

                prev = newNode;
            }
        }

        System.out.println("Traversal -> ");
        traversal(head);
        System.out.println("Length -> ");
        length(head);
        System.out.println("Find in the Linked List : Enter the search number : ");
        int flag = sc.nextInt();
        search(head, flag);
        System.out.println("Enter the data you want to delete :");
        flag = sc.nextInt();
        deleteNode(head, flag);
        System.out.println("Enter the data you want to add :");
        int val = sc.nextInt();
        System.out.println("Enter the index were you want to add :");
        int idx = sc.nextInt();
        insert(head, idx, val);
    }

    private static void traversal(Node head){

        Node temp = head;

        while(temp != null){

            System.out.println(temp.data);

            temp = temp.next;
        }
    }

    private static void length(Node head){

        Node temp = head;

        int count = 0;

        while(temp != null){

            count++;

            temp = temp.next;
        }

        System.out.println(count);
    }

    private static void search(Node head, int flag){

        Node temp = head;

        int idx = -1;

        boolean check = true;

        while(temp != null){

            idx ++;
            if(temp.data == flag){

                System.out.println("Flag Found !! index = "+idx);

                check = false;

                break;
            }

            temp = temp.next;
        }

        if(check) System.out.println("FLag NOt Found !!");
    }

    private static void deleteNode(Node head, int delete){

        Node temp = head;

        Node prev = null;

        while (temp != null) {

            if(temp.data == delete){

                if(prev != null){

                    prev.next = temp.next;
                }

                else {
                    head = temp.next;
                }

                break;
            }

            prev = temp;
            temp = temp.next;
        }

        System.out.println("New LinedList : ");

        traversal(head);
    }

    private static void insert(Node head, int idx, int val){

        Node temp = head;

        Node p = null;

        int i = -1;

        boolean indexFound = false;

        while(temp != null){

            i++;

            if(i == idx){

                Node newNode = new Node(val, p.next);

                p.next = newNode;

                indexFound = true;
            }

            p = temp;
            temp = temp.next;
        }

        if(!indexFound){

            Node newNode = new Node(val, null);

            if(head == null){
                head = newNode;
            }else p.next = newNode;

        }

        System.out.println("New LinedList : ");

        traversal(head);
    }

    private static Node deleteTail(Node head){

        if(head == null || head.next == null) return head;

        Node prev = head;
        while(prev.next.next != null){

            prev = prev.next;
        }

        prev.next = null;

        return head;
    }
}
