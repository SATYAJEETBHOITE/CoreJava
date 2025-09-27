package Sept22;
interface Hotel{
	void info(String hotelName,String address);
	static void details(String ownerName) {
		System.out.println("Owner Name:"+ownerName);
	}
}
 interface Menu{
	 void card(String menus,int price);
	 
	
}
 interface Customer extends Hotel,Menu{
	 void feedback(String comments, int noofikes);
	 
 }
 class Resturant implements Customer{

	@Override
	public void info(String hotelName, String address) {
	
	}

	@Override
	public void card(String menus, int price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void feedback(String comments, int noofikes) {
		// TODO Auto-generated method stub
		
	}
	 
 }

public class Demo4 {

	public static void main(String[] args) {
		
	}

}
