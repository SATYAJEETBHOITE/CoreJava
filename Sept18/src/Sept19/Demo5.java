package Sept19;
class School{
	String Sname="St.Soldier";
	void sprint() {
		System.out.println("School Name:"+Sname);
		
	}
}
class Teachers extends School{
	String teacherName="Ms.Renu";
	void tprint() {
		System.out.println("Teacher Name:"+teacherName);
	}
}
class Branch extends School{
	String bname="Science";
	void bprint() {
		System.out.println("Branch Name:"+bname);
	}
}
class Library extends Branch{
	String lab="chemistry";
	void disp() {
		System.out.println("Library Name:"+lab);
	}
}

public class Demo5 {

	public static void main(String[] args) {
		Library d=new Library();
		Teachers f= new Teachers();
		f.sprint();
		f.tprint();
		d.sprint();
		d.bprint();
		d.disp();
		
		
		
		
		
	}

}
