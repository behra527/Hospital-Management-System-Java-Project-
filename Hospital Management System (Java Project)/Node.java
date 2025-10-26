public class Node{
	Node next;
	Node pre;
	Order data;
	public Node(Order data){
		this.data=data;
		this.pre=null;
		this.next=null;
	}
}