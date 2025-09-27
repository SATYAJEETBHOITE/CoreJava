package sept9;

public class Product {
	String pname;

	public void info(String pname)  {
		System.out.println("Product name:"+pname);
		
		

	}
	public static void main(String[] args) {
		Product p=new Product();
		p.info("Speaker");
		p.info("bag");
		p.info("saree");
		p.info("shoose");
	}

}
