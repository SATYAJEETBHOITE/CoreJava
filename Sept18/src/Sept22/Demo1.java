package Sept22;
interface i1{
	void add(int i,int j);
	
}
interface i2{
	void sub(int i, int j);
	
}
//using interface we are implementing multiple inheritance 
interface i3 extends i1,i2{
	void mul(int i, int j);
	
}
class Op implements i3{

	@Override
	public void add(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println("Sum="+(i+j));
		
	}

	@Override
	public void sub(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println("Sub="+(i-j));
		
	}

	@Override
	public void mul(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println("mul="+(i*j));
		
	}
	
	
}
public class Demo1 {

	public static void main(String[] args) {
		Op o=new Op();
		o.add(10, 5);
		o.sub(10, 5);
		o.mul(10,10);
		
		

	}

}
