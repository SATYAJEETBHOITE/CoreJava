
package Sept20;
class Rectangle{
	
	int l;int b;
	void calaculateArea(int l,int b) {
		System.out.println("Ara is:"+(l*b));
	}
}
class Square extends Rectangle{
	int s;
	void area(int s) {
		System.out.println("Area is:"+(s*s));
	}
}
public class Test2 {

	public static void main(String[] args) {
		/*Rectangle r=new Rectangle();
		
		r.calaculateArea(10, 20);*/
		
		Square s=new Square();
		s.area(2);
		s.calaculateArea(2, 3);
		
		
	}

}
