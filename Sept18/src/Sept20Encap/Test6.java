package Sept20Encap;
class Emp{
	private int eId;
	private String ename;
	public int geteId() {
		return eId;
		
	}
	public String geteEname() {
		return ename;
	}
	public String getEname() {
		return ename;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public void setEname(String ename) {
		this.ename=ename;
		
	}

}
public class Test6 {

	public static void main(String[] args) {
		
	Emp e=new Emp();
	
	e.seteId(10);
	e.setEname("Satyajeet");
	System.out.println(e.geteId()+" "+e.geteEname());


}
}
