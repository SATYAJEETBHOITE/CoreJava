package sept9;
class Yamaha {
	String mname;
	String color;
	void disp(String mname,String color) {
		System.out.println("Mobile name:"+mname+"\nmobile color:"+color);
	}
}

public class Mobile {

	public static void main(String[] args) {
		Yamaha m=new Yamaha();
		m.disp("Iphone","White");
		m.disp("Galaxy m32" , "black");
		

	}

}
