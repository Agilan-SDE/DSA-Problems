package LinkedList;


class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=next;
	}
}
public class RotateList {
	static Node head;
	public static void insertAtEnd(int value) {
		
		Node newnode = new Node(value);
		if(head==null) {
			newnode.data=value;
			newnode.next=null;
			head=newnode;
		}
		else {
			Node temp=head;
			
			while(temp.next!=null) {
				temp=temp.next;
			}
			newnode.data=value;
			newnode.next=null;
			temp.next=newnode;
		}
		
	}
	
	public static void display() {
		Node temp=head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public static void rotate_List(int n) {
		int count=1;
		Node temp=head;
		while(temp.next!=null) {
			count++;
			temp=temp.next;
		}
		
		temp.next=head;
		
		int shift=count-(n%count);
		Node newNode = head;
		
		for(int i=1;i<shift;i++) {
			newNode=newNode.next;
		}
		
		Node newHead = newNode.next;
		newNode.next=null;
		
		head=newHead;
	}
	
	public static void count() {
		int count=1;
		Node temp=head;
		while(temp.next!=null) {
			count++;
			temp=temp.next;
		}
		
		System.out.println(count);
	}
	public static void main(String[] args) {
		int n=0;
		
		insertAtEnd(10);
		insertAtEnd(20);
		insertAtEnd(30);
		insertAtEnd(40);
		insertAtEnd(50);
		insertAtEnd(60);
		display();
		rotate_List(n);
		display();
		
	}

}
