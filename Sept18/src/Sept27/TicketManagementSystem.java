package Sept27;
class Ticket{
	int ticketId=101;
	String CustomerName="Yash";
	String EventName="Nacho Event";
	double Price=200;
	void show() {
		System.out.println("Show ticket details are:");
		System.out.println("Ticketid:"+ticketId+"\nCustomerName:"+CustomerName+"\neventname:"+EventName+"\nPrise:"+Price);
		
	}
}
public class TicketManagementSystem {

	public static void main(String[] args) {
		Ticket s=new Ticket();
		s.show();
		

	}

}
