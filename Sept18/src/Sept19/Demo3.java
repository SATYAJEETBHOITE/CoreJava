package Sept19;

class Company {
	String cname="Infosys";
	String address="Pune Hinjewadi";
}
class Employee extends Company{
	String ename="Satyajeet bhoite";
			String designation="Sr.Developer";
	void info() {
		System.out.println("Employee Name:"+ename+"\nEmployee designation:"+designation);
	}
}
class Department extends Company{
	String deptName="It";
	void disp() {
		System.out.println("Company Name:"+cname+"\nCompany address"+"\nDepartment:"+deptName);
	}
}
public class Demo3{



	public static void main(String[] args) {
		Employee e=new Employee();
		Department d=new Department();
		e.info();
		d.disp();
		
	
	}

}

