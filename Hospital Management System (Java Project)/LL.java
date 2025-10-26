public class LL{
	Node head;
	Node tail;
	int count;
	public void add(Order data)
	{

		Node newNode=new Node(data);
		count++;
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else{ 
			tail.next=newNode;
			newNode.pre=tail.next;
			tail=newNode;
		}
	}
		public void display()
		{
			Node currentdata=head;
			while (currentdata!=tail.next) {
				currentdata.data.print();
				currentdata=currentdata.next;
			}	
		}
		public int size(){
			return count;
		}
		public Order search(int id){
			Node current=head;
			while(current!=null){
				if (id==current.data.getOrderId()) {
					return current.data;
				}
			}
			return null;
		}
				public void remove(int num){
			if(num==1){
				head=head.next;
			}
			else if(num==size()){
				tail.pre=null;
			}
			else{
				Node current=head;
				int c=0;
				while(c<=num&&num<size()){
					c++;
					current=current.next;
				}
				current.pre.next=current.next.pre;
				current.pre=null;
				current.next=null;
			}
		}
		public double pay(){
			double sum=0;
			Node current=head;
			while(current!=null){
				sum=sum+current.data.getPrice();
			}
			return sum;
		}
	}