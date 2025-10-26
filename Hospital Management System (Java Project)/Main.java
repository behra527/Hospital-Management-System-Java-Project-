import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Person admin=new Person("QQQ",987,"Address",111111,"123");
		Room[] room=new Room[3];
		int n3=1;
		room[0]=new Room(1,"Single Bad",2, 8000,false,"WQ",982,"Adss",12211,"111");
		room[1]=new Room(2,"Double Bad",2, 10000,false,"WQ",911,"Adss",33211,"222");
		room[2]=new Room(3,"Double Bad",2, 4000,false,"WQ",911,"Adss",33211,"333");
		Hotal_Management h=new Hotal_Management("kkk",room);
		OrderTree o=new OrderTree();
		Stack<OrderTreeNode> st=new Stack<>();
		Stack<Double> s=new Stack<>();
		LL tt=new LL();
		LL ll=new LL();
		Order d=new Order(1,"1-Ironing",100);
		Order e=new Order(2,"1-Colth-Washing",100);
		Order f=new Order(3,"1-DryClean",500);
		tt.add(d);
		tt.add(e);
		tt.add(f);
		o.insert(1,"Watar",100);
		o.insert(2,"Pizza",899);
		o.insert(3,"QQQ",330);
		o.insert(4,"Piz",99);

		
		do{
			System.out.print("Enter user ID:");
		String id2=in.next();
		while(!isLetter(id2)){
			System.out.println("*****Please enter id only int*******");
			System.out.print("Enter customer name: ");
		    id2=in.next();

		}
		int id =Integer.parseInt(id2);
		System.out.print("Enter password:");
		String password=in.next();
		if(id==admin.getID()&&password.equals(admin.getPassword())){
			System.out.println("****************Welcome Recptionist*********************");
			System.out.println("Press 1 to see all room data");
			System.out.println("Press 2 to change room which check out");
			System.out.println("Press 3 to assign room to new customer");
			System.out.println("Press 4 to enter new food item");
			System.out.println("Press 5 to see food menu");
			System.out.println("Press 6 to enter new room service");
			System.out.println("Press 7 to see all room service");
			System.out.println("Press 0 to logout");
			System.out.println("********************************************************");
			String n4=in.next();
			
		while(!isLetter(n4)){
			System.out.println("*****Please enter choice only int*******");
			System.out.print("Enter your choice again: ");
		    n4=in.next();

		}
		int n =Integer.parseInt(n4);
			System.out.println("********************************************************");
			while (n!=0) {
			switch(n){
			case 1:
				h.display();
					break;
			case 2: 
			System.out.println("********************************************************");
			System.out.print("Enter room Number which is empty now: ");
			int num=in.nextInt();
			while(num<1||num>3){
			System.out.print("Enter room Number which is empty now: ");
			num=in.nextInt();	
			}
				for (int i=0;i<room.length;i++) {
					if(num==room[i].getNum()&&!room[i].getAvailbility()){
						
						room[i]=new Room(room[i].getNum(),room[i].getType(),room[i].getPrice(),true);
						}
					}
				break;
			case 3:
				int i=vvv(room);
				
		if(i!=-1){
		System.out.print("Enter customer name: ");
		String xyz=in.nextLine();
		String name=in.nextLine();
		while(isLetter(name)){
			System.out.println("*****Please enter name only alphabat*******");
			System.out.print("Enter customer name: ");
		    name=in.nextLine();
		}
        
		System.out.print("Enter customer ID: ");
		String yy=in.nextLine();
		while(isNumber(yy)){
			System.out.println("*****Please enter id of int type only*******");
			System.out.print("Enter customer ID: ");
		yy=in.nextLine();
		}
		int dt = Integer.parseInt(yy);
		System.out.print("Enter customer address: ");
		String ad=in.next();
		System.out.print("Enter customer contact: ");
		String yyy=in.nextLine();
		String y2=in.nextLine();
		while(isNumber(y2)|| y2.length()!=7){
			System.out.println("*****Please enter contact of int type only*******");
			if(isNumber(y2)){
			System.out.print("Enter customer contact: ");
		y2=in.nextLine();
	}
	else{
		System.out.println("*****Please enter contact size must equal to 7*******");
		System.out.print("Enter customer contact: ");
		y2=in.nextLine();
	}
		}
		int ct=Integer.parseInt(y2);
		System.out.print("Assign password to customer:");
		String pas=in.next();
		System.out.print("Enter number of day want to stay:");
		int n1=in.nextInt();
		room[i]=new Room(room[i].getNum(),room[i].getType(),n1,room[i].getPrice(),false,name,dt,ad,ct,pas);
					}
			else{
					System.out.println("***************Room Availbility***********************");
					System.out.println("No,Room is avaiable now!");
				}
					break;
				case 4:
					System.out.println("************Food Menu*******************");
					System.out.print("Enter Food code: ");
					String y3=in.next();
					while(isNumber(y3)){
			System.out.println("*****Please enter food code of int type only*******");
			System.out.print("Enter food code: ");
		y3=in.next();
		}
		int y=Integer.parseInt(y3);
					System.out.print("Enter Food name: ");
					String str=in.next();
		while(!isNumber(str)){
			System.out.println("*****Please enter name only alphabat*******");
			System.out.print("Enter Food name: ");
		    str=in.nextLine();
		}
					System.out.print("Enter Food prize: ");
					double r=in.nextDouble();
					o.insert(y,str,r);
					break;
				case 5:
					System.out.println("************Food Menu*******************");
					o.display();
					break;
				case 6:
					System.out.println("************Room Service****************");
					System.out.print("Enter item ID:");
					String x2=in.next();
					while(isNumber(x2)){
			System.out.println("*****Please enter food code of int type only*******");
			System.out.print("Enter item ID: ");
		x2=in.next();
		}
		int x=Integer.parseInt(x2);
					System.out.print("Enter item Name: ");
					String ne=in.next();
					while(!isNumber(ne)){
			System.out.println("*****Please enter food code of int type only*******");
			System.out.print("Enter item name: ");
		ne=in.next();
		}
					System.out.print("Enter Price of item: ");
					double z=in.nextDouble();
					Order g=new Order(x,ne,z);
					tt.add(g);
					break;
				case 7:
					tt.display();
					break;
				default:
					System.out.println("Enter your choice between 0 to 7!");
					break;

				}
			System.out.println("********************************************************");
			System.out.println("Press 1 to see all room data");
			System.out.println("Press 2 to change room which check out");
			System.out.println("Press 3 to assign room to new customer");
			System.out.println("Press 4 to enter new food item");
			System.out.println("Press 5 to see food menu");
			System.out.println("Press 6 to enter new room service");
			System.out.println("Press 7 to see all room service");
			System.out.println("Press 0 to logout");
			System.out.println("********************************************************");
			n=in.nextInt();
			}
		}
		for(int i=0;i<room.length;i++) {
		if(id==room[i].getID()&&password.equals(room[i].getPassword())){
			System.out.println("****************Welcome Customer*********************");
			System.out.println("Press 1 to see personal data");
			System.out.println("Press 2 to Order Food");
			System.out.println("Press 3 to your ordered menu");
			System.out.println("Press 4 to to see total payment");
			System.out.println("Press 5 to avail room service");
			System.out.println("Press 6 to see availed room service");
			System.out.println("Press 7 to check out");
			System.out.println("Press 0 to logout");
			System.out.println("********************************************************");
			int nn=in.nextInt();
while(!s.isEmpty()){
						s.pop();
					}
		while(!st.isEmpty()){
						st.pop();
					}
				while(nn!=0){
					
					switch(nn){

					case 1:
						System.out.println("*****************Personal Info******************");
						room[i].print();
					break; 
				case 2:
					System.out.println("*************Food Menu*******************");
					o.display();
					System.out.println("*****************************************");
					System.out.println("Enter your choice: ");
					int ch=in.nextInt();
					while(ch!=0){
						st.push(o.search(ch));
						OrderTreeNode p=o.search(ch);
						s.push(p.getPrice());
						System.out.println("Enter your choice '0' for exit: ");
					ch=in.nextInt();
					}
				break;
			case 3:
			System.out.println("*******************************************************************");
			while(!st.isEmpty()){
				OrderTreeNode t=st.pop();
				System.out.println("Food ID: " + t.getOrderId() + ", Name: " + t.getName() + ", Price: " + t.getPrice());
			}
			System.out.println("*******************************************************************");
				break;
			case 4:
				System.out.println("******************Payment************************");
				double sum=0;
					while(!s.isEmpty()){
						sum=sum+s.pop();
					}
					System.out.println("Your Room rent is: "+room[i].getPrice());
					System.out.println("Your Room service Charges: "+ll.pay());
					System.out.println("Your Food Charges: "+sum);
					sum=sum+room[i].getPrice();
					System.out.println("*****************************************");
					System.out.println("Your total bill of all things: "+sum);
					break;
			case 5:
					System.out.println("************Room Service************");
					tt.display();
					System.out.println("************************************");
					System.out.print("Enter Item Number: ");
					int a=in.nextInt();
					ll.add(tt.search(a));
			break;
			case 6:
			System.out.println("***************Room Service Avail thing****************");
			ll.display();
			System.out.println("*******************************************************");
			break;
			case 7:
			room[i]=new Room(room[i].getNum(),room[i].getType(),room[i].getPrice(),true);
					break;
			default:
				System.out.println("***********************************");
				System.out.println("Enter your choice between 0 and 7");
					}
			System.out.println("*******************************************************");
			System.out.println("Press 1 to see personal data");
			System.out.println("Press 2 to Order Food");
			System.out.println("Press 3 to your ordered menu");
			System.out.println("Press 4 to to see total payment");
			System.out.println("Press 5 to avail room service");
			System.out.println("Press 6 to see availed room service");
			System.out.println("Press 7 to check out");
			System.out.println("Press 0 to logout");
			System.out.println("********************************************************");
					nn=in.nextInt();
					
				}
			}
		}
		
		System.out.println("************************************");
		System.out.println("Press 1 if you wanted to login again");
		n3=in.nextInt();
	}while(n3==1); 
	}
	private static boolean isLetter(String ch) {
		for (int i=0;i<ch.length();i++) {
			char c=ch.charAt(i);
     
    if(c >= '0' && c <= '9')
    {
    return true;	
    }
}
	return false;
}
private static boolean isNumber(String ch) {
		for (int i=0;i<ch.length();i++) {
			char c=ch.charAt(i);
    if((c >= 'a' && c <= 'z') ||(c >= 'A' && c <= 'Z')){
    	return true;
    }
}
	return false;
}
public static int vvv(Room[] r){
	for (int i=0;i<r.length;i++) {
		if(r[i].getAvailbility()){
			return i;
		}
	}
	return -1;
}
}